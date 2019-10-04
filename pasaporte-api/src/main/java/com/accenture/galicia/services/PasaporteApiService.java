package com.accenture.galicia.services;

import java.util.List;

import com.accenture.galicia.persistance.Pasaporte;
import com.accenture.galicia.persistance.Persona;
import com.accenture.galicia.pojos.PersonaPOJO;

public interface PasaporteApiService {
	
	public void crearPersona(PersonaPOJO persona);
	public List<Persona> getPersonas();
	public Persona getPersona(String idPersona);

}
