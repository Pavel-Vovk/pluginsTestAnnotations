package com.electriccloud.plugins.annotations;

import org.spockframework.runtime.extension.AbstractAnnotationDrivenExtension;
import org.spockframework.runtime.model.FeatureInfo;
import org.spockframework.runtime.model.ISkippable;
import org.spockframework.runtime.model.SpecInfo;

public class SanityExtension extends AbstractAnnotationDrivenExtension<Sanity> {
    @Override
    public void visitSpecAnnotation(Sanity annotation, SpecInfo spec) {
        doVisit(annotation, spec);
    }

    @Override
    public void visitFeatureAnnotation(Sanity annotation, FeatureInfo feature) {
        doVisit(annotation, feature);
    }

    private void doVisit(Sanity annotation, ISkippable skippable) {
        String automationTestsContextRun = System.getenv("AUTOMATION_TESTS_CONTEXT_RUN");
        if (!automationTestsContextRun.contains("Sanity")) {
            skippable.setSkipped(true);
        }
    }
}