package tn.esprit.autolocation.Services;


import java.util.List;

import tn.esprit.autolocation.Entities.Maintenance;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance (Maintenance maintenance);
    void supprimerMaintenance (Long id) ;
    List<Maintenance> afficherMaintenances ();
    Maintenance modifierMaintenance (Maintenance maintenance);
    Maintenance AfficherMaintenanceByID (Long id);
}
