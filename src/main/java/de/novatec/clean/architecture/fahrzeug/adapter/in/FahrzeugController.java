package de.novatec.clean.architecture.fahrzeug.adapter.in;

import de.novatec.clean.architecture.fahrzeug.usecase.in.FetchFahrzeug;

public class FahrzeugController {

    private final FetchFahrzeug fetchFahrzeug;
    private final FahrzeugToFahrzeugResourceMapper mapper;

    public FahrzeugController(FetchFahrzeug fetchFahrzeug, FahrzeugToFahrzeugResourceMapper mapper) {
        this.fetchFahrzeug = fetchFahrzeug;
        this.mapper = mapper;
    }

    public FahrzeugResource getFahrzeug(String fahrgestellnummer) {
        return null;
    }
}
