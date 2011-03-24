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

    private static final ServiceInfo HATTRICK = new ServiceInfo(
            "https://chpp.hattrick.org/oauth/request_token.ashx",
            "https://chpp.hattrick.org/oauth/access_token.ashx",
            "https://chpp.hattrick.org/oauth/authorize.aspx",
            "XQ5GKRYJNwkBhpRW4Diu3z",
            "xddcH8zTwSEjHhdyv6IEiR+Qv44xwidDRqT4GML7V32"
    );

    public static void index() {
        String url = "http://chpp.hattrick.org/chppxml.ashx";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(HATTRICK, getUser().getTokenPair()).get().getString();
	System.out.println("mentins: "+mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        render(mentions);
    }

    public static void players() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=players";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(HATTRICK, getUser().getTokenPair()).get().getString();
	
	System.out.println("mentins: "+mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        render(mentions);
    }

    public static void team() {
        String url = "http://chpp.hattrick.org/chppxml.ashx?file=teamdetails&version=2.4";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(HATTRICK, getUser().getTokenPair()).get().getString();

	System.out.println("mentins: "+mentions);
        request.current().contentType = "application/json";
        renderText(mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        render(mentions);
    }

    public static void setStatus(String status) throws Exception {
        String url = "http://twitter.com/statuses/update.json?status=" + URLEncoder.encode(status, "utf-8");
        String response = WS.url(url).oauth(HATTRICK, getUser().getTokenPair()).post().getString();
        request.current().contentType = "application/json";
        renderText(response);
    }

    // Hattrick authentication

    public static void authenticate() {
        if (OAuth.isVerifierResponse()) {
            // We got the verifier; now get the access token, store it and back to index
            TokenPair tokens = OAuth.service(HATTRICK).requestAccessToken(getUser().getTokenPair());
            getUser().setTokenPair(tokens);
            index();
        }
        OAuth twitt = OAuth.service(HATTRICK);
        TokenPair tokens = twitt.requestUnauthorizedToken();
        // We received the unauthorized tokens in the OAuth object - store it before we proceed
        getUser().setTokenPair(tokens);
        redirect(twitt.redirectUrl(tokens));
    }

    private static User getUser() {
        return User.findOrCreate("guest");
    }

}
