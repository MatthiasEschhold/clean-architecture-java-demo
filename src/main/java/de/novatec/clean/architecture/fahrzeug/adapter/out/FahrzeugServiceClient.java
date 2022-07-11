package de.novatec.clean.architecture.fahrzeug.adapter.out;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.novatec.clean.architecture.fahrzeug.usecase.out.FetchExternalFahrzeug;

public class FahrzeugServiceClient implements FetchExternalFahrzeug {

    @Override
    public Fahrzeug fetch(String fahrgestellnummmer) {
        return null;
    }
}
