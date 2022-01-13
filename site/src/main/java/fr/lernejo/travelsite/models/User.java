package fr.lernejo.travelsite.models;

public class User {
	
    private final String userEmail;
    private final String userName;
    private final String userCountry;
    private final String weatherExpectation;
    private final Integer minimumTemperatureDistance;
	public enum weatherEnum{WARMER, COLDER};

    
    public User(String userEmail, String userName, String userCountry, String weatherExpectation,
			Integer minimumTemperatureDistance) {
		super();
		this.userEmail = userEmail;
		this.userName = userName;
		this.userCountry = userCountry;
		this.weatherExpectation = weatherExpectation;
		this.minimumTemperatureDistance = minimumTemperatureDistance;
	}
    
	public String getUserEmail() {
		return userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public String getWeatherExpectation() {
		return weatherExpectation;
	}

	public Integer getMinimumTemperatureDistance() {
		return minimumTemperatureDistance;
	}  
}
