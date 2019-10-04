package com.accenture.galicia.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.galicia.controller.PasaporteApiController;
import com.accenture.galicia.persistance.Persona;
import com.accenture.galicia.pojos.PersonaPOJO;
import com.accenture.galicia.services.PasaporteApiService;

@RestController
@RequestMapping("/passport")
public class PasaporteApiControllerImpl implements PasaporteApiController {
	
	//Tiene que develver status http
	
	@Autowired
	PasaporteApiService service;

	@PutMapping
	public void agregarPersona(@RequestBody PersonaPOJO persona) {
		service.crearPersona(persona);
	}

	@GetMapping("/personas")
	@Override
	public ResponseEntity<?> getPersonas() {
		
		List<Persona> personas = service.getPersonas();
		
		return ResponseEntity.ok().body(personas);
	}

	//En proceso, no va
	@PostMapping("/crearPasaporte")
	@Override
	public void crearPasaporte(String idPersona, Persona persona) {
		Persona person = service.getPersona(idPersona);	
	}

}
