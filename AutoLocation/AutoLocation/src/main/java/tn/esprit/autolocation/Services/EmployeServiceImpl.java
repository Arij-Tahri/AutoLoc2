package tn.esprit.autolocation.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.esprit.autolocation.Entities.Employe;
import tn.esprit.autolocation.Repositories.EmployeRepository;

@Service
@AllArgsConstructor
public class EmployeServiceImpl implements IEmployeService {
    private EmployeRepository employeRepository ;
    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void supprimerEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public List<Employe> afficherEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe modifierEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe AfficherEmployeByID(Long id) {
        return  employeRepository.findById(id).orElse(null);
    }
}
