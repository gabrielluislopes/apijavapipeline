package com.sensedia.pdi.pipeline.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Client {

    @Id
    private String id;
    private String nome;
    private String dataNascimento;
    private Address endereco;
    private String telefone;
    private String email;

}
