package com.sensedia.pdi.pipeline.service.impl;

import com.sensedia.pdi.pipeline.model.Client;
import com.sensedia.pdi.pipeline.repository.ClientRepository;
import com.sensedia.pdi.pipeline.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    public ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return this.clientRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
    }

    @Override
    public Client getById(String id) {
        return this.clientRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Não encontrado"));
    }

    @Override
    public Client create(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public Client update(Client client) {
        String id = client.getId();
        delete(id);
        return create(client);
    }

    @Override
    public boolean delete(String id) {
        this.clientRepository.deleteById(id);
        return true;
    }
}
