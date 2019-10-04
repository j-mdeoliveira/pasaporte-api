package com.accenture.galicia.persistance;

public enum Pais {

	Canada("Otawa"), 
	EstadosUnidos("Washington"),
	Mexico("Ciudad de Mexico"),
	Argentina("Ciudad Autónoma de Buenos Aires"),
	Bolivia("Sucre"),
	Brasil("Brasilia"),
	Chile("Santiago"),
	Colombia("Bogota"),
	Ecuador("Quito"),
	Guyana("Georgetown"), 
	GuayanaFrancesa("Cayena"), 
	Paraguay("Asunción"), 
	Peru("Lima"), 
	Surinam("Paramaribo"), 
	Uruguay("Montevideo"), 
	Venezuela("Caracas"),
	AntiguaYBarbuda("Saint John’s"),
	Bahamas("Nassau"),
	Barbados("Bridgetwon"),
	Belice("Belmopan"),
	CostaRica("San Jose"),
	Cuba("La Habana"),
	ElSalvador("Salvador"),
	Guatemala("St. George’s"),
	Haiti("Puerto Príncipe"),
	Honduras("Tegucigalpa"),
	Jamaica("Kingston"),
	Nicaragua("Managua"),
	Panama("Ciudad de Panama"),
	PuertoRico("San Jose"),
	RepúblicaDominicana("Santo Domingo");

	private final String value;
	
    Pais(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
