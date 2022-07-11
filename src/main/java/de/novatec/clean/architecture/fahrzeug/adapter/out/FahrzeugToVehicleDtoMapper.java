package de.novatec.clean.architecture.fahrzeug.adapter.out;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface FahrzeugToVehicleDtoMapper {

    @Mapping(target = "fahrgestellnummer", source = "vin")
    @Mapping(target = "fahrzeugmodell", source = "modelType")
    @Mapping(target = "kilometerstand", source = "mileage")
    Fahrzeug mapToFahrzeug(VehicleDto vehicleDto);

    @Mapping(target = "vin", source = "fahrgestellnummer")
    @Mapping(target = "modelType", source = "fahrzeugmodell")
    @Mapping(target = "mileage", source = "kilometerstand")
    VehicleDto mapToVehicleDto(Fahrzeug fahrzeug);
}
