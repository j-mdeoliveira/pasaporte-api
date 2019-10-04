package com.accenture.galicia.pojos;

import java.util.List;

import com.accenture.galicia.persistance.Antecedente;
import com.accenture.galicia.persistance.Pais;

public class PersonaPOJO {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private Pais pais;
	private List<Antecedente> antecedente;
	
	
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
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public List<Antecedente> getAntecedente() {
		return antecedente;
	}
	public void setAntecedente(List<Antecedente> antecedente) {
		this.antecedente = antecedente;
	}

	

}
