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
 *         &lt;element ref="{}PlayerID"/>
 *         &lt;element ref="{}PlayerEvents"/>
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
    "playerID",
    "playerEvents"
})
@XmlRootElement(name = "Player")
public class Player {

    @XmlElement(name = "PlayerID", required = true)
    protected BigInteger playerID;
    @XmlElement(name = "PlayerEvents", required = true)
    protected PlayerEvents playerEvents;

    /**
     * Gets the value of the playerID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayerID() {
        return playerID;
    }

    /**
     * Sets the value of the playerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayerID(BigInteger value) {
        this.playerID = value;
    }

    /**
     * Gets the value of the playerEvents property.
     * 
     * @return
     *     possible object is
     *     {@link PlayerEvents }
     *     
     */
    public PlayerEvents getPlayerEvents() {
        return playerEvents;
    }

    /**
     * Sets the value of the playerEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayerEvents }
     *     
     */
    public void setPlayerEvents(PlayerEvents value) {
        this.playerEvents = value;
    }

}