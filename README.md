# pluginsTestAnnotations
```Groovy
@E2E
```
This annotation using for E2E tests
```Groovy
@NewFeature(pluginVersion = "1.0.0")
```
This annotation using for New Feature tests for Plugin version 1.0.0
```Groovy
@Regression
```
This annotation using for Regression tests (no additional parameters)

@Sanity - this annotation using for Sanity tests (no additional parameters)
```
Environment variables:

AUTOMATION_TESTS_CONTEXT_RUN

PLUGIN_VERSION

Possible values:

AUTOMATION_TESTS_CONTEXT_RUN=E2E;Regression;Sanity (use any or all of the list)

PLUGIN_VERSION=1.2.3
