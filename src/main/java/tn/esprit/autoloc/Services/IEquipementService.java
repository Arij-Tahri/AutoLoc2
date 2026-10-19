package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Employee;
import tn.esprit.autoloc.Entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement addEquipement(Equipement equipement);
    Equipement updateEquipement(Equipement equipement);
    void deleteEquipement(Long id);
    List<Equipement> getAllEquipement();
    Equipement getEquipementById(Long id);
}
