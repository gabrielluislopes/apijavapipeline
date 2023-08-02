package com.sensedia.pdi.pipeline.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    @GetMapping
    public void getAll(){
        System.out.println("Método /clientes/getAll");
    }

    @GetMapping("/{id}")
    public void getById(){
        System.out.println("Método /clientes/getById");
    }

    @PostMapping
    public void create(){
        System.out.println("Método /clientes/create");
    }

    @PutMapping
    public void update(){
        System.out.println("Método /clientes/update");
    }

    @DeleteMapping("/{id}")
    public void delete(){
        System.out.println("Método /clientes/delete");
    }

}
