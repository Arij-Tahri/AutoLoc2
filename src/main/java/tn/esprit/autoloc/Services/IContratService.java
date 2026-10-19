package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat addContrat(Contrat c);
    Contrat updateContrat(Contrat c);
    void deleteContrat(Long id);
    Contrat getContrat(Long id);
    List<Contrat> getAllContrat();
}
