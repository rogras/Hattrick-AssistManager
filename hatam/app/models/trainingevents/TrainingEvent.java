//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:49:37 AM CEST 
//


package models.trainingevents;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}SkillID"/>
 *         &lt;element ref="{}OldLevel"/>
 *         &lt;element ref="{}NewLevel"/>
 *         &lt;element ref="{}Season"/>
 *         &lt;element ref="{}MatchRound"/>
 *         &lt;element ref="{}DayNumber"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Index" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    "skillID",
    "oldLevel",
    "newLevel",
    "season",
    "matchRound",
    "dayNumber"
})
@XmlRootElement(name = "TrainingEvent")
public class TrainingEvent {

    @XmlElement(name = "EventDate", required = true)
    protected String eventDate;
    @XmlElement(name = "SkillID", required = true)
    protected BigInteger skillID;
    @XmlElement(name = "OldLevel", required = true)
    protected BigInteger oldLevel;
    @XmlElement(name = "NewLevel", required = true)
    protected BigInteger newLevel;
    @XmlElement(name = "Season", required = true)
    protected BigInteger season;
    @XmlElement(name = "MatchRound", required = true)
    protected BigInteger matchRound;
    @XmlElement(name = "DayNumber", required = true)
    protected BigInteger dayNumber;
    @XmlAttribute(name = "Index", required = true)
    protected BigInteger index;

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
     * Gets the value of the skillID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSkillID() {
        return skillID;
    }

    /**
     * Sets the value of the skillID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSkillID(BigInteger value) {
        this.skillID = value;
    }

    /**
     * Gets the value of the oldLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOldLevel() {
        return oldLevel;
    }

    /**
     * Sets the value of the oldLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOldLevel(BigInteger value) {
        this.oldLevel = value;
    }

    /**
     * Gets the value of the newLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNewLevel() {
        return newLevel;
    }

    /**
     * Sets the value of the newLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNewLevel(BigInteger value) {
        this.newLevel = value;
    }

    /**
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeason(BigInteger value) {
        this.season = value;
    }

    /**
     * Gets the value of the matchRound property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchRound() {
        return matchRound;
    }

    /**
     * Sets the value of the matchRound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchRound(BigInteger value) {
        this.matchRound = value;
    }

    /**
     * Gets the value of the dayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayNumber() {
        return dayNumber;
    }

    /**
     * Sets the value of the dayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayNumber(BigInteger value) {
        this.dayNumber = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

}
