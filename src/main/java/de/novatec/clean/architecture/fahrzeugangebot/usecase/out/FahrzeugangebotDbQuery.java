package de.novatec.clean.architecture.fahrzeugangebot.usecase.out;

import de.novatec.clean.architecture.fahrzeugangebot.domain.model.Fahrzeugangebot;

import java.util.List;

public interface FahrzeugangebotDbQuery {
    Fahrzeugangebot findByAngebotsnummer(String angebotsnummer);

    List<Fahrzeugangebot> findAll();
}
