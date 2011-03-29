//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:41:26 AM CEST 
//


package models.club;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}KeeperTrainers"/>
 *         &lt;element ref="{}AssistantTrainers"/>
 *         &lt;element ref="{}Psychologists"/>
 *         &lt;element ref="{}PressSpokesmen"/>
 *         &lt;element ref="{}Economists"/>
 *         &lt;element ref="{}Physiotherapists"/>
 *         &lt;element ref="{}Doctors"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keeperTrainers",
    "assistantTrainers",
    "psychologists",
    "pressSpokesmen",
    "economists",
    "physiotherapists",
    "doctors"
})
@XmlRootElement(name = "Specialists")
public class Specialists {

    @XmlElement(name = "KeeperTrainers", required = true)
    protected BigInteger keeperTrainers;
    @XmlElement(name = "AssistantTrainers", required = true)
    protected BigInteger assistantTrainers;
    @XmlElement(name = "Psychologists", required = true)
    protected BigInteger psychologists;
    @XmlElement(name = "PressSpokesmen", required = true)
    protected BigInteger pressSpokesmen;
    @XmlElement(name = "Economists", required = true)
    protected BigInteger economists;
    @XmlElement(name = "Physiotherapists", required = true)
    protected BigInteger physiotherapists;
    @XmlElement(name = "Doctors", required = true)
    protected BigInteger doctors;

    /**
     * Gets the value of the keeperTrainers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKeeperTrainers() {
        return keeperTrainers;
    }

    /**
     * Sets the value of the keeperTrainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKeeperTrainers(BigInteger value) {
        this.keeperTrainers = value;
    }

    /**
     * Gets the value of the assistantTrainers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssistantTrainers() {
        return assistantTrainers;
    }

    /**
     * Sets the value of the assistantTrainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssistantTrainers(BigInteger value) {
        this.assistantTrainers = value;
    }

    /**
     * Gets the value of the psychologists property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPsychologists() {
        return psychologists;
    }

    /**
     * Sets the value of the psychologists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPsychologists(BigInteger value) {
        this.psychologists = value;
    }

    /**
     * Gets the value of the pressSpokesmen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPressSpokesmen() {
        return pressSpokesmen;
    }

    /**
     * Sets the value of the pressSpokesmen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPressSpokesmen(BigInteger value) {
        this.pressSpokesmen = value;
    }

    /**
     * Gets the value of the economists property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEconomists() {
        return economists;
    }

    /**
     * Sets the value of the economists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEconomists(BigInteger value) {
        this.economists = value;
    }

    /**
     * Gets the value of the physiotherapists property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhysiotherapists() {
        return physiotherapists;
    }

    /**
     * Sets the value of the physiotherapists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhysiotherapists(BigInteger value) {
        this.physiotherapists = value;
    }

    /**
     * Gets the value of the doctors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDoctors() {
        return doctors;
    }

    /**
     * Sets the value of the doctors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDoctors(BigInteger value) {
        this.doctors = value;
    }

}