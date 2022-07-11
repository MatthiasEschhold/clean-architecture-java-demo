package de.novatec.clean.architecture.fitness.function;

import com.tngtech.archunit.base.DescribedPredicate;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.library.Architectures;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@AnalyzeClasses(packages = "de.novatec.clean.architecture")
public class CleanArchitectureAllRingsCheck {

    @ArchTest
    void should_check_all_rings_using_onion_architecture_template(JavaClasses importedClasses) {
        Architectures.OnionArchitecture rules = onionArchitecture()
                .domainModels("..domain.model..")
                .domainServices("..domain.service..")
                .applicationServices("..application.service..")
                .adapter("adapter.out", "..adapter.out..")
                .adapter("adapter.in", "..adapter.in..");
        rules.check(importedClasses);
    }

    @ArchTest
    void should_check_all_rings_using_clean_architecture_template(JavaClasses importedClasses) {
        /*  CleanArchitecture rule = CleanArchitecture.cleanArchitecture(CleanArchitectureCheck.ALL_RINGS_ARCHITECTURAL_EXPRESSIVE)
                .domainModel("..domain.model..")
                .domainService("..domain.service..")
                .applicationService("..application.service..")
                .adapterIn("..adapter.in..")
                .adapterOut("..adapter.out..")
                .useCaseIn("..usecase.in..")
                .useCaseOut("..usecase.out..")
                .sharedOutputAdapter("..shared.output.adapter.fahrzeug..")
                .serviceDecorator("..fahrzeugbewertung.decorator.usecase.in..")
                .adapterOutOfAdapterOutUseCaseInPattern("..fahrzeugangebot.adapter.out.fahrzeugpreis..",
                        "..fahrzeugservice.adapter.out.ersatzteile..")
                .supportingService("..supporting.service.email..")
                .sharedKernel("..shared.kernel.fahrzeug..")
                .ignore("..fahrzeugbewertung.facade.adapterfacade..");

        rule.check(javaClasses); */
    }
    
}
