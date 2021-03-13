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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>Java class for bookJobResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookJobResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.haulmont.com/sherlock/adler}jobValidationResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="redirectInfo" type="{http://www.haulmont.com/sherlock/adler}redirectInfo" minOccurs="0"/&gt;
 *         &lt;element name="senderJobInfo" type="{http://www.haulmont.com/sherlock/adler}jobInfo" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.haulmont.com/sherlock/adler}price" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookJobResponse", propOrder = {
    "redirectInfo",
    "senderJobInfo",
    "price"
})
@XmlRootElement(name = "BookJobResponse")
public class BookJobResponse
    extends JobValidationResponse
{

    protected RedirectInfo redirectInfo;
    protected JobInfo senderJobInfo;
    protected Price price;

    /**
     * Gets the value of the redirectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RedirectInfo }
     *     
     */
    public RedirectInfo getRedirectInfo() {
        return redirectInfo;
    }

    /**
     * Sets the value of the redirectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectInfo }
     *     
     */
    public void setRedirectInfo(RedirectInfo value) {
        this.redirectInfo = value;
    }

    /**
     * Gets the value of the senderJobInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JobInfo }
     *     
     */
    public JobInfo getSenderJobInfo() {
        return senderJobInfo;
    }

    /**
     * Sets the value of the senderJobInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobInfo }
     *     
     */
    public void setSenderJobInfo(JobInfo value) {
        this.senderJobInfo = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

}
