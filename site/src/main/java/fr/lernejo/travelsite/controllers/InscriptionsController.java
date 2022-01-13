package fr.lernejo.travelsite.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.lernejo.travelsite.models.Destination;
import fr.lernejo.travelsite.models.User;


@RestController
public class InscriptionsController {
	
    public final ArrayList<User> inscriptions = new ArrayList<>();
    
    @PostMapping("api/inscription")
    public ArrayList<User> ajouter(@RequestBody User user){
        for(User inscription:inscriptions){
            if (inscription.getUserName().equals(user.getUserName()))
                return inscriptions;
        }
        inscriptions.add(user);
        return inscriptions;
    }
    
    @GetMapping("api/travels")
    public ArrayList<Destination> getDestination(@RequestParam String userName){
        ArrayList<Destination> destinations = new ArrayList<>();
        for(User inscription:inscriptions){
            if (inscription.getUserName().equals(userName)){
            	destinations.add(new Destination("Germany", 25));
            }
        }
        
        return destinations;
        
    }
}
