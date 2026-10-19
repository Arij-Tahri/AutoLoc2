package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Contrat;
import tn.esprit.autoloc.Repositories.ContratRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class ContratService implements IContratService{
    ContratRepository contratrepo;
    @Override
    public Contrat addContrat(Contrat c) {
        return contratrepo.save(c);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return contratrepo.save(c);
    }

    @Override
    public void deleteContrat(Long id) {
        contratrepo.deleteById(id);
    }

    @Override
    public Contrat getContrat(Long id) {
        return contratrepo.findById(id).get();
    }

    @Override
    public List<Contrat> getAllContrat() {
        return contratrepo.findAll();
    }
}
