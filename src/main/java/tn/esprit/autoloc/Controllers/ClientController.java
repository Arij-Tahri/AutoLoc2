package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Client;
import tn.esprit.autoloc.Services.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/AutoLoc")

public class ClientController {
    private IClientService clientService;
    @PostMapping("/ajouterclient")
    public Client ajouterClient(@RequestBody Client client)

    {
        return clientService.addClient(client);
    }

    @PutMapping("/modifierClient")
    public Client modifierClient(@RequestBody Client client)

    {
        return clientService.updateClient(client);
    }

    @DeleteMapping("/supprimerclient/{id}")
    public void supprimerclient(@PathVariable Long id)
    {
        clientService.deleteClient(id);
    }



    @GetMapping("/getclient/{id}")
    public Client AfficherclientByID(@PathVariable Long id)
    {
        return clientService.getClient(id);
    }



    @GetMapping("/allclient")
    public List<Client> afficherclients()
    {
        return clientService.getClients();
    }
}
