package fr.lernejo.prediction.controllers;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.lernejo.prediction.TemperatureService;
import fr.lernejo.prediction.UnknownCountryException;
import fr.lernejo.prediction.models.CountryTemp;
import fr.lernejo.prediction.models.DayTemp;


@RestController
public class PredictionController {
	
    @GetMapping("api/temperature")
    public Object getTemperature(@RequestParam String country) {
    	CountryTemp CountryTemp = new CountryTemp(country, new ArrayList<DayTemp>());
        try {
            CountryTemp.temperatures().add(new DayTemp(LocalDate.now().minusDays(1).toString(),
                new TemperatureService().getTemperature(country)));
            CountryTemp.temperatures().add(new DayTemp(LocalDate.now().minusDays(2).toString(),
                new TemperatureService().getTemperature(country)));
        }
        catch (UnknownCountryException unknownCountryException){
            return ResponseEntity.status(417).body("Ce pays n'existe pas dans la base de données");
        }
        
        return CountryTemp;
    }
}
