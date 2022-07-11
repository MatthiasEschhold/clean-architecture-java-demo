package de.novatec.clean.architecture.fahrzeugangebot.adapter.out;

import de.novatec.clean.architecture.fahrzeugangebot.domain.model.Fahrzeugangebot;
import de.novatec.clean.architecture.fahrzeugangebot.usecase.out.FahrzeugangebotDbCommand;
import de.novatec.clean.architecture.fahrzeugangebot.usecase.out.FahrzeugangebotDbQuery;

import java.util.List;

public class FahrzeugangebotRepository implements FahrzeugangebotDbQuery, FahrzeugangebotDbCommand {

    @Override
    public Fahrzeugangebot save(Fahrzeugangebot fahrzeugangebot) {
        return null;
    }

    @Override
    public Fahrzeugangebot findByAngebotsnummer(String angebotsnummer) {
        return null;
    }

    @Override
    public List<Fahrzeugangebot> findAll() {
        return null;
    }
}
