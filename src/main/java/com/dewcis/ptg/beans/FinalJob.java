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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for finalJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="finalJob"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.haulmont.com/sherlock/adler}baseJob"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stops" type="{http://www.haulmont.com/sherlock/adler}finalStop" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extras" type="{http://www.haulmont.com/sherlock/adler}jobExtra" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.haulmont.com/sherlock/adler}price" minOccurs="0"/&gt;
 *         &lt;element name="basePrice" type="{http://www.haulmont.com/sherlock/adler}price" minOccurs="0"/&gt;
 *         &lt;element name="extraStopsPrice" type="{http://www.haulmont.com/sherlock/adler}price" minOccurs="0"/&gt;
 *         &lt;element name="pickupWaitingTimePrice" type="{http://www.haulmont.com/sherlock/adler}price" minOccurs="0"/&gt;
 *         &lt;element name="stopsWaitingTimePrice" type="{http://www.haulmont.com/sherlock/adler}price" minOccurs="0"/&gt;
 *         &lt;element name="discount" type="{http://www.haulmont.com/sherlock/adler}price" minOccurs="0"/&gt;
 *         &lt;element name="extraPrice" type="{http://www.haulmont.com/sherlock/adler}price" minOccurs="0"/&gt;
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="journeyTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cancelledWithCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "finalJob", propOrder = {
    "stops",
    "extras",
    "price",
    "basePrice",
    "extraStopsPrice",
    "pickupWaitingTimePrice",
    "stopsWaitingTimePrice",
    "discount",
    "extraPrice",
    "distance",
    "journeyTime",
    "cancelledWithCharge",
    "fare"
})
public class FinalJob
    extends BaseJob
{

    protected List<FinalStop> stops;
    protected List<JobExtra> extras;
    protected Price price;
    protected Price basePrice;
    protected Price extraStopsPrice;
    protected Price pickupWaitingTimePrice;
    protected Price stopsWaitingTimePrice;
    protected Price discount;
    protected Price extraPrice;
    protected Double distance;
    protected Integer journeyTime;
    protected Boolean cancelledWithCharge;
    protected Fare fare;

    /**
     * Gets the value of the stops property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stops property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStops().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinalStop }
     * 
     * 
     */
    public List<FinalStop> getStops() {
        if (stops == null) {
            stops = new ArrayList<FinalStop>();
        }
        return this.stops;
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

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setBasePrice(Price value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the extraStopsPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getExtraStopsPrice() {
        return extraStopsPrice;
    }

    /**
     * Sets the value of the extraStopsPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setExtraStopsPrice(Price value) {
        this.extraStopsPrice = value;
    }

    /**
     * Gets the value of the pickupWaitingTimePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPickupWaitingTimePrice() {
        return pickupWaitingTimePrice;
    }

    /**
     * Sets the value of the pickupWaitingTimePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPickupWaitingTimePrice(Price value) {
        this.pickupWaitingTimePrice = value;
    }

    /**
     * Gets the value of the stopsWaitingTimePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getStopsWaitingTimePrice() {
        return stopsWaitingTimePrice;
    }

    /**
     * Sets the value of the stopsWaitingTimePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setStopsWaitingTimePrice(Price value) {
        this.stopsWaitingTimePrice = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setDiscount(Price value) {
        this.discount = value;
    }

    /**
     * Gets the value of the extraPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getExtraPrice() {
        return extraPrice;
    }

    /**
     * Sets the value of the extraPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setExtraPrice(Price value) {
        this.extraPrice = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistance(Double value) {
        this.distance = value;
    }

    /**
     * Gets the value of the journeyTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJourneyTime() {
        return journeyTime;
    }

    /**
     * Sets the value of the journeyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJourneyTime(Integer value) {
        this.journeyTime = value;
    }

    /**
     * Gets the value of the cancelledWithCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelledWithCharge() {
        return cancelledWithCharge;
    }

    /**
     * Sets the value of the cancelledWithCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelledWithCharge(Boolean value) {
        this.cancelledWithCharge = value;
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
