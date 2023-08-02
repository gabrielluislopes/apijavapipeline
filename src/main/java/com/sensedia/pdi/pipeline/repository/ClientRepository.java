package com.sensedia.pdi.pipeline.repository;

import com.sensedia.pdi.pipeline.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {
}
