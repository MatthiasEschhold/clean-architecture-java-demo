package de.novatec.clean.architecture.fahrzeug.usecase.out;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;

public interface FetchExternalFahrzeug {

    Fahrzeug fetch(String fahrgestellnummmer);
}
