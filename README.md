## Steps to reproduce this problem

Run the following comment in current project's root directory:

```shell
./mvnw clean test
```

### Expected behavior

Expect all tests passed.

### Actual behavior

Actually, build failed with error log like this:

```text
Caused by: java.lang.ClassNotFoundException: com.azure.spring.data.cosmos.config.AbstractCosmosConfiguration
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641) ~[na:na]
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188) ~[na:na]
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:525) ~[na:na]
        ... 116 common frames omitted

[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 1.263 s <<< FAILURE! -- in rujche.problem.reproduce.SubModuleTwoAllNestedConditionTest
...
```

### More details

For more details, please read the source code.
