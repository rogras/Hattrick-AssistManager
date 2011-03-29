//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:51:16 AM CEST 
//


package models.transfersteam;

import java.math.BigDecimal;
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
 *         &lt;element ref="{}FileName"/>
 *         &lt;element ref="{}Version"/>
 *         &lt;element ref="{}UserID"/>
 *         &lt;element ref="{}FetchedDate"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{}Team"/>
 *             &lt;element ref="{}Stats"/>
 *             &lt;element ref="{}Transfers"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{}UserIsSupporter"/>
 *             &lt;element ref="{}UserHasClubHouse"/>
 *             &lt;element ref="{}Player"/>
 *           &lt;/sequence>
 *         &lt;/choice>
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
    "fileName",
    "version",
    "userID",
    "fetchedDate",
    "team",
    "stats",
    "transfers",
    "userIsSupporter",
    "userHasClubHouse",
    "player"
})
@XmlRootElement(name = "HattrickData")
public class HattrickData {

    @XmlElement(name = "FileName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String fileName;
    @XmlElement(name = "Version", required = true)
    protected BigDecimal version;
    @XmlElement(name = "UserID", required = true)
    protected BigInteger userID;
    @XmlElement(name = "FetchedDate", required = true)
    protected String fetchedDate;
    @XmlElement(name = "Team")
    protected Team team;
    @XmlElement(name = "Stats")
    protected Stats stats;
    @XmlElement(name = "Transfers")
    protected Transfers transfers;
    @XmlElement(name = "UserIsSupporter")
    protected BigInteger userIsSupporter;
    @XmlElement(name = "UserHasClubHouse")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String userHasClubHouse;
    @XmlElement(name = "Player")
    protected Player player;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

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
     * Gets the value of the fetchedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFetchedDate() {
        return fetchedDate;
    }

    /**
     * Sets the value of the fetchedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetchedDate(String value) {
        this.fetchedDate = value;
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
     * Gets the value of the stats property.
     * 
     * @return
     *     possible object is
     *     {@link Stats }
     *     
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * Sets the value of the stats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stats }
     *     
     */
    public void setStats(Stats value) {
        this.stats = value;
    }

    /**
     * Gets the value of the transfers property.
     * 
     * @return
     *     possible object is
     *     {@link Transfers }
     *     
     */
    public Transfers getTransfers() {
        return transfers;
    }

    /**
     * Sets the value of the transfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transfers }
     *     
     */
    public void setTransfers(Transfers value) {
        this.transfers = value;
    }

    /**
     * Gets the value of the userIsSupporter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserIsSupporter() {
        return userIsSupporter;
    }

    /**
     * Sets the value of the userIsSupporter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserIsSupporter(BigInteger value) {
        this.userIsSupporter = value;
    }

    /**
     * Gets the value of the userHasClubHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserHasClubHouse() {
        return userHasClubHouse;
    }

    /**
     * Sets the value of the userHasClubHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserHasClubHouse(String value) {
        this.userHasClubHouse = value;
    }

    /**
     * Gets the value of the player property.
     * 
     * @return
     *     possible object is
     *     {@link Player }
     *     
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets the value of the player property.
     * 
     * @param value
     *     allowed object is
     *     {@link Player }
     *     
     */
    public void setPlayer(Player value) {
        this.player = value;
    }

}
