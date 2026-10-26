package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Equipement;
import tn.esprit.autoloc.Repositories.EquipementRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class EquipementService implements IEquipementService {
    EquipementRepository equipementRepo;
    @Override
    public Equipement addEquipement(Equipement equipement) {
        return equipementRepo.save(equipement);
    }

    @Override
    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepo.save(equipement);
    }

    @Override
    public void deleteEquipement(Long id) {
        equipementRepo.deleteById(id);
    }

    @Override
    public List<Equipement> getAllEquipement() {
        return equipementRepo.findAll();
    }

    @Override
    public Equipement getEquipementById(Long id) {
        return equipementRepo.findById(id).get();
    }
}
