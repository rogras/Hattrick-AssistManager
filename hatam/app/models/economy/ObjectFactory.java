//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:41:40 AM CEST 
//


package models.economy;

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

    private final static QName _FetchedDate_QNAME = new QName("", "FetchedDate");
    private final static QName _IncomeSponsors_QNAME = new QName("", "IncomeSponsors");
    private final static QName _UserID_QNAME = new QName("", "UserID");
    private final static QName _IncomeSum_QNAME = new QName("", "IncomeSum");
    private final static QName _ExpectedCash_QNAME = new QName("", "ExpectedCash");
    private final static QName _CostsFinancial_QNAME = new QName("", "CostsFinancial");
    private final static QName _TeamName_QNAME = new QName("", "TeamName");
    private final static QName _TeamID_QNAME = new QName("", "TeamID");
    private final static QName _LastCostsPlayers_QNAME = new QName("", "LastCostsPlayers");
    private final static QName _CostsArena_QNAME = new QName("", "CostsArena");
    private final static QName _LastIncomeTemporary_QNAME = new QName("", "LastIncomeTemporary");
    private final static QName _LastCostsTemporary_QNAME = new QName("", "LastCostsTemporary");
    private final static QName _CostsTemporary_QNAME = new QName("", "CostsTemporary");
    private final static QName _LastCostsSum_QNAME = new QName("", "LastCostsSum");
    private final static QName _Cash_QNAME = new QName("", "Cash");
    private final static QName _Version_QNAME = new QName("", "Version");
    private final static QName _CostsYouth_QNAME = new QName("", "CostsYouth");
    private final static QName _LastWeeksTotal_QNAME = new QName("", "LastWeeksTotal");
    private final static QName _CostsSum_QNAME = new QName("", "CostsSum");
    private final static QName _IncomeTemporary_QNAME = new QName("", "IncomeTemporary");
    private final static QName _IncomeSpectators_QNAME = new QName("", "IncomeSpectators");
    private final static QName _IncomeFinancial_QNAME = new QName("", "IncomeFinancial");
    private final static QName _ExpectedWeeksTotal_QNAME = new QName("", "ExpectedWeeksTotal");
    private final static QName _LastIncomeSponsors_QNAME = new QName("", "LastIncomeSponsors");
    private final static QName _LastCostsStaff_QNAME = new QName("", "LastCostsStaff");
    private final static QName _FanClubSize_QNAME = new QName("", "FanClubSize");
    private final static QName _LastIncomeSum_QNAME = new QName("", "LastIncomeSum");
    private final static QName _CostsPlayers_QNAME = new QName("", "CostsPlayers");
    private final static QName _FileName_QNAME = new QName("", "FileName");
    private final static QName _LastIncomeSpectators_QNAME = new QName("", "LastIncomeSpectators");
    private final static QName _CostsStaff_QNAME = new QName("", "CostsStaff");
    private final static QName _LastCostsYouth_QNAME = new QName("", "LastCostsYouth");
    private final static QName _LastCostsArena_QNAME = new QName("", "LastCostsArena");
    private final static QName _LastCostsFinancial_QNAME = new QName("", "LastCostsFinancial");
    private final static QName _LastIncomeFinancial_QNAME = new QName("", "LastIncomeFinancial");

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
     * Create an instance of {@link SupportersPopularity }
     * 
     */
    public SupportersPopularity createSupportersPopularity() {
        return new SupportersPopularity();
    }

    /**
     * Create an instance of {@link Team }
     * 
     */
    public Team createTeam() {
        return new Team();
    }

    /**
     * Create an instance of {@link SponsorsPopularity }
     * 
     */
    public SponsorsPopularity createSponsorsPopularity() {
        return new SponsorsPopularity();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IncomeSponsors")
    public JAXBElement<BigInteger> createIncomeSponsors(BigInteger value) {
        return new JAXBElement<BigInteger>(_IncomeSponsors_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "IncomeSum")
    public JAXBElement<BigInteger> createIncomeSum(BigInteger value) {
        return new JAXBElement<BigInteger>(_IncomeSum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ExpectedCash")
    public JAXBElement<BigInteger> createExpectedCash(BigInteger value) {
        return new JAXBElement<BigInteger>(_ExpectedCash_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CostsFinancial")
    public JAXBElement<BigInteger> createCostsFinancial(BigInteger value) {
        return new JAXBElement<BigInteger>(_CostsFinancial_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TeamName")
    public JAXBElement<String> createTeamName(String value) {
        return new JAXBElement<String>(_TeamName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TeamID")
    public JAXBElement<BigInteger> createTeamID(BigInteger value) {
        return new JAXBElement<BigInteger>(_TeamID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastCostsPlayers")
    public JAXBElement<BigInteger> createLastCostsPlayers(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastCostsPlayers_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CostsArena")
    public JAXBElement<BigInteger> createCostsArena(BigInteger value) {
        return new JAXBElement<BigInteger>(_CostsArena_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastIncomeTemporary")
    public JAXBElement<BigInteger> createLastIncomeTemporary(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastIncomeTemporary_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastCostsTemporary")
    public JAXBElement<BigInteger> createLastCostsTemporary(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastCostsTemporary_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CostsTemporary")
    public JAXBElement<BigInteger> createCostsTemporary(BigInteger value) {
        return new JAXBElement<BigInteger>(_CostsTemporary_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastCostsSum")
    public JAXBElement<BigInteger> createLastCostsSum(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastCostsSum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cash")
    public JAXBElement<BigInteger> createCash(BigInteger value) {
        return new JAXBElement<BigInteger>(_Cash_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "CostsYouth")
    public JAXBElement<BigInteger> createCostsYouth(BigInteger value) {
        return new JAXBElement<BigInteger>(_CostsYouth_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastWeeksTotal")
    public JAXBElement<BigInteger> createLastWeeksTotal(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastWeeksTotal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CostsSum")
    public JAXBElement<BigInteger> createCostsSum(BigInteger value) {
        return new JAXBElement<BigInteger>(_CostsSum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IncomeTemporary")
    public JAXBElement<BigInteger> createIncomeTemporary(BigInteger value) {
        return new JAXBElement<BigInteger>(_IncomeTemporary_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IncomeSpectators")
    public JAXBElement<BigInteger> createIncomeSpectators(BigInteger value) {
        return new JAXBElement<BigInteger>(_IncomeSpectators_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IncomeFinancial")
    public JAXBElement<BigInteger> createIncomeFinancial(BigInteger value) {
        return new JAXBElement<BigInteger>(_IncomeFinancial_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ExpectedWeeksTotal")
    public JAXBElement<BigInteger> createExpectedWeeksTotal(BigInteger value) {
        return new JAXBElement<BigInteger>(_ExpectedWeeksTotal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastIncomeSponsors")
    public JAXBElement<BigInteger> createLastIncomeSponsors(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastIncomeSponsors_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastCostsStaff")
    public JAXBElement<BigInteger> createLastCostsStaff(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastCostsStaff_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FanClubSize")
    public JAXBElement<BigInteger> createFanClubSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_FanClubSize_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastIncomeSum")
    public JAXBElement<BigInteger> createLastIncomeSum(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastIncomeSum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CostsPlayers")
    public JAXBElement<BigInteger> createCostsPlayers(BigInteger value) {
        return new JAXBElement<BigInteger>(_CostsPlayers_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "LastIncomeSpectators")
    public JAXBElement<BigInteger> createLastIncomeSpectators(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastIncomeSpectators_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CostsStaff")
    public JAXBElement<BigInteger> createCostsStaff(BigInteger value) {
        return new JAXBElement<BigInteger>(_CostsStaff_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastCostsYouth")
    public JAXBElement<BigInteger> createLastCostsYouth(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastCostsYouth_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastCostsArena")
    public JAXBElement<BigInteger> createLastCostsArena(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastCostsArena_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastCostsFinancial")
    public JAXBElement<BigInteger> createLastCostsFinancial(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastCostsFinancial_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastIncomeFinancial")
    public JAXBElement<BigInteger> createLastIncomeFinancial(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastIncomeFinancial_QNAME, BigInteger.class, null, value);
    }

}