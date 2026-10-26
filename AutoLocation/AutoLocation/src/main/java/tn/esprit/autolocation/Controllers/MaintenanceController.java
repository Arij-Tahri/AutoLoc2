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
import tn.esprit.autolocation.Entities.Maintenance;
import tn.esprit.autolocation.Services.IMaintenanceService;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenances")
public class MaintenanceController {
    private IMaintenanceService maintenanceService;
    @PostMapping("/ajouterMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance)

    {
        return maintenanceService.ajouterMaintenance(maintenance);
    }

    @PutMapping("/modifierMaintenance")
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance)

    {
        return maintenanceService.modifierMaintenance(maintenance);
    }

    @DeleteMapping("/supprimerMaintenance/{id}")
    public void supprimerMaintenance(@PathVariable Long id)
    {
        maintenanceService.supprimerMaintenance(id);
    }



    @GetMapping("/getMaintenance/{id}")
    public Maintenance AfficherMaintenanceByID(@PathVariable Long id)
    {
        return maintenanceService.AfficherMaintenanceByID(id);
    }



    @GetMapping("/allMaintenances")
    public List<Maintenance> afficherMaintenances()
    {
        return maintenanceService.afficherMaintenances();
    }


}
