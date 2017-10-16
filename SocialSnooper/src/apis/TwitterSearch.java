package apis;

import java.util.ArrayList;

import application.TwitterProfile;

/******************************************************************
 * This class contains the first five pages of the search results
 * For a particular user.
 * @author Anthony Sciaini
 * @version 10/14/2017
 *
 *******************************************************************/
public class TwitterSearch {
	/**Array List of the twitter profiles that came for the search*/
	private ArrayList<TwitterProfile> profiles;
	
	/**Array List of the last status update if each twitter profile user.*/
	protected ArrayList<Tweet> tweets;
	
	/************************************************************************
	 * Default constructor for the class. Takes in a array list of profiles
	 * and tweets for the users.
	 * @param p The arraylist of profiles.
	 * @param t The arraylist of tweets.
	 * @return 
	 *************************************************************************/
	 TwitterSearch(ArrayList<TwitterProfile> p, ArrayList<Tweet> t){
		setProfiles(p);
		tweets = t;
	}

	/******************************************************************************
	 * @return the profiles
	 *****************************************************************************/
	public ArrayList<TwitterProfile> getProfiles() {
		return profiles;
	}

	/******************************************************************************
	 * @param profiles the profiles to set
	 *****************************************************************************/
	public void setProfiles(ArrayList<TwitterProfile> profiles) {
		this.profiles = profiles;
	}
}
