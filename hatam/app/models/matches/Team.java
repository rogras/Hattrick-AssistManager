//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:45:45 AM CEST 
//


package models.matches;

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
 *         &lt;element ref="{}TeamID"/>
 *         &lt;element ref="{}TeamName"/>
 *         &lt;element ref="{}MatchList"/>
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
    "teamID",
    "teamName",
    "matchList"
})
@XmlRootElement(name = "Team")
public class Team {

    @XmlElement(name = "TeamID", required = true)
    protected BigInteger teamID;
    @XmlElement(name = "TeamName", required = true)
    protected String teamName;
    @XmlElement(name = "MatchList", required = true)
    protected MatchList matchList;

    /**
     * Gets the value of the teamID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTeamID() {
        return teamID;
    }

    /**
     * Sets the value of the teamID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTeamID(BigInteger value) {
        this.teamID = value;
    }

    /**
     * Gets the value of the teamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the value of the teamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

    /**
     * Gets the value of the matchList property.
     * 
     * @return
     *     possible object is
     *     {@link MatchList }
     *     
     */
    public MatchList getMatchList() {
        return matchList;
    }

    /**
     * Sets the value of the matchList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchList }
     *     
     */
    public void setMatchList(MatchList value) {
        this.matchList = value;
    }

}
