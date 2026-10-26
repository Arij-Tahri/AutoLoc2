package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement addPaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiement(Long id);
    List<Paiement> getAllPaiement();
    Paiement getPaiementById(Long id);
}
