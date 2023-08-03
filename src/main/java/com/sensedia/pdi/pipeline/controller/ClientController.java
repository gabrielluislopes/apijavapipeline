package com.sensedia.pdi.pipeline.controller;

import com.sensedia.pdi.pipeline.model.Client;
import com.sensedia.pdi.pipeline.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAll(){
        return this.clientService.getAll();
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable String id){
        return this.clientService.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void create(@RequestBody Client client){
        this.clientService.create(client);
    }

    @PutMapping
    public void update(@RequestBody Client client){
        this.clientService.update(client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        this.clientService.delete(id);
    }

}
