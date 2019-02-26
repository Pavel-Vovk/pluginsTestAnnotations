# pluginsTestAnnotations
The annotations works based on the two Environment Variables:

- AUTOMATION_TESTS_CONTEXT_RUN

- PLUGIN_VERSION
## Using in code
This is example an annotation using for Sanity tests (no additional parameters, just declaration in AUTOMATION_TESTS_CONTEXT_RUN env var)
```Groovy
@Sanity
def someSanityTest(){
...
when:
...
then
...
}
```
This is example an annotation using for E2E tests (no additional parameters, just declaration in AUTOMATION_TESTS_CONTEXT_RUN env var)
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
This annotation using for Regression tests (no additional parameters, just declaration in AUTOMATION_TESTS_CONTEXT_RUN env var)
```Groovy
@Regression
def someRegressionTest(){
...
when:
...
then
...
}
```
This is example an annotation using for New Feature tests in Plugin version 1.0.0 scope (Run the test just when the Plugin version equals to pluginVersion or when Regression declared in AUTOMATION_TESTS_CONTEXT_RUN)
```Groovy
@NewFeature(pluginVersion = "1.0.0")
def someNewFeatureTest(){
...
when:
...
then
...
}
```
## Environment variables:

- AUTOMATION_TESTS_CONTEXT_RUN

- PLUGIN_VERSION

## Possible values:
Use any one or all of them in any order
```Groovy
AUTOMATION_TESTS_CONTEXT_RUN=E2E,Regression,Sanity
```
This variable should be exact corresponding to pluginVersion in @NewFeature(pluginVersion = "1.2.3")
```Groovy
PLUGIN_VERSION=1.2.3
```