//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:46:09 AM CEST 
//


package models.matchlineup;

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
 *         &lt;element ref="{}AwayTeamID"/>
 *         &lt;element ref="{}AwayTeamName"/>
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
    "awayTeamID",
    "awayTeamName"
})
@XmlRootElement(name = "AwayTeam")
public class AwayTeam {

    @XmlElement(name = "AwayTeamID", required = true)
    protected BigInteger awayTeamID;
    @XmlElement(name = "AwayTeamName", required = true)
    protected String awayTeamName;

    /**
     * Gets the value of the awayTeamID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAwayTeamID() {
        return awayTeamID;
    }

    /**
     * Sets the value of the awayTeamID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAwayTeamID(BigInteger value) {
        this.awayTeamID = value;
    }

    /**
     * Gets the value of the awayTeamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwayTeamName() {
        return awayTeamName;
    }

    /**
     * Sets the value of the awayTeamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwayTeamName(String value) {
        this.awayTeamName = value;
    }

}
