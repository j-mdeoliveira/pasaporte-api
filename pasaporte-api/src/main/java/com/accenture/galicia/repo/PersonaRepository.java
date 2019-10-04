package com.accenture.galicia.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.accenture.galicia.persistance.Persona;

@Repository
public interface PersonaRepository extends MongoRepository<Persona, String> {

}
