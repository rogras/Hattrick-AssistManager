//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:44:15 AM CEST 
//


package models.matchdetails;

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
 *         &lt;element ref="{}WeatherID"/>
 *         &lt;element ref="{}SoldTotal"/>
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
    "weatherID",
    "soldTotal"
})
@XmlRootElement(name = "Arena")
public class Arena {

    @XmlElement(name = "ArenaID", required = true)
    protected BigInteger arenaID;
    @XmlElement(name = "ArenaName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String arenaName;
    @XmlElement(name = "WeatherID", required = true)
    protected BigInteger weatherID;
    @XmlElement(name = "SoldTotal", required = true)
    protected BigInteger soldTotal;

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
     * Gets the value of the weatherID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeatherID() {
        return weatherID;
    }

    /**
     * Sets the value of the weatherID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeatherID(BigInteger value) {
        this.weatherID = value;
    }

    /**
     * Gets the value of the soldTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSoldTotal() {
        return soldTotal;
    }

    /**
     * Sets the value of the soldTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSoldTotal(BigInteger value) {
        this.soldTotal = value;
    }

}
