package com.electriccloud.plugins.annotations;

import groovy.lang.Closure;
import org.spockframework.runtime.extension.AbstractAnnotationDrivenExtension;
import org.spockframework.runtime.extension.ExtensionException;
import org.spockframework.runtime.extension.builtin.PreconditionContext;
import org.spockframework.runtime.model.FeatureInfo;
import org.spockframework.runtime.model.ISkippable;
import org.spockframework.runtime.model.SpecInfo;

public class NewFeatureExtension extends AbstractAnnotationDrivenExtension<NewFeature> {
    @Override
    public void visitSpecAnnotation(NewFeature annotation, SpecInfo spec) {
        doVisit(annotation, spec);
    }

    @Override
    public void visitFeatureAnnotation(NewFeature annotation, FeatureInfo feature) {
        doVisit(annotation, feature);
    }

    private void doVisit(NewFeature annotation, ISkippable skippable) {
        String automationTestsContextRun = System.getenv("AUTOMATION_TESTS_CONTEXT_RUN");
        String pluginVersion = System.getenv("PLUGIN_VERSION");
        if (!((automationTestsContextRun.contains("NewFeature") && (pluginVersion.contains(annotation.value())))||(automationTestsContextRun.contains("Regression")))){
            skippable.setSkipped(true);
        }

    }


}