//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:51:16 AM CEST 
//


package models.transfersteam;

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
 *         &lt;element ref="{}BuyerTeamID"/>
 *         &lt;element ref="{}BuyerTeamName"/>
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
    "buyerTeamID",
    "buyerTeamName"
})
@XmlRootElement(name = "Buyer")
public class Buyer {

    @XmlElement(name = "BuyerTeamID", required = true)
    protected BigInteger buyerTeamID;
    @XmlElement(name = "BuyerTeamName", required = true)
    protected String buyerTeamName;

    /**
     * Gets the value of the buyerTeamID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBuyerTeamID() {
        return buyerTeamID;
    }

    /**
     * Sets the value of the buyerTeamID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBuyerTeamID(BigInteger value) {
        this.buyerTeamID = value;
    }

    /**
     * Gets the value of the buyerTeamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerTeamName() {
        return buyerTeamName;
    }

    /**
     * Sets the value of the buyerTeamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerTeamName(String value) {
        this.buyerTeamName = value;
    }

}
