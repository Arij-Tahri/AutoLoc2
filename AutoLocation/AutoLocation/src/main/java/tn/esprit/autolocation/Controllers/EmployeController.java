package tn.esprit.autolocation.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.esprit.autolocation.Entities.Employe;
import tn.esprit.autolocation.Services.IEmployeService;

@RestController
@AllArgsConstructor
@RequestMapping("/employes")
public class EmployeController {
    private IEmployeService employeService;
    @PostMapping("/ajouterEmploye")
    public Employe ajouterEmploye(@RequestBody Employe employe)

    {
        return employeService.ajouterEmploye(employe);
    }

    @PutMapping("/modifierEmploye")
    public Employe modifierEmploye(@RequestBody Employe employe)

    {
        return employeService.modifierEmploye(employe);
    }

    @DeleteMapping("/supprimerEmploye/{id}")
    public void supprimerEmploye(@PathVariable Long id)
    {
        employeService.supprimerEmploye(id);
    }



    @GetMapping("/getEmploye/{id}")
    public Employe AfficherEmployeByID(@PathVariable Long id)
    {
        return employeService.AfficherEmployeByID(id);
    }



    @GetMapping("/allEmployes")
    public List<Employe> afficherEmployes()
    {
        return employeService.afficherEmployes();
    }


}
