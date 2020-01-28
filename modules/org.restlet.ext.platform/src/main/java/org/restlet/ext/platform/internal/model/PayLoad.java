/**
 * Copyright 2005-2020 Talend
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or or EPL 1.0 (the "Licenses"). You can
 * select the license that you prefer but you may not use this file except in
 * compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * https://restlet.com/open-source/
 * 
 * Restlet is a registered trademark of Talend S.A.
 */

package org.restlet.ext.platform.internal.model;

/**
 * Represents the entity sent in HTTP request/response body
 * 
 * @author Cyprien Quilici
 */
public class PayLoad {

    /**
     * Indicates whether you should provide an array of [type] or just one
     * [type].
     */
    private boolean array;

    /** Textual description of this entity. */
    private String description;

    /** Reference of the representation in the body of the message. */
    private String type;

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public boolean isArray() {
        return array;
    }

    public void setArray(boolean array) {
        this.array = array;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String representation) {
        this.type = representation;
    }
}
