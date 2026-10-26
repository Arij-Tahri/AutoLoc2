package tn.esprit.autolocation.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.esprit.autolocation.Entities.Maintenance;
import tn.esprit.autolocation.Repositories.MaintenanceRepository;

@Service
@AllArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceService {
    private MaintenanceRepository maintenanceRepository ;
    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void supprimerMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public List<Maintenance> afficherMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance modifierMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance AfficherMaintenanceByID(Long id) {
        return  maintenanceRepository.findById(id).orElse(null);
    }
}
