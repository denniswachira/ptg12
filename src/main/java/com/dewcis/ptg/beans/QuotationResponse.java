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
 * <p>Java class for quotationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="quotationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.haulmont.com/sherlock/adler}jobValidationResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pickupStatistics" type="{http://www.haulmont.com/sherlock/adler}pickupStatistics" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.haulmont.com/sherlock/adler}price" minOccurs="0"/&gt;
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="journeyTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "quotationResponse", propOrder = {
    "pickupStatistics",
    "price",
    "distance",
    "journeyTime",
    "fare"
})
public class QuotationResponse
    extends JobValidationResponse
{

    protected PickupStatistics pickupStatistics;
    protected Price price;
    protected Double distance;
    protected Integer journeyTime;
    protected Fare fare;

    /**
     * Gets the value of the pickupStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link PickupStatistics }
     *     
     */
    public PickupStatistics getPickupStatistics() {
        return pickupStatistics;
    }

    /**
     * Sets the value of the pickupStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupStatistics }
     *     
     */
    public void setPickupStatistics(PickupStatistics value) {
        this.pickupStatistics = value;
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
