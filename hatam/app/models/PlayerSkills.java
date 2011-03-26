//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.26 at 01:09:40 PM CET 
//


package models;

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
 *         &lt;element ref="{}StaminaSkill"/>
 *         &lt;element ref="{}KeeperSkill"/>
 *         &lt;element ref="{}PlaymakerSkill"/>
 *         &lt;element ref="{}ScorerSkill"/>
 *         &lt;element ref="{}PassingSkill"/>
 *         &lt;element ref="{}WingerSkill"/>
 *         &lt;element ref="{}DefenderSkill"/>
 *         &lt;element ref="{}SetPiecesSkill"/>
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
    "staminaSkill",
    "keeperSkill",
    "playmakerSkill",
    "scorerSkill",
    "passingSkill",
    "wingerSkill",
    "defenderSkill",
    "setPiecesSkill"
})
@XmlRootElement(name = "PlayerSkills")
public class PlayerSkills {

    @XmlElement(name = "StaminaSkill", required = true)
    protected BigInteger staminaSkill;
    @XmlElement(name = "KeeperSkill", required = true)
    protected BigInteger keeperSkill;
    @XmlElement(name = "PlaymakerSkill", required = true)
    protected BigInteger playmakerSkill;
    @XmlElement(name = "ScorerSkill", required = true)
    protected BigInteger scorerSkill;
    @XmlElement(name = "PassingSkill", required = true)
    protected BigInteger passingSkill;
    @XmlElement(name = "WingerSkill", required = true)
    protected BigInteger wingerSkill;
    @XmlElement(name = "DefenderSkill", required = true)
    protected BigInteger defenderSkill;
    @XmlElement(name = "SetPiecesSkill", required = true)
    protected BigInteger setPiecesSkill;

    /**
     * Gets the value of the staminaSkill property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStaminaSkill() {
        return staminaSkill;
    }

    /**
     * Sets the value of the staminaSkill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStaminaSkill(BigInteger value) {
        this.staminaSkill = value;
    }

    /**
     * Gets the value of the keeperSkill property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKeeperSkill() {
        return keeperSkill;
    }

    /**
     * Sets the value of the keeperSkill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKeeperSkill(BigInteger value) {
        this.keeperSkill = value;
    }

    /**
     * Gets the value of the playmakerSkill property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlaymakerSkill() {
        return playmakerSkill;
    }

    /**
     * Sets the value of the playmakerSkill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlaymakerSkill(BigInteger value) {
        this.playmakerSkill = value;
    }

    /**
     * Gets the value of the scorerSkill property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScorerSkill() {
        return scorerSkill;
    }

    /**
     * Sets the value of the scorerSkill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScorerSkill(BigInteger value) {
        this.scorerSkill = value;
    }

    /**
     * Gets the value of the passingSkill property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassingSkill() {
        return passingSkill;
    }

    /**
     * Sets the value of the passingSkill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassingSkill(BigInteger value) {
        this.passingSkill = value;
    }

    /**
     * Gets the value of the wingerSkill property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWingerSkill() {
        return wingerSkill;
    }

    /**
     * Sets the value of the wingerSkill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWingerSkill(BigInteger value) {
        this.wingerSkill = value;
    }

    /**
     * Gets the value of the defenderSkill property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefenderSkill() {
        return defenderSkill;
    }

    /**
     * Sets the value of the defenderSkill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefenderSkill(BigInteger value) {
        this.defenderSkill = value;
    }

    /**
     * Gets the value of the setPiecesSkill property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSetPiecesSkill() {
        return setPiecesSkill;
    }

    /**
     * Sets the value of the setPiecesSkill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSetPiecesSkill(BigInteger value) {
        this.setPiecesSkill = value;
    }

}
