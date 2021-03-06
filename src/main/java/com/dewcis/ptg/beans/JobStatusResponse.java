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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for jobStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.haulmont.com/sherlock/adler}response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jobStatus" type="{http://www.haulmont.com/sherlock/adler}jobStatus"/&gt;
 *         &lt;element name="driver" type="{http://www.haulmont.com/sherlock/adler}jobDriverInfo" minOccurs="0"/&gt;
 *         &lt;element name="driverEta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobStatusResponse", propOrder = {
    "jobStatus",
    "driver",
    "driverEta"
})
@XmlRootElement(name = "JobStatusResponse")
public class JobStatusResponse
    extends Response
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected JobStatus jobStatus;
    protected JobDriverInfo driver;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar driverEta;

    /**
     * Gets the value of the jobStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JobStatus }
     *     
     */
    public JobStatus getJobStatus() {
        return jobStatus;
    }

    /**
     * Sets the value of the jobStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStatus }
     *     
     */
    public void setJobStatus(JobStatus value) {
        this.jobStatus = value;
    }

    /**
     * Gets the value of the driver property.
     * 
     * @return
     *     possible object is
     *     {@link JobDriverInfo }
     *     
     */
    public JobDriverInfo getDriver() {
        return driver;
    }

    /**
     * Sets the value of the driver property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobDriverInfo }
     *     
     */
    public void setDriver(JobDriverInfo value) {
        this.driver = value;
    }

    /**
     * Gets the value of the driverEta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDriverEta() {
        return driverEta;
    }

    /**
     * Sets the value of the driverEta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDriverEta(XMLGregorianCalendar value) {
        this.driverEta = value;
    }

}
