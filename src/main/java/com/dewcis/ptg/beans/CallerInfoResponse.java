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
 * <p>Java class for callerInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callerInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.haulmont.com/sherlock/adler}response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caller" type="{http://www.haulmont.com/sherlock/adler}individualWithStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callerInfoResponse", propOrder = {
    "caller"
})
public class CallerInfoResponse
    extends Response
{

    @XmlElement(required = true)
    protected IndividualWithStatus caller;

    /**
     * Gets the value of the caller property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualWithStatus }
     *     
     */
    public IndividualWithStatus getCaller() {
        return caller;
    }

    /**
     * Sets the value of the caller property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualWithStatus }
     *     
     */
    public void setCaller(IndividualWithStatus value) {
        this.caller = value;
    }

}
