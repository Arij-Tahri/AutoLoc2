package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agence
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    String ville;
    String adresse;
    String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agence")
    Set<Employee> employes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agence")
    Set<Vehicule> vehicules;
}

