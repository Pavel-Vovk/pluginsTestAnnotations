# pluginsTestAnnotations
@E2E - this annotation using for E2E tests

@NewFeature("1.0.0") - this annotation using for New Freatuer tests for Plugin version 1.0.0

@Regression - this annotation using for Regression tests

@Sanity - this annotation using for Sanity tests

Environamnet variables:
AUTOMATION_TESTS_CONTEXT_RUN
PLUGIN_VERSION

Possible values:
AUTOMATION_TESTS_CONTEXT_RUN
AUTOMATION_TESTS_CONTEXT_RUN=E2E;Regression;Sanity (use any or all of the list)
PLUGIN_VERSION=1.2.3
