package tn.esprit.autolocation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocation.Entities.Agence;
import tn.esprit.autolocation.Services.AgenceServiceImpl;
import tn.esprit.autolocation.Services.IAgenceSerive;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Agences")
public class AgenceController {
    private final AgenceServiceImpl agenceServiceImpl;
    private IAgenceSerive agenceSerive;
    @PostMapping("/ajouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence)

    {
        return agenceSerive.ajouterAgence(agence);
    }

    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence agence)

    {
        return agenceSerive.modifierAgence(agence);
    }

    @DeleteMapping("/supprimerAgence/{id}")
    public void supprimerAgence(@PathVariable Long id)
    {
        agenceSerive.supprimerAgence(id);
    }



    @GetMapping("/getAgence/{id}")
    public Agence AfficherAgenceByID(@PathVariable Long id)
    {
        return agenceSerive.AfficherAgenceByID(id);
    }



    @GetMapping("/allAgences")
    public List<Agence> afficherAgences()
    {
        return agenceSerive.afficherAgences();
    }

    @PutMapping("/affecterVehiculeAAgence/{idVehicule}/{idAgence}")
    public void affecterVehiculeAAgence(@PathVariable Long idVehicule, @PathVariable Long idAgence) {
        agenceServiceImpl.affecterVehiculeAAgence(idVehicule, idAgence);
    }
    @PutMapping("/desaffecterVehiculeDAgence/{idVehicule}/{idAgence}")
    public void desaffecterVehiculeDAgence(@PathVariable Long idVehicule, @PathVariable Long idAgence) {
        agenceServiceImpl.desaffecterVehiculeDAgence(idVehicule,idAgence);
    }

}
