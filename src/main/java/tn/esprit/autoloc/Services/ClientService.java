package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import lombok.Cleanup;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Client;
import tn.esprit.autoloc.Repositories.ClientRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class ClientService implements IClientService{
    ClientRepository clientRepo;
    @Override
    public Client addClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Client updateClient(Client client) {
       return clientRepo.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepo.deleteById(id);
    }

    @Override
    public Client getClient(Long id) {
        return clientRepo.findById(id).get();
    }

    @Override
    public List<Client> getClients() {
        return clientRepo.findAll();
    }
}
