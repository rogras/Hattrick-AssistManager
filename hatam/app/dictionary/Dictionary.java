package dictionary;

import play.libs.OAuth.ServiceInfo;

public class Dictionary {
	
	public static final ServiceInfo HATTRICK = new ServiceInfo(
            "https://chpp.hattrick.org/oauth/request_token.ashx",
            "https://chpp.hattrick.org/oauth/access_token.ashx",
            "https://chpp.hattrick.org/oauth/authorize.aspx",
            "XQ5GKRYJNwkBhpRW4Diu3z",
            "xddcH8zTwSEjHhdyv6IEiR+Qv44xwidDRqT4GML7V32"
    );
	
	//Generic URL to get hattrick xmls
	public static final String URL 			= 		"http://chpp.hattrick.org/chppxml.ashx";
	
	//List services
	public static final String ACHIVEMENTS				= "file=achievements";
	public static final String ARENA_DETAILS 			= "file=arenadetails";
	public static final String BOOKMARKS 				= "file=bookmarks";
	public static final String CHALLENGES 				= "file=challenges";
	public static final String CLUB 					= "file=club";
	public static final String CUP_MATCHES 				= "file=cupmatches";
	public static final String ECONOMY 					= "file=economy";
	public static final String FANS 					= "file=fans";
	public static final String LEAGUE_DETAILS 			= "file=leaguedetails";
	public static final String LEAGUE_FIXTURES 			= "file=leaguefixtures";
	public static final String LIVE 					= "file=live";
	public static final String MATCHES 					= "file=matches";
	public static final String MATCH_DETAILS 			= "file=matchdetails";
	public static final String MATCHES_ARCHIVE 			= "file=matchesarchive";
	public static final String MATCH_LINEUP 			= "file=matchlineup";
	public static final String MATCH_ORDERS 			= "file=matchorders";
	public static final String PLAYERS 					= "file=players";
	public static final String PLAYER_DETAILS 			= "file=playerdetails";
	public static final String PLAYER_EVENTS 			= "file=playerevents";
	public static final String REGION_DETAILS 			= "file=regiondetails";
	public static final String SEARCH 					= "file=search";
	public static final String TEAM_DETAILS 			= "file=teamdetails";
	public static final String TRAINING 				= "file=training";
	public static final String TRAINING_EVENTS 			= "file=trainingevents";
	public static final String TRANSFERS_TEAM 			= "file=transfersteam";
	public static final String TRANSFERS_PLAYER 		= "file=transfersplayer";
	public static final String WORLD_LANGUAGES 			= "file=worldlanguages";
	
	

}
