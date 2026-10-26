package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autoloc.Entities.enumerations.StatutReservation;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idReservation;
    LocalDate dateDebut;
    LocalDate dateFin;
    StatutReservation statut;

    @ManyToOne
    Vehicule vehicule;

    @ManyToOne
    Client client;

    @OneToOne(cascade = CascadeType.ALL)
    Contrat contrat;

}
