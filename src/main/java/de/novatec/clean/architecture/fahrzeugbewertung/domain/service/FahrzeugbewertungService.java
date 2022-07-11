package de.novatec.clean.architecture.fahrzeugbewertung.domain.service;

import de.novatec.clean.architecture.fahrzeugbewertung.domain.model.Fahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.usecase.in.CreateFahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.usecase.out.CreateExternalFahrzeugbewertung;

public class FahrzeugbewertungService implements CreateFahrzeugbewertung {

    private final CreateExternalFahrzeugbewertung createExternalFahrzeugbewertung;

    public FahrzeugbewertungService(CreateExternalFahrzeugbewertung createExternalFahrzeugbewertung) {
        this.createExternalFahrzeugbewertung = createExternalFahrzeugbewertung;
    }

    @Override
    public Fahrzeugbewertung create(Fahrzeugbewertung fahrzeugbewertung) {
        return null;
    }
}
