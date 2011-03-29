//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.26 at 08:23:39 PM CET 
//


package models.achivements;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}AchievementTypeID"/>
 *         &lt;element ref="{}AchievementText"/>
 *         &lt;element ref="{}CategoryID"/>
 *         &lt;element ref="{}EventDate"/>
 *         &lt;element ref="{}Points"/>
 *         &lt;element ref="{}MultiLevel"/>
 *         &lt;element ref="{}NumberOfEvents"/>
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
    "achievementTypeID",
    "achievementText",
    "categoryID",
    "eventDate",
    "points",
    "multiLevel",
    "numberOfEvents"
})
@XmlRootElement(name = "Achievement")
public class Achievement {

    @XmlElement(name = "AchievementTypeID", required = true)
    protected BigInteger achievementTypeID;
    @XmlElement(name = "AchievementText", required = true)
    protected String achievementText;
    @XmlElement(name = "CategoryID", required = true)
    protected BigInteger categoryID;
    @XmlElement(name = "EventDate", required = true)
    protected String eventDate;
    @XmlElement(name = "Points", required = true)
    protected BigInteger points;
    @XmlElement(name = "MultiLevel", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String multiLevel;
    @XmlElement(name = "NumberOfEvents", required = true)
    protected BigInteger numberOfEvents;

    /**
     * Gets the value of the achievementTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAchievementTypeID() {
        return achievementTypeID;
    }

    /**
     * Sets the value of the achievementTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAchievementTypeID(BigInteger value) {
        this.achievementTypeID = value;
    }

    /**
     * Gets the value of the achievementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchievementText() {
        return achievementText;
    }

    /**
     * Sets the value of the achievementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchievementText(String value) {
        this.achievementText = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategoryID(BigInteger value) {
        this.categoryID = value;
    }

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
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPoints(BigInteger value) {
        this.points = value;
    }

    /**
     * Gets the value of the multiLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiLevel() {
        return multiLevel;
    }

    /**
     * Sets the value of the multiLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiLevel(String value) {
        this.multiLevel = value;
    }

    /**
     * Gets the value of the numberOfEvents property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfEvents() {
        return numberOfEvents;
    }

    /**
     * Sets the value of the numberOfEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfEvents(BigInteger value) {
        this.numberOfEvents = value;
    }

}