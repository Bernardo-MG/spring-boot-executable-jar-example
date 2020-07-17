# Maven Executable JAR Example

Sets up an executable JAR through Maven. All the configuration is applied in the POM, and the included Main class will be executed.

To test the project first package it:

```
mvn clean package
```

Afterwards the jar will be in the target folder. It can be run as any runnable jar:

```
java -jar target/executable.jar
```

All it does is printing to the log.
