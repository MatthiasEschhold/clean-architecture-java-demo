package de.novatec.clean.architecture.fahrzeugangebot.usecase.out;

import de.novatec.clean.architecture.fahrzeugangebot.domain.model.Fahrzeugangebot;

public interface FahrzeugangebotDbCommand {
    Fahrzeugangebot save(Fahrzeugangebot fahrzeugangebot);
}
