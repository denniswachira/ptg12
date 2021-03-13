//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.13 at 06:56:16 AM EAT 
//


package com.dewcis.ptg.beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receiptResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiptResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.haulmont.com/sherlock/adler}jobValidationResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="extraStopsPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="pickupWaitingTimePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="stopsWaitingTimePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://www.haulmont.com/sherlock/adler}jobExtra" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxes" type="{http://www.haulmont.com/sherlock/adler}tax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="charges" type="{http://www.haulmont.com/sherlock/adler}charge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fare" type="{http://www.haulmont.com/sherlock/adler}fare" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiptResponse", propOrder = {
    "basePrice",
    "extraStopsPrice",
    "pickupWaitingTimePrice",
    "stopsWaitingTimePrice",
    "discount",
    "totalPrice",
    "currency",
    "extras",
    "taxes",
    "charges",
    "fare"
})
@XmlSeeAlso({
    JobPriceDetailsResponse.class
})
public class ReceiptResponse
    extends JobValidationResponse
{

    protected BigDecimal basePrice;
    protected BigDecimal extraStopsPrice;
    protected BigDecimal pickupWaitingTimePrice;
    protected BigDecimal stopsWaitingTimePrice;
    protected BigDecimal discount;
    protected BigDecimal totalPrice;
    protected String currency;
    protected List<JobExtra> extras;
    protected List<Tax> taxes;
    protected List<Charge> charges;
    protected Fare fare;

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasePrice(BigDecimal value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the extraStopsPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtraStopsPrice() {
        return extraStopsPrice;
    }

    /**
     * Sets the value of the extraStopsPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtraStopsPrice(BigDecimal value) {
        this.extraStopsPrice = value;
    }

    /**
     * Gets the value of the pickupWaitingTimePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPickupWaitingTimePrice() {
        return pickupWaitingTimePrice;
    }

    /**
     * Sets the value of the pickupWaitingTimePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPickupWaitingTimePrice(BigDecimal value) {
        this.pickupWaitingTimePrice = value;
    }

    /**
     * Gets the value of the stopsWaitingTimePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStopsWaitingTimePrice() {
        return stopsWaitingTimePrice;
    }

    /**
     * Sets the value of the stopsWaitingTimePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStopsWaitingTimePrice(BigDecimal value) {
        this.stopsWaitingTimePrice = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the extras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobExtra }
     * 
     * 
     */
    public List<JobExtra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<JobExtra>();
        }
        return this.extras;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax }
     * 
     * 
     */
    public List<Tax> getTaxes() {
        if (taxes == null) {
            taxes = new ArrayList<Tax>();
        }
        return this.taxes;
    }

    /**
     * Gets the value of the charges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge }
     * 
     * 
     */
    public List<Charge> getCharges() {
        if (charges == null) {
            charges = new ArrayList<Charge>();
        }
        return this.charges;
    }

    /**
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link Fare }
     *     
     */
    public Fare getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fare }
     *     
     */
    public void setFare(Fare value) {
        this.fare = value;
    }

}
