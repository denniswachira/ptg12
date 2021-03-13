//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.13 at 06:56:16 AM EAT 
//


package com.dewcis.ptg.beans;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for trainStopDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trainStopDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trainStation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="meetingPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pickupTimeDelay" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="eta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="arrivalFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trainNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainStopDetails", propOrder = {
    "trainStation",
    "meetingPoint",
    "pickupTimeDelay",
    "eta",
    "arrivalFrom",
    "trainNumber"
})
public class TrainStopDetails {

    @XmlElement(required = true)
    protected String trainStation;
    protected String meetingPoint;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pickupTimeDelay;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eta;
    protected String arrivalFrom;
    protected String trainNumber;

    /**
     * Gets the value of the trainStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainStation() {
        return trainStation;
    }

    /**
     * Sets the value of the trainStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainStation(String value) {
        this.trainStation = value;
    }

    /**
     * Gets the value of the meetingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingPoint() {
        return meetingPoint;
    }

    /**
     * Sets the value of the meetingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingPoint(String value) {
        this.meetingPoint = value;
    }

    /**
     * Gets the value of the pickupTimeDelay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPickupTimeDelay() {
        return pickupTimeDelay;
    }

    /**
     * Sets the value of the pickupTimeDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPickupTimeDelay(BigInteger value) {
        this.pickupTimeDelay = value;
    }

    /**
     * Gets the value of the eta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEta() {
        return eta;
    }

    /**
     * Sets the value of the eta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEta(XMLGregorianCalendar value) {
        this.eta = value;
    }

    /**
     * Gets the value of the arrivalFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalFrom() {
        return arrivalFrom;
    }

    /**
     * Sets the value of the arrivalFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalFrom(String value) {
        this.arrivalFrom = value;
    }

    /**
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

}
