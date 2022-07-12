# Agile Produktlinienarchitektur mit der Clean Architecture - Codebeispiele zur Artikelserie

## Zur Artikelserie

* Java Magazin 10/22
* Java Magazin 11/22

Am Beispiel der Root Entity Fahrzeug wird das Clean Architecture Pattern veranschaulicht. Die Strukturierung des Moduls Fahrzeug ist
architektonisch ausdrucksstark abgebildet. Für das Mapping wird die Two-Way Mapping Strategie eingesetzt.

## Mappings mit MapStruct

Library: [MapStruct](https://mapstruct.org/)

### Simples Mapping zwischen Domäne und der Infrastrukturkomponente Web

Die Two-Way Mapping Strategie kann auf Basis eines Interface annotiert mit `@Mapper` realisiert werden, 
wenn die Klasseneigenschaften den gleichen Namen haben.
Dies ist der Fall bei der Entity Fahrzeug und der FahrzeugResource.

```java
@Mapper
public interface FahrzeugToFahrzeugResourceMapper {
    Fahrzeug mapToFahrzeug(FahrzeugResource fahrzeugResource);
    FahrzeugResource mapToFahrzeugResource(Fahrzeug fahrzeug);
}

```

```java
public class Fahrzeug {
    private String fahrgestellnummer;
    private String fahrzeugmodell;
    private Double kilometerstand;

    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public void setFahrgestellnummer(String fahrgestellnummer) {
        this.fahrgestellnummer = fahrgestellnummer;
    }

    public String getFahrzeugmodell() {
        return fahrzeugmodell;
    }

    public void setFahrzeugmodell(String fahrzeugmodell) {
        this.fahrzeugmodell = fahrzeugmodell;
    }

    public Double getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(Double kilometerstand) {
        this.kilometerstand = kilometerstand;
    }
}
```

```java
public class FahrzeugResource {
    private String fahrgestellnummer;
    private String fahrzeugmodell;
    private Double kilometerstand;

    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public void setFahrgestellnummer(String fahrgestellnummer) {
        this.fahrgestellnummer = fahrgestellnummer;
    }

    public String getFahrzeugmodell() {
        return fahrzeugmodell;
    }

    public void setFahrzeugmodell(String fahrzeugmodell) {
        this.fahrzeugmodell = fahrzeugmodell;
    }

    public Double getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(Double kilometerstand) {
        this.kilometerstand = kilometerstand;
    }
}
```

### Erweiteres Mapping zwischen Domäne und der Infrastrukturkomponente ServiceClient

Besteht keine Namensgleichheit, kann durch die Annotation @Mapping, das Standardverhalten von MapStruct angepasst werden. Dies ist der Fall
im Zusammenspiel mit dem externen Datenmodell VehicleDto.

```java
public class VehicleDto {
    private String vin;
    private String modelType;
    private Double mileage;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }
}
```

```java
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
```

## Architekturtests mit ArchUnit

Ergänzend zur Root Entity Fahrzeug werden das Fahrzeugangebot und die Fahrzeugbewertung eingeführt. Für die daraus
resultierenden fachlichen Modulen, befinden sich [Fitness Functions]()
in Form von Strukturtests als Unit Tests mit Hilfe der Bibliothek [ArchUnit](https://www.archunit.org/).
Die drei Beispiele werden in der folgenden Tabelle detaillierter beschrieben.

|Unit Test|Beschreibung|
|---------|------------|
|[CleanArchitectureAllRingsCheck]()| Die Prüfung der Beziehungsregeln für alle fachlichen Module erfolgen in einem Unit Test. Dies ist anhand des [Onion Architecture Template]() und des [Clean Architecture Template]() dargestellt.|
|[CleanDetailRingCheck]()|Jeder Ring wird als separater Unit Test implementiert.|
|[CleanArchitectureRootEntityModularizationCheck]()|Dieser Test prüft die Einhaltung der fachlichen Modularisierung. Dies ist ergänzend zu den anderen Tests, da in diesen nur die Beziehungsregeln anhand der Klassen-Stereotypen geprüft werden, ohne fachliche Modulgrenzen zu berücksichtigen.|

Hinweis: Zur Verdeutlichung sind bewusst Beziehungsverletzungen zwischen Klassen-Stereotypen und den fachlichen Modulen implementiert
