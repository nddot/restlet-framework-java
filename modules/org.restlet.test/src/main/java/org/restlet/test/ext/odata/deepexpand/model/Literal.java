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
 * https://restlet.talend.com/
 * 
 * Restlet is a registered trademark of Talend S.A.
 */

package org.restlet.test.ext.odata.deepexpand.model;

import org.restlet.test.ext.odata.deepexpand.model.Language;
import org.restlet.test.ext.odata.deepexpand.model.Multilingual;

/**
 * Generated by the generator tool for the OData extension for the Restlet
 * framework.<br>
 * 
 * @see <a
 *      href="http://praktiki.metal.ntua.gr/CoopOData/CoopOData.svc/$metadata">Metadata
 *      of the target OData service</a>
 * 
 */
public class Literal {

    private int id;

    private boolean isDefault;

    private String text;

    private Language language;

    private Multilingual multilingual;

    /**
     * Constructor without parameter.
     * 
     */
    public Literal() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public Literal(int id) {
        this();
        this.id = id;
    }

    /**
     * Returns the value of the "id" attribute.
     * 
     * @return The value of the "id" attribute.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the value of the "isDefault" attribute.
     * 
     * @return The value of the "isDefault" attribute.
     */
    public boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Returns the value of the "text" attribute.
     * 
     * @return The value of the "text" attribute.
     */
    public String getText() {
        return text;
    }

    /**
     * Returns the value of the "language" attribute.
     * 
     * @return The value of the "language" attribute.
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Returns the value of the "multilingual" attribute.
     * 
     * @return The value of the "multilingual" attribute.
     */
    public Multilingual getMultilingual() {
        return multilingual;
    }

    /**
     * Sets the value of the "id" attribute.
     * 
     * @param id
     *            The value of the "id" attribute.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the value of the "isDefault" attribute.
     * 
     * @param isDefault
     *            The value of the "isDefault" attribute.
     */
    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Sets the value of the "text" attribute.
     * 
     * @param text
     *            The value of the "text" attribute.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets the value of the "language" attribute.
     * 
     * @param language
     *            " The value of the "language" attribute.
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     * Sets the value of the "multilingual" attribute.
     * 
     * @param multilingual
     *            " The value of the "multilingual" attribute.
     */
    public void setMultilingual(Multilingual multilingual) {
        this.multilingual = multilingual;
    }

}