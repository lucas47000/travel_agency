package fr.lernejo.travelsite.models;

public record User(String userEmail, String userName, String userCountry, WeatherEnum weatherExpectation,
		Integer minimumTemperatureDistance) {
	public enum WeatherEnum{WARMER, COLDER};
}
