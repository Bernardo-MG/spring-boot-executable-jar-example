# Spring Boot Executable JAR Example

Sets up an executable JAR through Spring Boot. All the configuration is applied in the POM, and the included Main class will be executed.

To test the project first package it:

```
mvn clean package
```

Afterwards a runnable jar will be in the target folder. It can be run like this:

```
java -jar target/executable.jar
```

All it does is printing to the log.

## Features

- Executable JAR using Maven and Spring Boot

## Collaborate

Any kind of help with the project will be well received, and there are two main ways to give such help:

- Reporting errors and asking for extensions through the issues management
- or forking the repository and extending the project

### Issues management

Issues are managed at the GitHub [project issues tracker][issues], where any Github user may report bugs or ask for new features.

### Getting the code

If you wish to fork or modify the code, visit the [GitHub project page][scm], where the latest versions are always kept. Check the 'master' branch for the latest release, and the 'develop' for the current, and stable, development version.

## License

The project has been released under the [MIT License][license].

[issues]: https://github.com/bernardo-mg/spring-boot-executable-jar-example/issues
[license]: https://www.opensource.org/licenses/mit-license.php
[scm]: https://github.com/bernardo-mg/spring-boot-executable-jar-example
