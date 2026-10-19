package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Vehicule;
import tn.esprit.autoloc.Repositories.VehiculeRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class VehiculeService implements IVehiculeService {
    VehiculeRepository vehiculeRepo;
    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
       return vehiculeRepo.save(vehicule);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
      return  vehiculeRepo.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepo.deleteById(id);
    }

    @Override
    public List<Vehicule> getAllVehicule() {
        return vehiculeRepo.findAll();
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return vehiculeRepo.findById(id).get();
    }
}
