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
 *         &lt;element ref="{}AwayTeamID"/>
 *         &lt;element ref="{}AwayTeamName"/>
 *         &lt;element ref="{}Dress"/>
 *         &lt;element ref="{}AwayGoals"/>
 *         &lt;element ref="{}TacticType"/>
 *         &lt;element ref="{}TacticSkill"/>
 *         &lt;element ref="{}RatingMidfield"/>
 *         &lt;element ref="{}RatingRightDef"/>
 *         &lt;element ref="{}RatingMidDef"/>
 *         &lt;element ref="{}RatingLeftDef"/>
 *         &lt;element ref="{}RatingRightAtt"/>
 *         &lt;element ref="{}RatingMidAtt"/>
 *         &lt;element ref="{}RatingLeftAtt"/>
 *         &lt;element ref="{}TeamAttitude"/>
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
    "awayTeamName",
    "dress",
    "awayGoals",
    "tacticType",
    "tacticSkill",
    "ratingMidfield",
    "ratingRightDef",
    "ratingMidDef",
    "ratingLeftDef",
    "ratingRightAtt",
    "ratingMidAtt",
    "ratingLeftAtt",
    "teamAttitude"
})
@XmlRootElement(name = "AwayTeam")
public class AwayTeam {

    @XmlElement(name = "AwayTeamID", required = true)
    protected BigInteger awayTeamID;
    @XmlElement(name = "AwayTeamName", required = true)
    protected String awayTeamName;
    @XmlElement(name = "Dress", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String dress;
    @XmlElement(name = "AwayGoals", required = true)
    protected BigInteger awayGoals;
    @XmlElement(name = "TacticType", required = true)
    protected BigInteger tacticType;
    @XmlElement(name = "TacticSkill", required = true)
    protected BigInteger tacticSkill;
    @XmlElement(name = "RatingMidfield", required = true)
    protected BigInteger ratingMidfield;
    @XmlElement(name = "RatingRightDef", required = true)
    protected BigInteger ratingRightDef;
    @XmlElement(name = "RatingMidDef", required = true)
    protected BigInteger ratingMidDef;
    @XmlElement(name = "RatingLeftDef", required = true)
    protected BigInteger ratingLeftDef;
    @XmlElement(name = "RatingRightAtt", required = true)
    protected BigInteger ratingRightAtt;
    @XmlElement(name = "RatingMidAtt", required = true)
    protected BigInteger ratingMidAtt;
    @XmlElement(name = "RatingLeftAtt", required = true)
    protected BigInteger ratingLeftAtt;
    @XmlElement(name = "TeamAttitude", required = true)
    protected BigInteger teamAttitude;

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

    /**
     * Gets the value of the dress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDress() {
        return dress;
    }

    /**
     * Sets the value of the dress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDress(String value) {
        this.dress = value;
    }

    /**
     * Gets the value of the awayGoals property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAwayGoals() {
        return awayGoals;
    }

    /**
     * Sets the value of the awayGoals property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAwayGoals(BigInteger value) {
        this.awayGoals = value;
    }

    /**
     * Gets the value of the tacticType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTacticType() {
        return tacticType;
    }

    /**
     * Sets the value of the tacticType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTacticType(BigInteger value) {
        this.tacticType = value;
    }

    /**
     * Gets the value of the tacticSkill property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTacticSkill() {
        return tacticSkill;
    }

    /**
     * Sets the value of the tacticSkill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTacticSkill(BigInteger value) {
        this.tacticSkill = value;
    }

    /**
     * Gets the value of the ratingMidfield property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRatingMidfield() {
        return ratingMidfield;
    }

    /**
     * Sets the value of the ratingMidfield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRatingMidfield(BigInteger value) {
        this.ratingMidfield = value;
    }

    /**
     * Gets the value of the ratingRightDef property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRatingRightDef() {
        return ratingRightDef;
    }

    /**
     * Sets the value of the ratingRightDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRatingRightDef(BigInteger value) {
        this.ratingRightDef = value;
    }

    /**
     * Gets the value of the ratingMidDef property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRatingMidDef() {
        return ratingMidDef;
    }

    /**
     * Sets the value of the ratingMidDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRatingMidDef(BigInteger value) {
        this.ratingMidDef = value;
    }

    /**
     * Gets the value of the ratingLeftDef property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRatingLeftDef() {
        return ratingLeftDef;
    }

    /**
     * Sets the value of the ratingLeftDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRatingLeftDef(BigInteger value) {
        this.ratingLeftDef = value;
    }

    /**
     * Gets the value of the ratingRightAtt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRatingRightAtt() {
        return ratingRightAtt;
    }

    /**
     * Sets the value of the ratingRightAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRatingRightAtt(BigInteger value) {
        this.ratingRightAtt = value;
    }

    /**
     * Gets the value of the ratingMidAtt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRatingMidAtt() {
        return ratingMidAtt;
    }

    /**
     * Sets the value of the ratingMidAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRatingMidAtt(BigInteger value) {
        this.ratingMidAtt = value;
    }

    /**
     * Gets the value of the ratingLeftAtt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRatingLeftAtt() {
        return ratingLeftAtt;
    }

    /**
     * Sets the value of the ratingLeftAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRatingLeftAtt(BigInteger value) {
        this.ratingLeftAtt = value;
    }

    /**
     * Gets the value of the teamAttitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTeamAttitude() {
        return teamAttitude;
    }

    /**
     * Sets the value of the teamAttitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTeamAttitude(BigInteger value) {
        this.teamAttitude = value;
    }

}