package com.sensedia.pdi.pipeline.service;

import com.sensedia.pdi.pipeline.model.Client;

import java.util.List;

public interface ClientService {

    public List<Client> getAll();
    public Client getById(String id);
    public Client create(Client client);
    public Client update(Client client);
    public boolean delete(String id);

}
