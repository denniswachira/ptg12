//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.13 at 06:56:16 AM EAT 
//


package com.dewcis.ptg.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>Java class for accountInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.haulmont.com/sherlock/adler}response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{http://www.haulmont.com/sherlock/adler}account"/&gt;
 *         &lt;element name="callers" type="{http://www.haulmont.com/sherlock/adler}individualWithStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="allLoaded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountInfoResponse", propOrder = {
    "account",
    "callers",
    "allLoaded"
})
@XmlRootElement(name = "AccountInfoResponse")
public class AccountInfoResponse
    extends Response
{

    @XmlElement(required = true)
    protected Account account;
    protected List<IndividualWithStatus> callers;
    protected boolean allLoaded;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the callers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualWithStatus }
     * 
     * 
     */
    public List<IndividualWithStatus> getCallers() {
        if (callers == null) {
            callers = new ArrayList<IndividualWithStatus>();
        }
        return this.callers;
    }

    /**
     * Gets the value of the allLoaded property.
     * 
     */
    public boolean isAllLoaded() {
        return allLoaded;
    }

    /**
     * Sets the value of the allLoaded property.
     * 
     */
    public void setAllLoaded(boolean value) {
        this.allLoaded = value;
    }

}
