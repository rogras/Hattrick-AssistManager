package controllers;

import dictionary.Dictionary;
import play.libs.WS;
import play.mvc.Controller;

public class Team extends Controller{
	
	public static void getAchivements(){
		String url = "http://chpp.hattrick.org/chppxml.ashx?file=players";
        String mentions = "";
        try {
            mentions = WS.url(url).oauth(Dictionary.HATTRICK, Application.getUser().getTokenPair()).get().getString();
	
	System.out.println("mentins: "+mentions);
        } catch(Exception e) {
            // User is not authentified
        }
        render(mentions);
	}

}
