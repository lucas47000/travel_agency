package fr.lernejo.travelsite.models;

//classe IMMUABLE User :
public record User(String userEmail, String userName, String userCountry, WeatherEnum weatherExpectation,
		Integer minimumTemperatureDistance) {
	
    //Enumeration correspondant aux choix utilisateurs en termes de température sur le site
	public enum WeatherEnum{WARMER, COLDER};
	
}
