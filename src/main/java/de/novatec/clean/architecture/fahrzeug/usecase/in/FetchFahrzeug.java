package de.novatec.clean.architecture.fahrzeug.usecase.in;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;

public interface FetchFahrzeug {
    Fahrzeug fetch(String fahrgestellnummer);
}
