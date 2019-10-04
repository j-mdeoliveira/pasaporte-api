package com.accenture.galicia.persistance;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Pasaporte")
public class Pasaporte implements Serializable{
	
	@Id
	@NotNull
	private String id;
	
	@NotNull
	private Persona persona;
	
	@NotNull
	private Pais pais;
	
	@NotNull
	private Date fechaCreacion;

		
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public Persona getPersona() {
		return persona;
	}



	public void setPersona(Persona persona) {
		this.persona = persona;
	}



	public Pais getPais() {
		return pais;
	}



	public void setPais() {
		this.pais = this.persona.getPais();
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}



	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}



	@Override
	public String toString() {
		return "Pasaporte [id=" + id + ", persona=" + persona + ", pais=" + pais + ", fechaCreacion=" + fechaCreacion
				+ "]";
	}
	
	

}
