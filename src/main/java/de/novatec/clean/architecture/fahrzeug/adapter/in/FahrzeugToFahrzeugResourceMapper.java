package de.novatec.clean.architecture.fahrzeug.adapter.in;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import org.mapstruct.Mapper;

@Mapper
public interface FahrzeugToFahrzeugResourceMapper {
    Fahrzeug mapToFahrzeug(FahrzeugResource fahrzeugResource);
    FahrzeugResource mapToFahrzeugResource(Fahrzeug fahrzeug);
}
