//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:49:08 AM CEST 
//


package models.teamdetails;

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
 *         &lt;element ref="{}LeagueLevelUnitID"/>
 *         &lt;element ref="{}LeagueLevelUnitName"/>
 *         &lt;element ref="{}LeagueLevel"/>
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
    "leagueLevelUnitID",
    "leagueLevelUnitName",
    "leagueLevel"
})
@XmlRootElement(name = "LeagueLevelUnit")
public class LeagueLevelUnit {

    @XmlElement(name = "LeagueLevelUnitID", required = true)
    protected BigInteger leagueLevelUnitID;
    @XmlElement(name = "LeagueLevelUnitName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String leagueLevelUnitName;
    @XmlElement(name = "LeagueLevel", required = true)
    protected BigInteger leagueLevel;

    /**
     * Gets the value of the leagueLevelUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeagueLevelUnitID() {
        return leagueLevelUnitID;
    }

    /**
     * Sets the value of the leagueLevelUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLeagueLevelUnitID(BigInteger value) {
        this.leagueLevelUnitID = value;
    }

    /**
     * Gets the value of the leagueLevelUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeagueLevelUnitName() {
        return leagueLevelUnitName;
    }

    /**
     * Sets the value of the leagueLevelUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeagueLevelUnitName(String value) {
        this.leagueLevelUnitName = value;
    }

    /**
     * Gets the value of the leagueLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeagueLevel() {
        return leagueLevel;
    }

    /**
     * Sets the value of the leagueLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLeagueLevel(BigInteger value) {
        this.leagueLevel = value;
    }

}
