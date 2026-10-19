package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance addMaintenance(Maintenance maintenance);
    Maintenance updateMaintenance(Maintenance maintenance);
    void deleteMaintenance(Long id);
    List<Maintenance> getMaintenance();
    Maintenance getMaintenance(Long id);
}
