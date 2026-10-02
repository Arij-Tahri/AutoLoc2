package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autoloc.Entities.enumerations.CategorieVehicule;
import tn.esprit.autoloc.Entities.enumerations.StatutVehicule;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVehicule;
    String immatriculation;
    String marque;
    String modelo;
    CategorieVehicule categorie;
    BigDecimal TarifJournalier;
    StatutVehicule Statut;
    @ManyToOne
    Agence agence;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Vehicule")
    Set<Maintenance> maintenances;

    @ManyToMany(cascade = CascadeType.ALL)
    Set<Equipement> equipements;

    @OneToMany(mappedBy = "Vehicule")
    Set<Reservation> reservations;
}

