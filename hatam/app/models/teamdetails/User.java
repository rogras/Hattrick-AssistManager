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
 *         &lt;element ref="{}UserID"/>
 *         &lt;element ref="{}Language"/>
 *         &lt;element ref="{}HasSupporter"/>
 *         &lt;element ref="{}Loginname"/>
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}ICQ"/>
 *         &lt;element ref="{}SignupDate"/>
 *         &lt;element ref="{}ActivationDate"/>
 *         &lt;element ref="{}LastLoginDate"/>
 *         &lt;element ref="{}NationalTeamCoach"/>
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
    "userID",
    "language",
    "hasSupporter",
    "loginname",
    "name",
    "icq",
    "signupDate",
    "activationDate",
    "lastLoginDate",
    "nationalTeamCoach"
})
@XmlRootElement(name = "User")
public class User {

    @XmlElement(name = "UserID", required = true)
    protected BigInteger userID;
    @XmlElement(name = "Language", required = true)
    protected Language language;
    @XmlElement(name = "HasSupporter", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String hasSupporter;
    @XmlElement(name = "Loginname", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String loginname;
    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlElement(name = "ICQ", required = true)
    protected ICQ icq;
    @XmlElement(name = "SignupDate", required = true)
    protected String signupDate;
    @XmlElement(name = "ActivationDate", required = true)
    protected String activationDate;
    @XmlElement(name = "LastLoginDate", required = true)
    protected String lastLoginDate;
    @XmlElement(name = "NationalTeamCoach", required = true)
    protected NationalTeamCoach nationalTeamCoach;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserID(BigInteger value) {
        this.userID = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * Gets the value of the hasSupporter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasSupporter() {
        return hasSupporter;
    }

    /**
     * Sets the value of the hasSupporter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasSupporter(String value) {
        this.hasSupporter = value;
    }

    /**
     * Gets the value of the loginname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * Sets the value of the loginname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginname(String value) {
        this.loginname = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the icq property.
     * 
     * @return
     *     possible object is
     *     {@link ICQ }
     *     
     */
    public ICQ getICQ() {
        return icq;
    }

    /**
     * Sets the value of the icq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICQ }
     *     
     */
    public void setICQ(ICQ value) {
        this.icq = value;
    }

    /**
     * Gets the value of the signupDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignupDate() {
        return signupDate;
    }

    /**
     * Sets the value of the signupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignupDate(String value) {
        this.signupDate = value;
    }

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationDate(String value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the lastLoginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * Sets the value of the lastLoginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLoginDate(String value) {
        this.lastLoginDate = value;
    }

    /**
     * Gets the value of the nationalTeamCoach property.
     * 
     * @return
     *     possible object is
     *     {@link NationalTeamCoach }
     *     
     */
    public NationalTeamCoach getNationalTeamCoach() {
        return nationalTeamCoach;
    }

    /**
     * Sets the value of the nationalTeamCoach property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalTeamCoach }
     *     
     */
    public void setNationalTeamCoach(NationalTeamCoach value) {
        this.nationalTeamCoach = value;
    }

}
