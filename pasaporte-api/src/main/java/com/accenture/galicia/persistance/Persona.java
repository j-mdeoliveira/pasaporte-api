package com.accenture.galicia.persistance;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Persona")
public class Persona implements Serializable{
	
	@Id
	@NotNull
	private String id;
	
	private Pasaporte pasaporte;
	
	@NotNull
	private Pais pais;
	
	@NotNull
	private String nombre;
	
	@NotNull 
	private String apellido;
	
	@NotNull
	private String direccion;
	
	@NotNull
	private List<Antecedente> antecedentes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Pasaporte getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Antecedente> getAntecedentes() {
		return antecedentes;
	}

	public void setAntecedentes(List<Antecedente> antecedentes) {
		this.antecedentes = antecedentes;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", pasaporte=" + pasaporte + ", pais=" + pais + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", direccion=" + direccion + ", antecedentes=" + antecedentes + "]";
	}
			
}
