package com.accenture.galicia.controller;

import org.springframework.http.ResponseEntity;

import com.accenture.galicia.persistance.Pasaporte;
import com.accenture.galicia.persistance.Persona;
import com.accenture.galicia.pojos.PersonaPOJO;

import io.swagger.annotations.Api;

@Api(tags = "Api de pasaportes", description = "Servicio de gestión de pasaportes")
public interface PasaporteApiController {

	public void agregarPersona(PersonaPOJO persona);
	public ResponseEntity<?> getPersonas();
	public void crearPasaporte(String idPersona, Persona persona);
}
