package controllers;

import java.net.URLEncoder;

import play.Logger;
import play.libs.OAuth;
import play.libs.OAuth.ServiceInfo;
import play.libs.OAuth.TokenPair;
import play.libs.WS;
import play.libs.WS.HttpResponse;
import play.mvc.Controller;
import play.mvc.Scope.Params;

import org.w3c.dom.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import dictionary.Dictionary;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import models.User;

public class Application extends Controller {

//request token url https://chpp.hattrick.org/oauth/request_token.ashx
//access token url https://chpp.hattrick.org/oauth/access_token.ashx
//authorize url https://chpp.hattrick.org/oauth/authorize.aspx
//consumer key XQ5GKRYJNwkBhpRW4Diu3z
//consumer secret xddcH8zTwSEjHhdyv6IEiR+Qv44xwidDRqT4GML7V32

//protected source http://chpp.hattrick.org/chppxml.ashx

    

    public static void index() {
        String url = "http://chpp.hattrick.org/chppxml.ashx";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).get().getString();
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

public static void matchdetails() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=matchdetails&matchid=305354265";
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

public static void matchlineup() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=matchlineup&matchid=305354265";
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

public static void matchorders() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=matchorders&matchid=305354265";
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

public static void playerdetails() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=playerdetails&playerId=275146313";
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

public static void playerevents() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=playerevents&playerId=275146313";
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

    public static void trainingevents() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=trainingevents&playerId=275146313";
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

    public static void transfersplayer() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=transfersplayer&playerId=275146313";
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

    public static void setStatus(String status) throws Exception {
        String url = "http://twitter.com/statuses/update.json?status=" + URLEncoder.encode(status, "utf-8");
        String response = WS.url(url).oauth(Dictionary.HATTRICK, getUser().getTokenPair()).post().getString();
        request.current().contentType = "application/json";
        renderText(response);
    }

    // Hattrick authentication

    public static void authenticate() {
        if (OAuth.isVerifierResponse()) {
            // We got the verifier; now get the access token, store it and back to index
            TokenPair tokens = OAuth.service(Dictionary.HATTRICK).requestAccessToken(getUser().getTokenPair());
            getUser().setTokenPair(tokens);
            index();
        }
        OAuth twitt = OAuth.service(Dictionary.HATTRICK);
        TokenPair tokens = twitt.requestUnauthorizedToken();
        // We received the unauthorized tokens in the OAuth object - store it before we proceed
        getUser().setTokenPair(tokens);
        redirect(twitt.redirectUrl(tokens));
    }

    public static User getUser() {
        return User.findOrCreate("guest");
    }

}
