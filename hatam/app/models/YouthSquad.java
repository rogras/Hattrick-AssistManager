//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.26 at 01:06:56 PM CET 
//


package models;

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
 *         &lt;element ref="{}Investment"/>
 *         &lt;element ref="{}HasPromoted"/>
 *         &lt;element ref="{}YouthLevel"/>
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
    "investment",
    "hasPromoted",
    "youthLevel"
})
@XmlRootElement(name = "YouthSquad")
public class YouthSquad {

    @XmlElement(name = "Investment", required = true)
    protected BigInteger investment;
    @XmlElement(name = "HasPromoted", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String hasPromoted;
    @XmlElement(name = "YouthLevel", required = true)
    protected BigInteger youthLevel;

    /**
     * Gets the value of the investment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInvestment() {
        return investment;
    }

    /**
     * Sets the value of the investment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInvestment(BigInteger value) {
        this.investment = value;
    }

    /**
     * Gets the value of the hasPromoted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasPromoted() {
        return hasPromoted;
    }

    /**
     * Sets the value of the hasPromoted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasPromoted(String value) {
        this.hasPromoted = value;
    }

    /**
     * Gets the value of the youthLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYouthLevel() {
        return youthLevel;
    }

    /**
     * Sets the value of the youthLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYouthLevel(BigInteger value) {
        this.youthLevel = value;
    }

}
