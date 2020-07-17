# Spring Boot Executable JAR Example

Sets up an executable JAR through Spring Boot. All the configuration is applied in the POM, and the included Main class will be executed.

To test the project first package it:

```
mvn clean package
```

Afterwards the jar will be in the target folder. It can be run as any runnable jar:

```
java -jar target/executable-spring-boot.jar
```

All it does is printing to the log.

[![Release docs](https://img.shields.io/badge/docs-release-blue.svg)][site-release]
[![Development docs](https://img.shields.io/badge/docs-develop-blue.svg)][site-develop]

[![Release javadocs](https://img.shields.io/badge/javadocs-release-blue.svg)][javadoc-release]
[![Development javadocs](https://img.shields.io/badge/javadocs-develop-blue.svg)][javadoc-develop]

## Features

- Executable JAR using only Maven

## Documentation

Documentation is always generated for the latest release, kept in the 'master' branch:

- The [latest release documentation page][site-release].
- The [latest release Javadoc site][javadoc-release].

Documentation is also generated from the latest snapshot, taken from the 'develop' branch:

- The [the latest snapshot documentation page][site-develop].
- The [latest snapshot Javadoc site][javadoc-develop].

### Building the docs

The documentation site is actually a Maven site, and its sources are included in the project. If required it can be generated by using the following Maven command:

```
$ mvn verify site
```

The verify phase is required, otherwise some of the reports won't be generated.

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
[javadoc-develop]: http://docs.bernardomg.com/development/maven/spring-boot-executable-jar-example/apidocs
[javadoc-release]: http://docs.bernardomg.com/maven/spring-boot-executable-jar-example/apidocs
[license]: https://www.opensource.org/licenses/mit-license.php
[scm]: https://github.com/bernardo-mg/spring-boot-executable-jar-example
[site-develop]: http://docs.bernardomg.com/development/maven/spring-boot-executable-jar-example
[site-release]: http://docs.bernardomg.com/maven/spring-boot-executable-jar-example
