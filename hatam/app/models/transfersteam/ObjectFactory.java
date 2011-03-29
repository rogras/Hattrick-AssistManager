//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:51:16 AM CEST 
//


package models.transfersteam;

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

    private final static QName _NumberOfBuys_QNAME = new QName("", "NumberOfBuys");
    private final static QName _FetchedDate_QNAME = new QName("", "FetchedDate");
    private final static QName _NewLevel_QNAME = new QName("", "NewLevel");
    private final static QName _TransferType_QNAME = new QName("", "TransferType");
    private final static QName _MatchRound_QNAME = new QName("", "MatchRound");
    private final static QName _UserID_QNAME = new QName("", "UserID");
    private final static QName _TotalSumOfBuys_QNAME = new QName("", "TotalSumOfBuys");
    private final static QName _SellerTeamName_QNAME = new QName("", "SellerTeamName");
    private final static QName _TransferID_QNAME = new QName("", "TransferID");
    private final static QName _Deadline_QNAME = new QName("", "Deadline");
    private final static QName _PlayerName_QNAME = new QName("", "PlayerName");
    private final static QName _EventDate_QNAME = new QName("", "EventDate");
    private final static QName _SellerTeamID_QNAME = new QName("", "SellerTeamID");
    private final static QName _TotalSumOfSales_QNAME = new QName("", "TotalSumOfSales");
    private final static QName _TeamName_QNAME = new QName("", "TeamName");
    private final static QName _TeamID_QNAME = new QName("", "TeamID");
    private final static QName _StartDate_QNAME = new QName("", "StartDate");
    private final static QName _DayNumber_QNAME = new QName("", "DayNumber");
    private final static QName _Version_QNAME = new QName("", "Version");
    private final static QName _PageIndex_QNAME = new QName("", "PageIndex");
    private final static QName _BuyerTeamID_QNAME = new QName("", "BuyerTeamID");
    private final static QName _Pages_QNAME = new QName("", "Pages");
    private final static QName _OldLevel_QNAME = new QName("", "OldLevel");
    private final static QName _Season_QNAME = new QName("", "Season");
    private final static QName _ActivatedDate_QNAME = new QName("", "ActivatedDate");
    private final static QName _UserIsSupporter_QNAME = new QName("", "UserIsSupporter");
    private final static QName _TSI_QNAME = new QName("", "TSI");
    private final static QName _NumberOfSales_QNAME = new QName("", "NumberOfSales");
    private final static QName _UserHasClubHouse_QNAME = new QName("", "UserHasClubHouse");
    private final static QName _EndDate_QNAME = new QName("", "EndDate");
    private final static QName _FileName_QNAME = new QName("", "FileName");
    private final static QName _Price_QNAME = new QName("", "Price");
    private final static QName _SkillID_QNAME = new QName("", "SkillID");
    private final static QName _BuyerTeamName_QNAME = new QName("", "BuyerTeamName");
    private final static QName _PlayerID_QNAME = new QName("", "PlayerID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Transfer }
     * 
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link HattrickData }
     * 
     */
    public HattrickData createHattrickData() {
        return new HattrickData();
    }

    /**
     * Create an instance of {@link TrainingEvent }
     * 
     */
    public TrainingEvent createTrainingEvent() {
        return new TrainingEvent();
    }

    /**
     * Create an instance of {@link Seller }
     * 
     */
    public Seller createSeller() {
        return new Seller();
    }

    /**
     * Create an instance of {@link Transfers }
     * 
     */
    public Transfers createTransfers() {
        return new Transfers();
    }

    /**
     * Create an instance of {@link Player }
     * 
     */
    public Player createPlayer() {
        return new Player();
    }

    /**
     * Create an instance of {@link TrainingEvents }
     * 
     */
    public TrainingEvents createTrainingEvents() {
        return new TrainingEvents();
    }

    /**
     * Create an instance of {@link Team }
     * 
     */
    public Team createTeam() {
        return new Team();
    }

    /**
     * Create an instance of {@link Stats }
     * 
     */
    public Stats createStats() {
        return new Stats();
    }

    /**
     * Create an instance of {@link Buyer }
     * 
     */
    public Buyer createBuyer() {
        return new Buyer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfBuys")
    public JAXBElement<BigInteger> createNumberOfBuys(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfBuys_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "NewLevel")
    public JAXBElement<BigInteger> createNewLevel(BigInteger value) {
        return new JAXBElement<BigInteger>(_NewLevel_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TransferType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransferType(String value) {
        return new JAXBElement<String>(_TransferType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MatchRound")
    public JAXBElement<BigInteger> createMatchRound(BigInteger value) {
        return new JAXBElement<BigInteger>(_MatchRound_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "TotalSumOfBuys")
    public JAXBElement<BigInteger> createTotalSumOfBuys(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalSumOfBuys_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SellerTeamName")
    public JAXBElement<String> createSellerTeamName(String value) {
        return new JAXBElement<String>(_SellerTeamName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TransferID")
    public JAXBElement<BigInteger> createTransferID(BigInteger value) {
        return new JAXBElement<BigInteger>(_TransferID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Deadline")
    public JAXBElement<String> createDeadline(String value) {
        return new JAXBElement<String>(_Deadline_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PlayerName")
    public JAXBElement<String> createPlayerName(String value) {
        return new JAXBElement<String>(_PlayerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EventDate")
    public JAXBElement<String> createEventDate(String value) {
        return new JAXBElement<String>(_EventDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SellerTeamID")
    public JAXBElement<BigInteger> createSellerTeamID(BigInteger value) {
        return new JAXBElement<BigInteger>(_SellerTeamID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalSumOfSales")
    public JAXBElement<BigInteger> createTotalSumOfSales(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalSumOfSales_QNAME, BigInteger.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StartDate")
    public JAXBElement<String> createStartDate(String value) {
        return new JAXBElement<String>(_StartDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DayNumber")
    public JAXBElement<BigInteger> createDayNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_DayNumber_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "PageIndex")
    public JAXBElement<BigInteger> createPageIndex(BigInteger value) {
        return new JAXBElement<BigInteger>(_PageIndex_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BuyerTeamID")
    public JAXBElement<BigInteger> createBuyerTeamID(BigInteger value) {
        return new JAXBElement<BigInteger>(_BuyerTeamID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Pages")
    public JAXBElement<BigInteger> createPages(BigInteger value) {
        return new JAXBElement<BigInteger>(_Pages_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OldLevel")
    public JAXBElement<BigInteger> createOldLevel(BigInteger value) {
        return new JAXBElement<BigInteger>(_OldLevel_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Season")
    public JAXBElement<BigInteger> createSeason(BigInteger value) {
        return new JAXBElement<BigInteger>(_Season_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ActivatedDate")
    public JAXBElement<String> createActivatedDate(String value) {
        return new JAXBElement<String>(_ActivatedDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UserIsSupporter")
    public JAXBElement<BigInteger> createUserIsSupporter(BigInteger value) {
        return new JAXBElement<BigInteger>(_UserIsSupporter_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TSI")
    public JAXBElement<BigInteger> createTSI(BigInteger value) {
        return new JAXBElement<BigInteger>(_TSI_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfSales")
    public JAXBElement<BigInteger> createNumberOfSales(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfSales_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UserHasClubHouse")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUserHasClubHouse(String value) {
        return new JAXBElement<String>(_UserHasClubHouse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EndDate")
    public JAXBElement<String> createEndDate(String value) {
        return new JAXBElement<String>(_EndDate_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "Price")
    public JAXBElement<BigInteger> createPrice(BigInteger value) {
        return new JAXBElement<BigInteger>(_Price_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SkillID")
    public JAXBElement<BigInteger> createSkillID(BigInteger value) {
        return new JAXBElement<BigInteger>(_SkillID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BuyerTeamName")
    public JAXBElement<String> createBuyerTeamName(String value) {
        return new JAXBElement<String>(_BuyerTeamName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PlayerID")
    public JAXBElement<BigInteger> createPlayerID(BigInteger value) {
        return new JAXBElement<BigInteger>(_PlayerID_QNAME, BigInteger.class, null, value);
    }

}
