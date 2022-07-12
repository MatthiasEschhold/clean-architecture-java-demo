package de.novatec.clean.architecture.fitness.function;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ImportOption.DoNotIncludeArchives;
import com.tngtech.archunit.core.importer.ImportOption.DoNotIncludeJars;
import com.tngtech.archunit.core.importer.ImportOption.DoNotIncludeTests;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "de.novatec.clean.architecture", importOptions = {
        DoNotIncludeTests.class, DoNotIncludeArchives.class, DoNotIncludeJars.class
})
public class CleanArchitectureDetailRingCheck {

    @ArchTest
    void should_check_domain_service_ring(JavaClasses importedClasses) {
        ArchRule rules = classes()
                .that()
                .resideInAPackage("..domain.service..")
                .should()
                .onlyAccessClassesThat()
                .resideInAnyPackage("..domain..", "..usecase.out..", "..java..");
        rules.check(importedClasses);
    }

    @ArchTest
    void should_check_domain_model_ring(JavaClasses importedClasses) {
        ArchRule rules = classes()
                .that()
                .resideInAPackage("..domain.model..")
                .should()
                .onlyAccessClassesThat()
                .resideInAnyPackage("..domain.model..", "..java..");
        rules.check(importedClasses);
    }

    @ArchTest
    void should_check_adapter_in_ring(JavaClasses importedClasses) {
        ArchRule rules = classes()
                .that()
                .resideInAPackage("..adapter.in..")
                .should()
                .onlyAccessClassesThat()
                .resideInAnyPackage("..adapter.in..", "..usecase.in..", "..domain.model..", "..java..");
        rules.check(importedClasses);
    }

    @ArchTest
    void should_check_adapter_out_ring(JavaClasses importedClasses) {
        ArchRule rules = classes()
                .that()
                .resideInAPackage("..adapter.out..")
                .should()
                .onlyAccessClassesThat()
                .resideInAnyPackage("..adapter.out..", "..domain.model..", "..java..");
        rules.check(importedClasses);
    }

    @ArchTest
    void should_check_usecase_in_ring(JavaClasses importedClasses) {
        ArchRule rules = classes()
                .that()
                .resideInAPackage("..usecase.in..")
                .should()
                .onlyAccessClassesThat()
                .resideInAnyPackage("..domain.model..", "..java..");
        rules.check(importedClasses);
    }

    @ArchTest
    void should_check_usecase_out_ring(JavaClasses importedClasses) {
        ArchRule rules = classes()
                .that()
                .resideInAPackage("..usecase.out..")
                .should()
                .onlyAccessClassesThat()
                .resideInAnyPackage("..domain.model..", "..java..");
        rules.check(importedClasses);
    }
}
