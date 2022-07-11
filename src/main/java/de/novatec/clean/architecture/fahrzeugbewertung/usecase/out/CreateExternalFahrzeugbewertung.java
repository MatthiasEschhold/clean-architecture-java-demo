package de.novatec.clean.architecture.fahrzeugbewertung.usecase.out;

import de.novatec.clean.architecture.fahrzeugbewertung.domain.model.Fahrzeugbewertung;

public interface CreateExternalFahrzeugbewertung {

    Fahrzeugbewertung create(Fahrzeugbewertung fahrzeugbewertung);

}
