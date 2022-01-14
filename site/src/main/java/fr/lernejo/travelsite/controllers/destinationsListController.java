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
public class destinationsListController {
	
	//création de la liste des utilisateurs
    public final ArrayList<User> inscriptions = new ArrayList<>();
    
    @PostMapping("api/inscription")
    public ArrayList<User>
    append(@RequestBody User user)
    {
        for(User inscription:inscriptions){
            if (inscription.userName().equals(user.userName()))
                return inscriptions;
        }
        inscriptions.add(user);
        return inscriptions;
    }
    
    //création de la liste des destinations selon les préférences utilisateur
    @GetMapping("api/travels")
    public ArrayList<Destination> getDestination(@RequestParam String userName){
        ArrayList<Destination> destinations = new ArrayList<>();
        for(User inscription:inscriptions){
            if (inscription.userName().equals(userName)){
            	destinations.add(new Destination("Cuba", 29));
            	destinations.add(new Destination("Brazil", 28));
            	destinations.add(new Destination("Australia", 31));
            }
        }
        //renvoie la liste des destinations
        return destinations;
        
    }
}
