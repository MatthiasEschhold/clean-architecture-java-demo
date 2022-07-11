package de.novatec.clean.architecture.fahrzeugangebot.adapter.in;

import de.novatec.clean.architecture.fahrzeugangebot.usecase.in.CreateFahrzeugangebot;
import de.novatec.clean.architecture.fahrzeugangebot.usecase.in.ReadFahrzeugangebot;

public class FahrzeugangebotController {

    private final ReadFahrzeugangebot readFahrzeugangebot;
    private final CreateFahrzeugangebot createFahrzeugangebot;

    public FahrzeugangebotController(ReadFahrzeugangebot readFahrzeugangebot, CreateFahrzeugangebot createFahrzeugangebot) {
        this.readFahrzeugangebot = readFahrzeugangebot;
        this.createFahrzeugangebot = createFahrzeugangebot;
    }
}
