//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:56:46 AM CEST 
//


package models.bookmarks;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Text_QNAME = new QName("", "Text");
    private final static QName _FetchedDate_QNAME = new QName("", "FetchedDate");
    private final static QName _Text2_QNAME = new QName("", "Text2");
    private final static QName _FileName_QNAME = new QName("", "FileName");
    private final static QName _ObjectID_QNAME = new QName("", "ObjectID");
    private final static QName _ObjectID2_QNAME = new QName("", "ObjectID2");
    private final static QName _UserID_QNAME = new QName("", "UserID");
    private final static QName _BookmarkTypeID_QNAME = new QName("", "BookmarkTypeID");
    private final static QName _Version_QNAME = new QName("", "Version");
    private final static QName _BookmarkID_QNAME = new QName("", "BookmarkID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HattrickData }
     * 
     */
    public HattrickData createHattrickData() {
        return new HattrickData();
    }

    /**
     * Create an instance of {@link BookmarkList }
     * 
     */
    public BookmarkList createBookmarkList() {
        return new BookmarkList();
    }

    /**
     * Create an instance of {@link ObjectID3 }
     * 
     */
    public ObjectID3 createObjectID3() {
        return new ObjectID3();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link Bookmark }
     * 
     */
    public Bookmark createBookmark() {
        return new Bookmark();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Text")
    public JAXBElement<String> createText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FetchedDate")
    public JAXBElement<String> createFetchedDate(String value) {
        return new JAXBElement<String>(_FetchedDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Text2")
    public JAXBElement<String> createText2(String value) {
        return new JAXBElement<String>(_Text2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFileName(String value) {
        return new JAXBElement<String>(_FileName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ObjectID")
    public JAXBElement<BigInteger> createObjectID(BigInteger value) {
        return new JAXBElement<BigInteger>(_ObjectID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ObjectID2")
    public JAXBElement<String> createObjectID2(String value) {
        return new JAXBElement<String>(_ObjectID2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UserID")
    public JAXBElement<BigInteger> createUserID(BigInteger value) {
        return new JAXBElement<BigInteger>(_UserID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookmarkTypeID")
    public JAXBElement<BigInteger> createBookmarkTypeID(BigInteger value) {
        return new JAXBElement<BigInteger>(_BookmarkTypeID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Version")
    public JAXBElement<BigDecimal> createVersion(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Version_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookmarkID")
    public JAXBElement<BigInteger> createBookmarkID(BigInteger value) {
        return new JAXBElement<BigInteger>(_BookmarkID_QNAME, BigInteger.class, null, value);
    }

}
