package tn.esprit.autolocation.Services;


import java.util.List;

import tn.esprit.autolocation.Entities.Employe;

public interface IEmployeService {
    Employe ajouterEmploye (Employe employe);
    void supprimerEmploye (Long id) ;
    List<Employe> afficherEmployes ();
    Employe modifierEmploye (Employe employe);
    Employe AfficherEmployeByID (Long id);
}
