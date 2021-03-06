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
 *         &lt;element ref="{}StillInCup"/>
 *         &lt;element ref="{}CupID"/>
 *         &lt;element ref="{}CupName"/>
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
    "stillInCup",
    "cupID",
    "cupName"
})
@XmlRootElement(name = "Cup")
public class Cup {

    @XmlElement(name = "StillInCup", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String stillInCup;
    @XmlElement(name = "CupID", required = true)
    protected BigInteger cupID;
    @XmlElement(name = "CupName", required = true)
    protected String cupName;

    /**
     * Gets the value of the stillInCup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStillInCup() {
        return stillInCup;
    }

    /**
     * Sets the value of the stillInCup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStillInCup(String value) {
        this.stillInCup = value;
    }

    /**
     * Gets the value of the cupID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCupID() {
        return cupID;
    }

    /**
     * Sets the value of the cupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCupID(BigInteger value) {
        this.cupID = value;
    }

    /**
     * Gets the value of the cupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCupName() {
        return cupName;
    }

    /**
     * Sets the value of the cupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCupName(String value) {
        this.cupName = value;
    }

}
