package com.electriccloud.plugins.annotations;

import org.spockframework.runtime.extension.AbstractAnnotationDrivenExtension;
import org.spockframework.runtime.model.FeatureInfo;
import org.spockframework.runtime.model.ISkippable;
import org.spockframework.runtime.model.SpecInfo;

public class RegressionExtension extends AbstractAnnotationDrivenExtension<Regression> {
    @Override
    public void visitSpecAnnotation(Regression annotation, SpecInfo spec) {
        doVisit(annotation, spec);
    }

    @Override
    public void visitFeatureAnnotation(Regression annotation, FeatureInfo feature) {
        doVisit(annotation, feature);
    }

    private void doVisit(Regression annotation, ISkippable skippable) {
        String automationTestsContextRun = System.getenv("AUTOMATION_TESTS_CONTEXT_RUN");
        if (!automationTestsContextRun.contains("Regression")) {
            skippable.setSkipped(true);
        }
    }
}