package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule addVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Long id);
    List<Vehicule> getAllVehicule();
    Vehicule getVehiculeById(Long id);
}
