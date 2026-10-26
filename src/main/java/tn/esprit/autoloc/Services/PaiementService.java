package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Paiement;
import tn.esprit.autoloc.Repositories.PaiementRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class PaiementService implements IPaiementService {
    PaiementRepository paiementRepo;
    @Override
    public Paiement addPaiement(Paiement paiement) {
       return paiementRepo.save(paiement);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
       return paiementRepo.save(paiement);
    }

    @Override
    public void deletePaiement(Long id) {
        paiementRepo.deleteById(id);
    }

    @Override
    public List<Paiement> getAllPaiement() {
        return paiementRepo.findAll();
    }

    @Override
    public Paiement getPaiementById(Long id) {
        return paiementRepo.findById(id).get();
    }
}
