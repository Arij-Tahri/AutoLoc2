package tn.esprit.autolocation.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.esprit.autolocation.Entities.Vehicule;
import tn.esprit.autolocation.Services.IVehiculeService;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicules")
public class VehiculeController {
    private IVehiculeService vehiculeService;
    @PostMapping("/ajouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule)

    {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @PutMapping("/modifierVehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule)

    {
        return vehiculeService.modifierVehicule(vehicule);
    }

    @DeleteMapping("/supprimerVehicule/{id}")
    public void supprimerVehicule(@PathVariable Long id)
    {
        vehiculeService.supprimerVehicule(id);
    }



    @GetMapping("/getVehicule/{id}")
    public Vehicule AfficherVehiculeByID(@PathVariable Long id)
    {
        return vehiculeService.AfficherVehiculeByID(id);
    }



    @GetMapping("/allVehicules")
    public List<Vehicule> afficherVehicules()
    {
        return vehiculeService.afficherVehicules();
    }


}
