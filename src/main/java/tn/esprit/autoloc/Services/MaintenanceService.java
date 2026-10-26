package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Maintenance;
import tn.esprit.autoloc.Repositories.MaintenanceRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class MaintenanceService implements IMaintenanceService {
    MaintenanceRepository maintenanceRepo;
    @Override
    public Maintenance addMaintenance(Maintenance maintenance) {
       return maintenanceRepo.save(maintenance);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance maintenance) {
       return maintenanceRepo.save(maintenance);
    }

    @Override
    public void deleteMaintenance(Long id) {
        maintenanceRepo.deleteById(id);
    }

    @Override
    public List<Maintenance> getMaintenance() {
        return maintenanceRepo.findAll();
    }

    @Override
    public Maintenance getMaintenance(Long id) {
        return maintenanceRepo.findById(id).get();
    }
}
