package de.novatec.clean.architecture.fahrzeugbewertung.adapter.in;

import de.novatec.clean.architecture.fahrzeugbewertung.usecase.in.CreateFahrzeugbewertung;

public class FahrzeugbewertungController {
    private final CreateFahrzeugbewertung createFahrzeugbewertung;

    public FahrzeugbewertungController(CreateFahrzeugbewertung createFahrzeugbewertung) {
        this.createFahrzeugbewertung = createFahrzeugbewertung;
    }
}
