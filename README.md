# pluginsTestAnnotations
The annotation works based on the two Environment Variables:

AUTOMATION_TESTS_CONTEXT_RUN

PLUGIN_VERSION
## Using in code

This is example an annotation using for E2E tests
```Groovy
@E2E
def someE2ETest(){
...
when:
...
then
...
}
```
This is example an annotation using for New Feature tests in Plugin version 1.0.0 scope (Run the test just when )
```Groovy
@NewFeature(pluginVersion = "1.0.0")
```
This annotation using for Regression tests (no additional parameters)
```Groovy
@Regression
```
This annotation using for Sanity tests (no additional parameters)
```Groovy
@Sanity
```
Environment variables:

AUTOMATION_TESTS_CONTEXT_RUN

PLUGIN_VERSION

Possible values:

AUTOMATION_TESTS_CONTEXT_RUN=E2E;Regression;Sanity (use any or all of the list)

PLUGIN_VERSION=1.2.3
