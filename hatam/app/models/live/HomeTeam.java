//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:43:54 AM CEST 
//


package models.live;

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
 *         &lt;element ref="{}HomeTeamID"/>
 *         &lt;element ref="{}HomeTeamName"/>
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
    "homeTeamID",
    "homeTeamName"
})
@XmlRootElement(name = "HomeTeam")
public class HomeTeam {

    @XmlElement(name = "HomeTeamID", required = true)
    protected BigInteger homeTeamID;
    @XmlElement(name = "HomeTeamName", required = true)
    protected String homeTeamName;

    /**
     * Gets the value of the homeTeamID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHomeTeamID() {
        return homeTeamID;
    }

    /**
     * Sets the value of the homeTeamID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHomeTeamID(BigInteger value) {
        this.homeTeamID = value;
    }

    /**
     * Gets the value of the homeTeamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeTeamName() {
        return homeTeamName;
    }

    /**
     * Sets the value of the homeTeamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeTeamName(String value) {
        this.homeTeamName = value;
    }

}
