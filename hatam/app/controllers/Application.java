package controllers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import models.UserOauth;

import org.w3c.dom.Document;

import play.libs.OAuth;
import play.libs.WS;
import play.libs.XML;
import play.libs.OAuth.TokenPair;
import play.mvc.Controller;
import dictionary.Dictionary;

public class Application extends Controller {
    

    public static void index() {
        String mentions = "";
        try {
            mentions = WS.url(Dictionary.URL).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();
	System.out.println("mentins: "+mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        render(mentions);
    }

	public static void achivements() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=achievements";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/json";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void arenadetails() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=arenadetails";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/json";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void bookmarks() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=bookmarks";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/json";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void challenges() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=challenges";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/json";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void club() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=club";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/json";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void cupmatches() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=cupmatches";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/json";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void economy() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=economy";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void fans() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=fans";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void leaguedetails() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=leaguedetails";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void leaguefixtures() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=leaguefixtures";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void live() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=live";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void matches() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=matches";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void matchdetails(String matchId) {
	//305354265
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=matchdetails&matchid="+matchId;
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void matchesarchive() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=matchesarchive";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void matchlineup(String matchId) {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=matchlineup&matchid="+matchId;
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void matchorders(String matchId) {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=matchorders&matchid="+matchId;
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void players() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=players";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void playerdetails(String playerId) {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=playerdetails&playerId="+playerId;
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void playerevents(String playerId) {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=playerevents&playerId="+playerId;
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void regiondetails() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=regiondetails";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

public static void search() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=search";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/xml";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

    public static void team() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=teamdetails&version=2.4";
        String mentions = null;
        Document mention = null;
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();
            
            
            System.out.println("mentins: "+mentions);
            mention = XML.getDocument(mentions);
            System.out.println("jaxb ");
		JAXBContext jc = JAXBContext.newInstance( "models.teamdetails" );
		System.out.println("jaxb context ");
		Unmarshaller um = jc.createUnmarshaller();
		System.out.println("unmarsh ");
    
		models.teamdetails.HattrickData hattrickData = (models.teamdetails.HattrickData)	um.unmarshal( mention);
		System.out.println("jaxb after unmarch ");
		System.out.println("teamname "+hattrickData.getTeam().getTeamName());
		System.out.println("teamname unmarsh ");
		
		
        } catch(Exception e) {
            // User is not authentified
        	e.printStackTrace();
        }
        render(mention);
    }

    public static void training() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=training";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/json";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

    public static void trainingevents(String playerId) {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=trainingevents&playerId="+playerId;
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/json";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

    public static void transfersteam() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=transfersteam";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/json";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

    public static void transfersplayer(String playerId) {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=transfersplayer&playerId="+playerId;
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/json";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

    public static void worldlanguages() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=worldlanguages";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        //request.current().contentType = "application/json";
        //renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        renderJSON(mentions);
    }

    // Hattrick authentications
    public static void authenticate() {
        if (OAuth.isVerifierResponse()) {
            // We got the verifier; now get the access token, store it and back to index
            TokenPair tokens = OAuth.service(Dictionary.HATTRICK).requestAccessToken(getUser().getTokenPair());
            getUser().setTokenPair(tokens);
            index();
        }
        OAuth hatt = OAuth.service(Dictionary.HATTRICK);
        TokenPair tokens = hatt.requestUnauthorizedToken();
        // We received the unauthorized tokens in the OAuth object - store it before we proceed
        getUser().setTokenPair(tokens);
        redirect(hatt.redirectUrl(tokens));
    }

    public static UserOauth getUser() {
        return UserOauth.findOrCreate("guest");
    }

}
