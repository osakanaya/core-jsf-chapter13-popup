package com.corejsf;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("bb")
@SessionScoped
public class BackingBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private static Map<String, String[]> states;

	static {
		states = new HashMap<String, String[]>();
		states.put("USA", new String[] { "Alabama", "Alaska", "Arizona",
				"Arkansas", "California", "Colorado", "Connecticut",
				"Delaware", "Florida", "Georgia", "Hawaii", "Idaho",
				"Illinois", "Indiana", "Iowa", "Kansas", "Kentucky",
				"Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan",
				"Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska",
				"Nevada", "New Hampshire", "New Jersey", "New Mexico",
				"New York", "North Carolina", "North Dakota", "Ohio",
				"Oklahoma", "Oregon", "Pennsylvania", "Rhode Island",
				"South Carolina", "South Dakota", "Tennessee", "Texas", "Utah",
				"Vermont", "Virginia", "Washington", "West Virginia",
				"Wisconsin", "Wyoming" });

		states.put("Canada", new String[] { "Alberta", "British Columbia",
				"Manitoba", "New Brunswick", "Newfoundland and Labrador",
				"Northwest Territories", "Nova Scotia", "Nunavut", "Ontario",
				"Prince Edward Island", "Quebec", "Saskatchewan", "Yukon" });
	}

	private String country = "USA";
	private String state = "California";

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Map<String, String[]> getStates() {
		return states;
	}

	public String[] getStatesForCountry() {
		return states.get(country);
	}

}
