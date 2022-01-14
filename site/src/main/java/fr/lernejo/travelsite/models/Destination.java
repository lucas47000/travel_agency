package fr.lernejo.travelsite.models;

public class Destination {
	private final String country;
    private final  int temperature;
    
    //constructeur de la classe destination :
    public Destination(String country, int temperature) {
		super();
		this.country = country;
		this.temperature = temperature;
	}
    
	//getters & setters :
	public String getCountry() {
		return country;
	}
	public int getTemperature() {
		return temperature;
	}

    
}
