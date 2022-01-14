package fr.lernejo.prediction.models;

import java.util.ArrayList;

public record CountryTemp(String country, ArrayList<DayTemp> temperatures) {
}
