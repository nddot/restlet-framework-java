/*
 * Copyright 2005-2008 Noelios Consulting.
 * 
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License (the "License"). You may not use this file except in
 * compliance with the License.
 * 
 * You can obtain a copy of the license at
 * http://www.opensource.org/licenses/cddl1.txt See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing Covered Code, include this CDDL HEADER in each file and
 * include the License file at http://www.opensource.org/licenses/cddl1.txt If
 * applicable, add the following below this CDDL HEADER, with the fields
 * enclosed by brackets "[]" replaced with your own identifying information:
 * Portions Copyright [yyyy] [name of copyright owner]
 */

package org.restlet.gwt;

import java.util.Arrays;
import java.util.List;

import org.restlet.gwt.data.Protocol;
import org.restlet.gwt.data.Request;
import org.restlet.gwt.data.Response;
import org.restlet.gwt.util.Engine;
import org.restlet.gwt.util.Helper;

/**
 * Connector acting as a generic client. It internally uses one of the available
 * connectors registered with the current Restlet implementation.
 * 
 * @author Jerome Louvel (contact@noelios.com)
 */
public class Client extends Connector {
    /** The helper provided by the implementation. */
    private volatile Helper<Client> helper;

    /**
     * Constructor.
     * 
     * @param context
     *                The context.
     * @param protocols
     *                The connector protocols.
     */
    public Client(Context context, List<Protocol> protocols) {
        this(context, protocols, null);
    }

    /**
     * Constructor.
     * 
     * @param context
     *                The context.
     * @param protocols
     *                The connector protocols.
     * @param helperClass
     *                Optional helper class name.
     */
    public Client(Context context, List<Protocol> protocols, String helperClass) {
        super(context, protocols);

        if ((protocols != null) && (protocols.size() > 0)) {
            if (Engine.getInstance() != null) {
                this.helper = Engine.getInstance().createHelper(this,
                        helperClass);
            }
        }
    }

    /**
     * Constructor.
     * 
     * @param context
     *                The context.
     * @param protocol
     *                The connector protocol.
     */
    public Client(Context context, Protocol protocol) {
        this(context, (protocol == null) ? null : Arrays.asList(protocol), null);
    }

    /**
     * Constructor.
     * 
     * @param protocols
     *                The connector protocols.
     */
    public Client(List<Protocol> protocols) {
        this(null, protocols, null);
    }

    /**
     * Constructor.
     * 
     * @param protocol
     *                The connector protocol.
     */
    public Client(Protocol protocol) {
        this(null, protocol);
    }

    /**
     * Returns the helper provided by the implementation.
     * 
     * @return The helper provided by the implementation.
     */
    private Helper<Client> getHelper() {
        return this.helper;
    }

    @Override
    public void handle(Request request, Response response) {
        super.handle(request, response);

        if (getHelper() != null)
            getHelper().handle(request, response);
    }

    @Override
    public synchronized void start() throws Exception {
        if (isStopped()) {
            super.start();
            if (getHelper() != null)
                getHelper().start();
        }
    }

    @Override
    public synchronized void stop() throws Exception {
        if (isStarted()) {
            if (getHelper() != null)
                getHelper().stop();
            super.stop();
        }
    }

}