package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence addAgence(Agence agence);
    Agence getAgence(Long id);
    Agence updateAgence(Agence agence);
    void deleteAgence(Long id);
    List<Agence> getAllAgence();

}
