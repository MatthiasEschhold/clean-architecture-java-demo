package de.novatec.clean.architecture.fahrzeug.domain.model;

public class Fahrzeug {
    private String fahrgestellnummer;
    private String fahrzeugmodell;
    private Double kilometerstand;

    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public void setFahrgestellnummer(String fahrgestellnummer) {
        this.fahrgestellnummer = fahrgestellnummer;
    }

    public String getFahrzeugmodell() {
        return fahrzeugmodell;
    }

    public void setFahrzeugmodell(String fahrzeugmodell) {
        this.fahrzeugmodell = fahrzeugmodell;
    }

    public Double getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(Double kilometerstand) {
        this.kilometerstand = kilometerstand;
    }
}
