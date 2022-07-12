package de.novatec.clean.architecture.fahrzeug.adapter.out;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface FahrzeugToVehicleDtoMapper {

    @Mappings({
            @Mapping(target = "fahrgestellnummer", source = "vin"),
            @Mapping(target = "fahrzeugmodell", source = "modelType"),
            @Mapping(target = "kilometerstand", source = "mileage")
    })
    Fahrzeug mapVehicleDtoToFahrzeug(VehicleDto vehicleDto);

    @Mappings({
            @Mapping(target = "vin", source = "fahrgestellnummer"),
            @Mapping(target = "modelType", source = "fahrzeugmodell"),
            @Mapping(target = "mileage", source = "kilometerstand")
    })
    VehicleDto mapFarzeugToVehicleDto(Fahrzeug fahrzeug);
}
