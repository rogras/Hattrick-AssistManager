//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 12:47:20 AM CEST 
//


package models.playerdetails;

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

    private final static QName _PlayerNumber_QNAME = new QName("", "PlayerNumber");
    private final static QName _TransferListed_QNAME = new QName("", "TransferListed");
    private final static QName _Age_QNAME = new QName("", "Age");
    private final static QName _FetchedDate_QNAME = new QName("", "FetchedDate");
    private final static QName _PlayerForm_QNAME = new QName("", "PlayerForm");
    private final static QName _NativeLeagueName_QNAME = new QName("", "NativeLeagueName");
    private final static QName _IsYouth_QNAME = new QName("", "IsYouth");
    private final static QName _StaminaSkill_QNAME = new QName("", "StaminaSkill");
    private final static QName _UserID_QNAME = new QName("", "UserID");
    private final static QName _WingerSkill_QNAME = new QName("", "WingerSkill");
    private final static QName _Caps_QNAME = new QName("", "Caps");
    private final static QName _DefenderSkill_QNAME = new QName("", "DefenderSkill");
    private final static QName _PlayerName_QNAME = new QName("", "PlayerName");
    private final static QName _PlayerLanguage_QNAME = new QName("", "PlayerLanguage");
    private final static QName _CapsU20_QNAME = new QName("", "CapsU20");
    private final static QName _AgeDays_QNAME = new QName("", "AgeDays");
    private final static QName _PlaymakerSkill_QNAME = new QName("", "PlaymakerSkill");
    private final static QName _Experience_QNAME = new QName("", "Experience");
    private final static QName _CareerGoals_QNAME = new QName("", "CareerGoals");
    private final static QName _CareerHattricks_QNAME = new QName("", "CareerHattricks");
    private final static QName _TeamName_QNAME = new QName("", "TeamName");
    private final static QName _TeamID_QNAME = new QName("", "TeamID");
    private final static QName _SetPiecesSkill_QNAME = new QName("", "SetPiecesSkill");
    private final static QName _Agreeability_QNAME = new QName("", "Agreeability");
    private final static QName _Salary_QNAME = new QName("", "Salary");
    private final static QName _Version_QNAME = new QName("", "Version");
    private final static QName _Cards_QNAME = new QName("", "Cards");
    private final static QName _CupGoals_QNAME = new QName("", "CupGoals");
    private final static QName _InjuryLevel_QNAME = new QName("", "InjuryLevel");
    private final static QName _KeeperSkill_QNAME = new QName("", "KeeperSkill");
    private final static QName _LeagueID_QNAME = new QName("", "LeagueID");
    private final static QName _Specialty_QNAME = new QName("", "Specialty");
    private final static QName _UserIsSupporter_QNAME = new QName("", "UserIsSupporter");
    private final static QName _TSI_QNAME = new QName("", "TSI");
    private final static QName _IsAbroad_QNAME = new QName("", "IsAbroad");
    private final static QName _UserHasClubHouse_QNAME = new QName("", "UserHasClubHouse");
    private final static QName _Aggressiveness_QNAME = new QName("", "Aggressiveness");
    private final static QName _ScorerSkill_QNAME = new QName("", "ScorerSkill");
    private final static QName _FileName_QNAME = new QName("", "FileName");
    private final static QName _PassingSkill_QNAME = new QName("", "PassingSkill");
    private final static QName _NativeLeagueID_QNAME = new QName("", "NativeLeagueID");
    private final static QName _Honesty_QNAME = new QName("", "Honesty");
    private final static QName _LeagueGoals_QNAME = new QName("", "LeagueGoals");
    private final static QName _PlayerID_QNAME = new QName("", "PlayerID");
    private final static QName _Leadership_QNAME = new QName("", "Leadership");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Player }
     * 
     */
    public Player createPlayer() {
        return new Player();
    }

    /**
     * Create an instance of {@link TrainerData }
     * 
     */
    public TrainerData createTrainerData() {
        return new TrainerData();
    }

    /**
     * Create an instance of {@link HattrickData }
     * 
     */
    public HattrickData createHattrickData() {
        return new HattrickData();
    }

    /**
     * Create an instance of {@link PlayerSkills }
     * 
     */
    public PlayerSkills createPlayerSkills() {
        return new PlayerSkills();
    }

    /**
     * Create an instance of {@link Statement }
     * 
     */
    public Statement createStatement() {
        return new Statement();
    }

    /**
     * Create an instance of {@link OwningTeam }
     * 
     */
    public OwningTeam createOwningTeam() {
        return new OwningTeam();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PlayerNumber")
    public JAXBElement<BigInteger> createPlayerNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_PlayerNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TransferListed")
    public JAXBElement<BigInteger> createTransferListed(BigInteger value) {
        return new JAXBElement<BigInteger>(_TransferListed_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Age")
    public JAXBElement<BigInteger> createAge(BigInteger value) {
        return new JAXBElement<BigInteger>(_Age_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "PlayerForm")
    public JAXBElement<BigInteger> createPlayerForm(BigInteger value) {
        return new JAXBElement<BigInteger>(_PlayerForm_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NativeLeagueName")
    public JAXBElement<String> createNativeLeagueName(String value) {
        return new JAXBElement<String>(_NativeLeagueName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IsYouth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIsYouth(String value) {
        return new JAXBElement<String>(_IsYouth_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StaminaSkill")
    public JAXBElement<BigInteger> createStaminaSkill(BigInteger value) {
        return new JAXBElement<BigInteger>(_StaminaSkill_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "WingerSkill")
    public JAXBElement<BigInteger> createWingerSkill(BigInteger value) {
        return new JAXBElement<BigInteger>(_WingerSkill_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Caps")
    public JAXBElement<BigInteger> createCaps(BigInteger value) {
        return new JAXBElement<BigInteger>(_Caps_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DefenderSkill")
    public JAXBElement<BigInteger> createDefenderSkill(BigInteger value) {
        return new JAXBElement<BigInteger>(_DefenderSkill_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "PlayerLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPlayerLanguage(String value) {
        return new JAXBElement<String>(_PlayerLanguage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CapsU20")
    public JAXBElement<BigInteger> createCapsU20(BigInteger value) {
        return new JAXBElement<BigInteger>(_CapsU20_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AgeDays")
    public JAXBElement<BigInteger> createAgeDays(BigInteger value) {
        return new JAXBElement<BigInteger>(_AgeDays_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PlaymakerSkill")
    public JAXBElement<BigInteger> createPlaymakerSkill(BigInteger value) {
        return new JAXBElement<BigInteger>(_PlaymakerSkill_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Experience")
    public JAXBElement<BigInteger> createExperience(BigInteger value) {
        return new JAXBElement<BigInteger>(_Experience_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CareerGoals")
    public JAXBElement<BigInteger> createCareerGoals(BigInteger value) {
        return new JAXBElement<BigInteger>(_CareerGoals_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CareerHattricks")
    public JAXBElement<BigInteger> createCareerHattricks(BigInteger value) {
        return new JAXBElement<BigInteger>(_CareerHattricks_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "SetPiecesSkill")
    public JAXBElement<BigInteger> createSetPiecesSkill(BigInteger value) {
        return new JAXBElement<BigInteger>(_SetPiecesSkill_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Agreeability")
    public JAXBElement<BigInteger> createAgreeability(BigInteger value) {
        return new JAXBElement<BigInteger>(_Agreeability_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Salary")
    public JAXBElement<BigInteger> createSalary(BigInteger value) {
        return new JAXBElement<BigInteger>(_Salary_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "Cards")
    public JAXBElement<BigInteger> createCards(BigInteger value) {
        return new JAXBElement<BigInteger>(_Cards_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CupGoals")
    public JAXBElement<BigInteger> createCupGoals(BigInteger value) {
        return new JAXBElement<BigInteger>(_CupGoals_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InjuryLevel")
    public JAXBElement<BigInteger> createInjuryLevel(BigInteger value) {
        return new JAXBElement<BigInteger>(_InjuryLevel_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "KeeperSkill")
    public JAXBElement<BigInteger> createKeeperSkill(BigInteger value) {
        return new JAXBElement<BigInteger>(_KeeperSkill_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LeagueID")
    public JAXBElement<BigInteger> createLeagueID(BigInteger value) {
        return new JAXBElement<BigInteger>(_LeagueID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Specialty")
    public JAXBElement<BigInteger> createSpecialty(BigInteger value) {
        return new JAXBElement<BigInteger>(_Specialty_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "IsAbroad")
    public JAXBElement<BigInteger> createIsAbroad(BigInteger value) {
        return new JAXBElement<BigInteger>(_IsAbroad_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UserHasClubHouse")
    public JAXBElement<BigInteger> createUserHasClubHouse(BigInteger value) {
        return new JAXBElement<BigInteger>(_UserHasClubHouse_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Aggressiveness")
    public JAXBElement<BigInteger> createAggressiveness(BigInteger value) {
        return new JAXBElement<BigInteger>(_Aggressiveness_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ScorerSkill")
    public JAXBElement<BigInteger> createScorerSkill(BigInteger value) {
        return new JAXBElement<BigInteger>(_ScorerSkill_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "PassingSkill")
    public JAXBElement<BigInteger> createPassingSkill(BigInteger value) {
        return new JAXBElement<BigInteger>(_PassingSkill_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NativeLeagueID")
    public JAXBElement<BigInteger> createNativeLeagueID(BigInteger value) {
        return new JAXBElement<BigInteger>(_NativeLeagueID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Honesty")
    public JAXBElement<BigInteger> createHonesty(BigInteger value) {
        return new JAXBElement<BigInteger>(_Honesty_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LeagueGoals")
    public JAXBElement<BigInteger> createLeagueGoals(BigInteger value) {
        return new JAXBElement<BigInteger>(_LeagueGoals_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PlayerID")
    public JAXBElement<BigInteger> createPlayerID(BigInteger value) {
        return new JAXBElement<BigInteger>(_PlayerID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Leadership")
    public JAXBElement<BigInteger> createLeadership(BigInteger value) {
        return new JAXBElement<BigInteger>(_Leadership_QNAME, BigInteger.class, null, value);
    }

}
