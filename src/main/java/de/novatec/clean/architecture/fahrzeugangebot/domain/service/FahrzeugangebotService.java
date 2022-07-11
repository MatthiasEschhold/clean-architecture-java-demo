package de.novatec.clean.architecture.fahrzeugangebot.domain.service;

import de.novatec.clean.architecture.fahrzeugangebot.domain.model.Fahrzeugangebot;
import de.novatec.clean.architecture.fahrzeugangebot.usecase.in.CreateFahrzeugangebot;
import de.novatec.clean.architecture.fahrzeugangebot.usecase.in.ReadFahrzeugangebot;
import de.novatec.clean.architecture.fahrzeugangebot.usecase.out.FahrzeugangebotDbCommand;
import de.novatec.clean.architecture.fahrzeugangebot.usecase.out.FahrzeugangebotDbQuery;

public class FahrzeugangebotService implements CreateFahrzeugangebot, ReadFahrzeugangebot {

    private final FahrzeugangebotDbCommand dbCommand;
    private final FahrzeugangebotDbQuery dbQuery;

    public FahrzeugangebotService(FahrzeugangebotDbCommand dbCommand, FahrzeugangebotDbQuery dbQuery) {
        this.dbCommand = dbCommand;
        this.dbQuery = dbQuery;
    }

    @Override
    public Fahrzeugangebot create(Fahrzeugangebot fahrzeugangebot) {
        return null;
    }

    @Override
    public Fahrzeugangebot read(String angebotsnummer) {
        return null;
    }
}
