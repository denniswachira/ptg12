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
 * <p>Java class for customerBookingSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerBookingSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="airportSettings" type="{http://www.haulmont.com/sherlock/adler}airportStopSettings"/&gt;
 *         &lt;element name="trainSettings" type="{http://www.haulmont.com/sherlock/adler}trainStopSettings"/&gt;
 *         &lt;element name="pinSettings" type="{http://www.haulmont.com/sherlock/adler}customerProfileSettings"/&gt;
 *         &lt;element name="callerSettings" type="{http://www.haulmont.com/sherlock/adler}customerProfileSettings"/&gt;
 *         &lt;element name="contactSettings" type="{http://www.haulmont.com/sherlock/adler}customerProfileSettings"/&gt;
 *         &lt;element name="passengerSettings" type="{http://www.haulmont.com/sherlock/adler}customerProfileSettings"/&gt;
 *         &lt;element name="cvcRequiredSettings" type="{http://www.haulmont.com/sherlock/adler}cvcRequiredSettings"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerBookingSettings", propOrder = {
    "referenceUsed",
    "airportSettings",
    "trainSettings",
    "pinSettings",
    "callerSettings",
    "contactSettings",
    "passengerSettings",
    "cvcRequiredSettings"
})
public class CustomerBookingSettings {

    protected boolean referenceUsed;
    @XmlElement(required = true)
    protected AirportStopSettings airportSettings;
    @XmlElement(required = true)
    protected TrainStopSettings trainSettings;
    @XmlElement(required = true)
    protected CustomerProfileSettings pinSettings;
    @XmlElement(required = true)
    protected CustomerProfileSettings callerSettings;
    @XmlElement(required = true)
    protected CustomerProfileSettings contactSettings;
    @XmlElement(required = true)
    protected CustomerProfileSettings passengerSettings;
    @XmlElement(required = true)
    protected CvcRequiredSettings cvcRequiredSettings;

    /**
     * Gets the value of the referenceUsed property.
     * 
     */
    public boolean isReferenceUsed() {
        return referenceUsed;
    }

    /**
     * Sets the value of the referenceUsed property.
     * 
     */
    public void setReferenceUsed(boolean value) {
        this.referenceUsed = value;
    }

    /**
     * Gets the value of the airportSettings property.
     * 
     * @return
     *     possible object is
     *     {@link AirportStopSettings }
     *     
     */
    public AirportStopSettings getAirportSettings() {
        return airportSettings;
    }

    /**
     * Sets the value of the airportSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportStopSettings }
     *     
     */
    public void setAirportSettings(AirportStopSettings value) {
        this.airportSettings = value;
    }

    /**
     * Gets the value of the trainSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TrainStopSettings }
     *     
     */
    public TrainStopSettings getTrainSettings() {
        return trainSettings;
    }

    /**
     * Sets the value of the trainSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainStopSettings }
     *     
     */
    public void setTrainSettings(TrainStopSettings value) {
        this.trainSettings = value;
    }

    /**
     * Gets the value of the pinSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileSettings }
     *     
     */
    public CustomerProfileSettings getPinSettings() {
        return pinSettings;
    }

    /**
     * Sets the value of the pinSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileSettings }
     *     
     */
    public void setPinSettings(CustomerProfileSettings value) {
        this.pinSettings = value;
    }

    /**
     * Gets the value of the callerSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileSettings }
     *     
     */
    public CustomerProfileSettings getCallerSettings() {
        return callerSettings;
    }

    /**
     * Sets the value of the callerSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileSettings }
     *     
     */
    public void setCallerSettings(CustomerProfileSettings value) {
        this.callerSettings = value;
    }

    /**
     * Gets the value of the contactSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileSettings }
     *     
     */
    public CustomerProfileSettings getContactSettings() {
        return contactSettings;
    }

    /**
     * Sets the value of the contactSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileSettings }
     *     
     */
    public void setContactSettings(CustomerProfileSettings value) {
        this.contactSettings = value;
    }

    /**
     * Gets the value of the passengerSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileSettings }
     *     
     */
    public CustomerProfileSettings getPassengerSettings() {
        return passengerSettings;
    }

    /**
     * Sets the value of the passengerSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileSettings }
     *     
     */
    public void setPassengerSettings(CustomerProfileSettings value) {
        this.passengerSettings = value;
    }

    /**
     * Gets the value of the cvcRequiredSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CvcRequiredSettings }
     *     
     */
    public CvcRequiredSettings getCvcRequiredSettings() {
        return cvcRequiredSettings;
    }

    /**
     * Sets the value of the cvcRequiredSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CvcRequiredSettings }
     *     
     */
    public void setCvcRequiredSettings(CvcRequiredSettings value) {
        this.cvcRequiredSettings = value;
    }

}
