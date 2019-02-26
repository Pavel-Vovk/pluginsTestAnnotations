package com.electriccloud.plugins.annotations;

import org.spockframework.runtime.extension.AbstractAnnotationDrivenExtension;
import org.spockframework.runtime.model.FeatureInfo;
import org.spockframework.runtime.model.ISkippable;
import org.spockframework.runtime.model.SpecInfo;

public class E2EExtension extends AbstractAnnotationDrivenExtension<E2E> {
    @Override
    public void visitSpecAnnotation(E2E annotation, SpecInfo spec) {
        doVisit(annotation, spec);
    }

    @Override
    public void visitFeatureAnnotation(E2E annotation, FeatureInfo feature) {
        doVisit(annotation, feature);
    }

    private void doVisit(E2E annotation, ISkippable skippable) {
        String automationTestsContextRun = System.getenv("AUTOMATION_TESTS_CONTEXT_RUN");
        if (!automationTestsContextRun.contains("E2E")) {
            skippable.setSkipped(true);
        }
    }
}