package de.novatec.clean.architecture.fitness.function;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "de.novatec.clean.architecture", importOptions = {
        ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeArchives.class, ImportOption.DoNotIncludeJars.class
})
public class CleanArchitectureRootEntityModularizationCheck {

    @ArchTest
    void classes_of_fahrzeug_should_only_access_allowed_classes(JavaClasses importedClasses) {
        ArchRule rules = classes()
                .that()
                .resideInAPackage("..fahrzeug..")
                .should()
                .onlyAccessClassesThat()
                .resideInAnyPackage("..fahrzeug..", "..java..");
        rules.check(importedClasses);
    }

    @ArchTest
    void classes_of_fahrzeugangebot_should_only_access_allowed_classes(JavaClasses importedClasses) {
        ArchRule rules = classes()
                .that()
                .resideInAPackage("..fahrzeugangebot..")
                .should()
                .onlyAccessClassesThat()
                .resideInAnyPackage("..fahrzeugangebot..", "..java..");
        rules.check(importedClasses);
    }

    @ArchTest
    void classes_of_fahrzeugbewertung_should_only_access_allowed_classes(JavaClasses importedClasses) {
        ArchRule rules = classes()
                .that()
                .resideInAPackage("..fahrzeugbewertung..")
                .should()
                .onlyAccessClassesThat()
                .resideInAnyPackage("..fahrzeugbewertung..", "..java..");
        rules.check(importedClasses);
    }

}
