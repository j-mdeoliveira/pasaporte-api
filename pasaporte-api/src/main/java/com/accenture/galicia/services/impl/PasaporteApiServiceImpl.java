package com.accenture.galicia.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.galicia.persistance.Pasaporte;
import com.accenture.galicia.persistance.Persona;
import com.accenture.galicia.pojos.PersonaPOJO;
import com.accenture.galicia.repo.PersonaRepository;
import com.accenture.galicia.services.PasaporteApiService;

@Service
public class PasaporteApiServiceImpl implements PasaporteApiService{
	
	@Autowired
	private PersonaRepository personaRepo;

	@Override
	public void crearPersona(PersonaPOJO persona) {
		
		Persona person = new Persona();
		
		person.setNombre(persona.getNombre());
		person.setApellido(persona.getApellido());
		person.setDireccion(persona.getDireccion());
		person.setPais(persona.getPais());
		person.setAntecedentes(persona.getAntecedente());
		
		personaRepo.insert(person);		
	}

	@Override
	public List<Persona> getPersonas() {
		List<Persona>personas = personaRepo.findAll();		
		return personas;
	}

	@Override
	public Persona getPersona(String idPersona) {
		Persona persona = personaRepo.findById(idPersona).orElse(null);
		
		Pasaporte passport = new Pasaporte();
		return persona;
		
	}
	
	public void crearPasaporte() {
		
	}

}
