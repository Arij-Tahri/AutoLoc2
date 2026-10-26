package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Services.AgenceService;
import tn.esprit.autoloc.Services.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/AutoLoc")

public class AgenceController {
    private IAgenceService agenceSerive;
    @PostMapping("/ajouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence)

    {
        return agenceSerive.addAgence(agence);
    }

    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence agence)

    {
        return agenceSerive.updateAgence(agence);
    }

    @DeleteMapping("/supprimerAgence/{id}")
    public void supprimerAgence(@PathVariable Long id)
    {
        agenceSerive.deleteAgence(id);
    }



    @GetMapping("/getAgence/{id}")
    public Agence AfficherAgenceByID(@PathVariable Long id)
    {
        return agenceSerive.getAgence(id);
    }



    @GetMapping("/allAgences")
    public List<Agence> afficherAgences()
    {
        return agenceSerive.getAllAgence();
    }
}
