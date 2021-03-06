//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:43:24 AM CEST 
//


package models.liguefixtures;

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
 *         &lt;element ref="{}MatchID"/>
 *         &lt;element ref="{}MatchRound"/>
 *         &lt;element ref="{}HomeTeam"/>
 *         &lt;element ref="{}AwayTeam"/>
 *         &lt;element ref="{}MatchDate"/>
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
    "matchID",
    "matchRound",
    "homeTeam",
    "awayTeam",
    "matchDate"
})
@XmlRootElement(name = "Match")
public class Match {

    @XmlElement(name = "MatchID", required = true)
    protected BigInteger matchID;
    @XmlElement(name = "MatchRound", required = true)
    protected BigInteger matchRound;
    @XmlElement(name = "HomeTeam", required = true)
    protected HomeTeam homeTeam;
    @XmlElement(name = "AwayTeam", required = true)
    protected AwayTeam awayTeam;
    @XmlElement(name = "MatchDate", required = true)
    protected String matchDate;

    /**
     * Gets the value of the matchID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchID() {
        return matchID;
    }

    /**
     * Sets the value of the matchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchID(BigInteger value) {
        this.matchID = value;
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
     * Gets the value of the homeTeam property.
     * 
     * @return
     *     possible object is
     *     {@link HomeTeam }
     *     
     */
    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    /**
     * Sets the value of the homeTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomeTeam }
     *     
     */
    public void setHomeTeam(HomeTeam value) {
        this.homeTeam = value;
    }

    /**
     * Gets the value of the awayTeam property.
     * 
     * @return
     *     possible object is
     *     {@link AwayTeam }
     *     
     */
    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    /**
     * Sets the value of the awayTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwayTeam }
     *     
     */
    public void setAwayTeam(AwayTeam value) {
        this.awayTeam = value;
    }

    /**
     * Gets the value of the matchDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchDate() {
        return matchDate;
    }

    /**
     * Sets the value of the matchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchDate(String value) {
        this.matchDate = value;
    }

}
