package com.sensedia.pdi.pipeline.model;

import lombok.Data;

@Data
public class Address {

    private String logradouro;
    private int numero;
    private String complemento;
    private String cidade;
    private String uf;
    private String cep;
}
