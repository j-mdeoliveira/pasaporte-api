package com.accenture.galicia.persistance;

public enum Antecedente {
	NO_ANTECEDENTE("No tiene antecedentes"),
	ANTECEDENTE_1("Robo"),
	ANTECEDENTE_2("Lavado de dinero"),
	ANTECEDENTE_3("Homicidio");
	
	private String descripcion;
	
	Antecedente(String descripcion){
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}

}
