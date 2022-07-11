package de.novatec.clean.architecture.fahrzeugbewertung.usecase.in;

import de.novatec.clean.architecture.fahrzeugbewertung.domain.model.Fahrzeugbewertung;

public interface CreateFahrzeugbewertung {
    Fahrzeugbewertung create(Fahrzeugbewertung fahrzeugbewertung);
}
