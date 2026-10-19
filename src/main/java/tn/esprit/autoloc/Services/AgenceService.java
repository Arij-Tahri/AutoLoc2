package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Repositories.AgenceRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {
    AgenceRepository agenceRepo;
    @Override
    public Agence addAgence(Agence agence) {
        return agenceRepo.save(agence);
    }

    @Override
    public Agence getAgence(Long id) {
        return agenceRepo.getById(id);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepo.save(agence);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepo.deleteById(id);
    }

    @Override
    public List<Agence> getAllAgence() {
        return agenceRepo.findAll();
    }
}
