//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.13 at 06:56:16 AM EAT 
//


package com.dewcis.ptg.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for referenceValidationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="referenceValidationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mandatoryPassed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mustBeInListPassed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="patternPassed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceValidationInfo", propOrder = {
    "entityName",
    "mandatoryPassed",
    "mustBeInListPassed",
    "patternPassed"
})
public class ReferenceValidationInfo {

    @XmlElement(required = true)
    protected String entityName;
    protected boolean mandatoryPassed;
    protected boolean mustBeInListPassed;
    protected boolean patternPassed;

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the mandatoryPassed property.
     * 
     */
    public boolean isMandatoryPassed() {
        return mandatoryPassed;
    }

    /**
     * Sets the value of the mandatoryPassed property.
     * 
     */
    public void setMandatoryPassed(boolean value) {
        this.mandatoryPassed = value;
    }

    /**
     * Gets the value of the mustBeInListPassed property.
     * 
     */
    public boolean isMustBeInListPassed() {
        return mustBeInListPassed;
    }

    /**
     * Sets the value of the mustBeInListPassed property.
     * 
     */
    public void setMustBeInListPassed(boolean value) {
        this.mustBeInListPassed = value;
    }

    /**
     * Gets the value of the patternPassed property.
     * 
     */
    public boolean isPatternPassed() {
        return patternPassed;
    }

    /**
     * Sets the value of the patternPassed property.
     * 
     */
    public void setPatternPassed(boolean value) {
        this.patternPassed = value;
    }

}
