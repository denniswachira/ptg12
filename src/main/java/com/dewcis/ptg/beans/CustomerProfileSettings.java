//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.13 at 06:56:16 AM EAT 
//


package com.dewcis.ptg.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerProfileSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerProfileSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="used" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showPrompts" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mustBeInList" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerProfileSettings", propOrder = {
    "used",
    "showPrompts",
    "mustBeInList",
    "tag"
})
public class CustomerProfileSettings {

    protected boolean used;
    protected boolean showPrompts;
    protected boolean mustBeInList;
    protected String tag;

    /**
     * Gets the value of the used property.
     * 
     */
    public boolean isUsed() {
        return used;
    }

    /**
     * Sets the value of the used property.
     * 
     */
    public void setUsed(boolean value) {
        this.used = value;
    }

    /**
     * Gets the value of the showPrompts property.
     * 
     */
    public boolean isShowPrompts() {
        return showPrompts;
    }

    /**
     * Sets the value of the showPrompts property.
     * 
     */
    public void setShowPrompts(boolean value) {
        this.showPrompts = value;
    }

    /**
     * Gets the value of the mustBeInList property.
     * 
     */
    public boolean isMustBeInList() {
        return mustBeInList;
    }

    /**
     * Sets the value of the mustBeInList property.
     * 
     */
    public void setMustBeInList(boolean value) {
        this.mustBeInList = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

}
