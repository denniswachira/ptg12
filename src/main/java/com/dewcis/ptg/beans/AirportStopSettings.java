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
 * <p>Java class for airportStopSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="airportStopSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultPickupTimeDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="airlineRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="flightNumberRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="arrivalFromRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "airportStopSettings", propOrder = {
    "defaultPickupTimeDelay",
    "airlineRequired",
    "flightNumberRequired",
    "arrivalFromRequired"
})
public class AirportStopSettings {

    protected Integer defaultPickupTimeDelay;
    protected boolean airlineRequired;
    protected boolean flightNumberRequired;
    protected boolean arrivalFromRequired;

    /**
     * Gets the value of the defaultPickupTimeDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultPickupTimeDelay() {
        return defaultPickupTimeDelay;
    }

    /**
     * Sets the value of the defaultPickupTimeDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultPickupTimeDelay(Integer value) {
        this.defaultPickupTimeDelay = value;
    }

    /**
     * Gets the value of the airlineRequired property.
     * 
     */
    public boolean isAirlineRequired() {
        return airlineRequired;
    }

    /**
     * Sets the value of the airlineRequired property.
     * 
     */
    public void setAirlineRequired(boolean value) {
        this.airlineRequired = value;
    }

    /**
     * Gets the value of the flightNumberRequired property.
     * 
     */
    public boolean isFlightNumberRequired() {
        return flightNumberRequired;
    }

    /**
     * Sets the value of the flightNumberRequired property.
     * 
     */
    public void setFlightNumberRequired(boolean value) {
        this.flightNumberRequired = value;
    }

    /**
     * Gets the value of the arrivalFromRequired property.
     * 
     */
    public boolean isArrivalFromRequired() {
        return arrivalFromRequired;
    }

    /**
     * Sets the value of the arrivalFromRequired property.
     * 
     */
    public void setArrivalFromRequired(boolean value) {
        this.arrivalFromRequired = value;
    }

}
