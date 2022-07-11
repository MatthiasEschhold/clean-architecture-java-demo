package de.novatec.clean.architecture.fitness.function;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "de.novatec.clean.architecture")
public class CleanArchitectureRootEntityModularizationCheck {

    @ArchTest
    void should_not_use_classes_of_other_module(JavaClasses importedClasses) {

    }

}
