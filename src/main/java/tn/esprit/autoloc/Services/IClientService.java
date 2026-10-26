package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Client;

import java.util.List;

public interface IClientService {
    Client addClient(Client client);
    Client updateClient(Client client);
    void deleteClient(Long id);
    Client getClient(Long id);
    List<Client> getClients();
}
