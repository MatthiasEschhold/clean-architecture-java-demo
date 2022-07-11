package de.novatec.clean.architecture.fahrzeug.domain.service;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.novatec.clean.architecture.fahrzeug.usecase.in.FetchFahrzeug;
import de.novatec.clean.architecture.fahrzeug.usecase.out.FetchExternalFahrzeug;

public class FahrzeugService implements FetchFahrzeug {

    private final FetchExternalFahrzeug fetchExternalFahrzeug;

    public FahrzeugService(FetchExternalFahrzeug fetchExternalFahrzeug) {
        this.fetchExternalFahrzeug = fetchExternalFahrzeug;
    }

    @Override
    public Fahrzeug fetch(String fahrgestellnummer) {
        return null;
    }
}
