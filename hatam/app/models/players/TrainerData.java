//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:48:19 AM CEST 
//


package models.players;

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
 *         &lt;element ref="{}TrainerType"/>
 *         &lt;element ref="{}TrainerSkill"/>
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
    "trainerType",
    "trainerSkill"
})
@XmlRootElement(name = "TrainerData")
public class TrainerData {

    @XmlElement(name = "TrainerType", required = true)
    protected BigInteger trainerType;
    @XmlElement(name = "TrainerSkill", required = true)
    protected BigInteger trainerSkill;

    /**
     * Gets the value of the trainerType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrainerType() {
        return trainerType;
    }

    /**
     * Sets the value of the trainerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrainerType(BigInteger value) {
        this.trainerType = value;
    }

    /**
     * Gets the value of the trainerSkill property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrainerSkill() {
        return trainerSkill;
    }

    /**
     * Sets the value of the trainerSkill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrainerSkill(BigInteger value) {
        this.trainerSkill = value;
    }

}