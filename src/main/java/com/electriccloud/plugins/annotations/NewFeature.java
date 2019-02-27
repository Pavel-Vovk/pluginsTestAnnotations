package com.electriccloud.plugins.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.spockframework.runtime.extension.ExtensionAnnotation;

/**
 * Ignores the annotated spec for NewFeature in AUTOMATION_TESTS_CONTEXT_RUN regression
 * and values in PLUGIN_VERSION
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@ExtensionAnnotation(NewFeatureExtension.class)
public @interface NewFeature {
   //String value() default "";
    String pluginVersion() default "[unassigned]";
}
