//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.26 at 01:08:41 PM CET 
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
 *         &lt;element ref="{}ScorerPlayerID"/>
 *         &lt;element ref="{}ScorerPlayerName"/>
 *         &lt;element ref="{}ScorerTeamID"/>
 *         &lt;element ref="{}ScorerHomeGoals"/>
 *         &lt;element ref="{}ScorerAwayGoals"/>
 *         &lt;element ref="{}ScorerMinute"/>
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
    "scorerPlayerID",
    "scorerPlayerName",
    "scorerTeamID",
    "scorerHomeGoals",
    "scorerAwayGoals",
    "scorerMinute"
})
@XmlRootElement(name = "Goal")
public class Goal {

    @XmlElement(name = "ScorerPlayerID", required = true)
    protected BigInteger scorerPlayerID;
    @XmlElement(name = "ScorerPlayerName", required = true)
    protected String scorerPlayerName;
    @XmlElement(name = "ScorerTeamID", required = true)
    protected BigInteger scorerTeamID;
    @XmlElement(name = "ScorerHomeGoals", required = true)
    protected BigInteger scorerHomeGoals;
    @XmlElement(name = "ScorerAwayGoals", required = true)
    protected BigInteger scorerAwayGoals;
    @XmlElement(name = "ScorerMinute", required = true)
    protected BigInteger scorerMinute;

    /**
     * Gets the value of the scorerPlayerID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScorerPlayerID() {
        return scorerPlayerID;
    }

    /**
     * Sets the value of the scorerPlayerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScorerPlayerID(BigInteger value) {
        this.scorerPlayerID = value;
    }

    /**
     * Gets the value of the scorerPlayerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorerPlayerName() {
        return scorerPlayerName;
    }

    /**
     * Sets the value of the scorerPlayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorerPlayerName(String value) {
        this.scorerPlayerName = value;
    }

    /**
     * Gets the value of the scorerTeamID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScorerTeamID() {
        return scorerTeamID;
    }

    /**
     * Sets the value of the scorerTeamID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScorerTeamID(BigInteger value) {
        this.scorerTeamID = value;
    }

    /**
     * Gets the value of the scorerHomeGoals property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScorerHomeGoals() {
        return scorerHomeGoals;
    }

    /**
     * Sets the value of the scorerHomeGoals property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScorerHomeGoals(BigInteger value) {
        this.scorerHomeGoals = value;
    }

    /**
     * Gets the value of the scorerAwayGoals property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScorerAwayGoals() {
        return scorerAwayGoals;
    }

    /**
     * Sets the value of the scorerAwayGoals property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScorerAwayGoals(BigInteger value) {
        this.scorerAwayGoals = value;
    }

    /**
     * Gets the value of the scorerMinute property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScorerMinute() {
        return scorerMinute;
    }

    /**
     * Sets the value of the scorerMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScorerMinute(BigInteger value) {
        this.scorerMinute = value;
    }

}
