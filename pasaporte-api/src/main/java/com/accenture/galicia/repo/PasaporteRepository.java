package com.accenture.galicia.repo;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.accenture.galicia.persistance.Pasaporte;

@Repository
public interface PasaporteRepository extends MongoRepository<Pasaporte, Serializable> {

}
