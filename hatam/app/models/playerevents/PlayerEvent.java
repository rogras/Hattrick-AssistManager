//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:47:48 AM CEST 
//


package models.playerevents;

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
 *         &lt;element ref="{}EventDate"/>
 *         &lt;element ref="{}PlayerEventTypeID"/>
 *         &lt;element ref="{}EventText"/>
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
    "eventDate",
    "playerEventTypeID",
    "eventText"
})
@XmlRootElement(name = "PlayerEvent")
public class PlayerEvent {

    @XmlElement(name = "EventDate", required = true)
    protected String eventDate;
    @XmlElement(name = "PlayerEventTypeID", required = true)
    protected BigInteger playerEventTypeID;
    @XmlElement(name = "EventText", required = true)
    protected String eventText;

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDate(String value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the playerEventTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayerEventTypeID() {
        return playerEventTypeID;
    }

    /**
     * Sets the value of the playerEventTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayerEventTypeID(BigInteger value) {
        this.playerEventTypeID = value;
    }

    /**
     * Gets the value of the eventText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventText() {
        return eventText;
    }

    /**
     * Sets the value of the eventText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventText(String value) {
        this.eventText = value;
    }

}
