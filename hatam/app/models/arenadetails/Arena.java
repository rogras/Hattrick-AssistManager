//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.26 at 08:24:34 PM CET 
//


package models.arenadetails;

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
 *         &lt;element ref="{}ArenaID"/>
 *         &lt;element ref="{}ArenaName"/>
 *         &lt;element ref="{}Team"/>
 *         &lt;element ref="{}League"/>
 *         &lt;element ref="{}Region"/>
 *         &lt;element ref="{}CurrentCapacity"/>
 *         &lt;element ref="{}ExpandedCapacity"/>
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
    "arenaID",
    "arenaName",
    "team",
    "league",
    "region",
    "currentCapacity",
    "expandedCapacity"
})
@XmlRootElement(name = "Arena")
public class Arena {

    @XmlElement(name = "ArenaID", required = true)
    protected BigInteger arenaID;
    @XmlElement(name = "ArenaName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String arenaName;
    @XmlElement(name = "Team", required = true)
    protected Team team;
    @XmlElement(name = "League", required = true)
    protected League league;
    @XmlElement(name = "Region", required = true)
    protected Region region;
    @XmlElement(name = "CurrentCapacity", required = true)
    protected CurrentCapacity currentCapacity;
    @XmlElement(name = "ExpandedCapacity", required = true)
    protected ExpandedCapacity expandedCapacity;

    /**
     * Gets the value of the arenaID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArenaID() {
        return arenaID;
    }

    /**
     * Sets the value of the arenaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArenaID(BigInteger value) {
        this.arenaID = value;
    }

    /**
     * Gets the value of the arenaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArenaName() {
        return arenaName;
    }

    /**
     * Sets the value of the arenaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArenaName(String value) {
        this.arenaName = value;
    }

    /**
     * Gets the value of the team property.
     * 
     * @return
     *     possible object is
     *     {@link Team }
     *     
     */
    public Team getTeam() {
        return team;
    }

    /**
     * Sets the value of the team property.
     * 
     * @param value
     *     allowed object is
     *     {@link Team }
     *     
     */
    public void setTeam(Team value) {
        this.team = value;
    }

    /**
     * Gets the value of the league property.
     * 
     * @return
     *     possible object is
     *     {@link League }
     *     
     */
    public League getLeague() {
        return league;
    }

    /**
     * Sets the value of the league property.
     * 
     * @param value
     *     allowed object is
     *     {@link League }
     *     
     */
    public void setLeague(League value) {
        this.league = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link Region }
     *     
     */
    public Region getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link Region }
     *     
     */
    public void setRegion(Region value) {
        this.region = value;
    }

    /**
     * Gets the value of the currentCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentCapacity }
     *     
     */
    public CurrentCapacity getCurrentCapacity() {
        return currentCapacity;
    }

    /**
     * Sets the value of the currentCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentCapacity }
     *     
     */
    public void setCurrentCapacity(CurrentCapacity value) {
        this.currentCapacity = value;
    }

    /**
     * Gets the value of the expandedCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link ExpandedCapacity }
     *     
     */
    public ExpandedCapacity getExpandedCapacity() {
        return expandedCapacity;
    }

    /**
     * Sets the value of the expandedCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpandedCapacity }
     *     
     */
    public void setExpandedCapacity(ExpandedCapacity value) {
        this.expandedCapacity = value;
    }

}