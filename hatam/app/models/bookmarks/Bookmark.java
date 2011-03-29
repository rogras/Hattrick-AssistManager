//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:56:46 AM CEST 
//


package models.bookmarks;

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
 *         &lt;element ref="{}BookmarkID"/>
 *         &lt;element ref="{}BookmarkTypeID"/>
 *         &lt;element ref="{}Text"/>
 *         &lt;element ref="{}Text2"/>
 *         &lt;element ref="{}ObjectID"/>
 *         &lt;element ref="{}ObjectID2"/>
 *         &lt;element ref="{}ObjectID3"/>
 *         &lt;element ref="{}Comment"/>
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
    "bookmarkID",
    "bookmarkTypeID",
    "text",
    "text2",
    "objectID",
    "objectID2",
    "objectID3",
    "comment"
})
@XmlRootElement(name = "Bookmark")
public class Bookmark {

    @XmlElement(name = "BookmarkID", required = true)
    protected BigInteger bookmarkID;
    @XmlElement(name = "BookmarkTypeID", required = true)
    protected BigInteger bookmarkTypeID;
    @XmlElement(name = "Text", required = true)
    protected String text;
    @XmlElement(name = "Text2", required = true)
    protected String text2;
    @XmlElement(name = "ObjectID", required = true)
    protected BigInteger objectID;
    @XmlElement(name = "ObjectID2", required = true)
    protected String objectID2;
    @XmlElement(name = "ObjectID3", required = true)
    protected ObjectID3 objectID3;
    @XmlElement(name = "Comment", required = true)
    protected Comment comment;

    /**
     * Gets the value of the bookmarkID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBookmarkID() {
        return bookmarkID;
    }

    /**
     * Sets the value of the bookmarkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBookmarkID(BigInteger value) {
        this.bookmarkID = value;
    }

    /**
     * Gets the value of the bookmarkTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBookmarkTypeID() {
        return bookmarkTypeID;
    }

    /**
     * Sets the value of the bookmarkTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBookmarkTypeID(BigInteger value) {
        this.bookmarkTypeID = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the text2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText2() {
        return text2;
    }

    /**
     * Sets the value of the text2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText2(String value) {
        this.text2 = value;
    }

    /**
     * Gets the value of the objectID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObjectID(BigInteger value) {
        this.objectID = value;
    }

    /**
     * Gets the value of the objectID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectID2() {
        return objectID2;
    }

    /**
     * Sets the value of the objectID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectID2(String value) {
        this.objectID2 = value;
    }

    /**
     * Gets the value of the objectID3 property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID3 }
     *     
     */
    public ObjectID3 getObjectID3() {
        return objectID3;
    }

    /**
     * Sets the value of the objectID3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID3 }
     *     
     */
    public void setObjectID3(ObjectID3 value) {
        this.objectID3 = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

}