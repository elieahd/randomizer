# Randomizer

[![Maven Central](https://img.shields.io/maven-central/v/io.github.elieahd/randomizer.svg)](https://central.sonatype.com/artifact/io.github.elieahd/randomizer)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=elieahd_randomizer&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=elieahd_randomizer)
[![codecov](https://codecov.io/github/elieahd/randomizer/graph/badge.svg?token=Z8LY9K22WV)](https://codecov.io/github/elieahd/randomizer)

## Dependency

Artifact has been deployed to maven central.

```xml

<dependency>
    <groupId>io.github.elieahd</groupId>
    <artifactId>randomizer</artifactId>
    <version>0.2.3</version>
</dependency>
```

Check [here](https://central.sonatype.com/artifact/io.github.elieahd/randomizer/versions) for versions

## Backlog

|    | Category        | Description                                                                                                                                                                                                                | Version |
|----|-----------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------|
| ✅  | `Functionality` | Randomize `String` : `random(String.class)`                                                                                                                                                                                | `0.1.0` |
| ✅  | `Functionality` | Randomize numbers : <br/> -`int`/`Integer` <br/> - `float`/`Float` <br/> - `double`/`Double` <br/> - `long`/`Long` <br/> - `short`/`Short` <br/> - `BigDecimal` <br/> - `BigInteger`                                       | `0.1.0` |
| ✅  | `Functionality` | Randomize `char` : `random(Character.class)` or `random(char.class)`                                                                                                                                                       | `0.1.0` |
| ✅  | `Functionality` | Randomize `byte` : `random(Byte.class)` or `random(byte.class)`                                                                                                                                                            | `0.1.0` |
| ✅  | `Functionality` | Randomize dates : <br/> - `java.util.Date` <br/> - `java.sql.Date` <br/> - `LocalDate` <br/> - `LocalTime` <br/> - `LocalDateTime` <br/> - `ZonedDateTime` <br/> - `OffsetDateTime` <br/> - `OffsetTime` <br/> - `Instant` | `0.2.0` |
| ✅  | `Functionality` | Randomize enum (e.g. `random(Color.class)`)                                                                                                                                                                                | `0.2.0` |
| ✅  | `Functionality` | Randomize `List` of field : `randomListOf(String.class)`                                                                                                                                                                   | `0.2.0` |
| ✅  | `Functionality` | Randomize `Map` of field : `randomMapOf(Integer.class, String.class) `                                                                                                                                                     | `0.2.0` |
| ✅  | `Functionality` | Randomize `Set` of field : `randomSetOf(String.class)`                                                                                                                                                                     | `0.2.0` |
| ✅  | `Functionality` | Randomize `Array` of field : `randomArrayOf(String.class)`                                                                                                                                                                 | `0.2.0` |
| ✅  | `Functionality` | Randomize `Stream` of field : `randomStreamOf(String.class)`                                                                                                                                                               | `0.2.0` |
| ✅  | `Performance`   | Cache field randomizer                                                                                                                                                                                                     | `0.2.0` |
| ✅  | `Devops`        | Automatic pipeline on push on main : <br/> - Pre-Checks (tests + sonar + codecov) <br/> - Deployment (package, deploy to maven central, tag, release)                                                                      | `0.2.0` |
| ✅  | `Devops`        | Automatic pipeline on PR : <br/> - tests <br/> - sonar analysis <br/> - sonar quality gate)                                                                                                                                | `0.2.0` |
| ✅  | `Devops`        | Weekly dependabot pipeline for dependencies (maven + github actions)                                                                                                                                                       | `0.2.0` |
| ✅  | `Devops`        | Deploy artifact to maven central                                                                                                                                                                                           | `0.2.0` |
| 🔲 | `Functionality` | randomize object (e.g. `random(Person.class)`                                                                                                                                                                              | `0.3.0` |
| 🔲 | `Functionality` | randomize record (e.g. `random(Person.class)`                                                                                                                                                                              | `0.3.0` |
| 🔲 | `Functionality` | randomize collection of objects (e.g. `randomListOf(Person.class)`)                                                                                                                                                        | `0.3.0` |
| ✅  | `Bug`           | fix infinite loop issue in Map randomizer (keys < number of elements)                                                                                                                                                      | `0.3.0` |
| 🔲 | `Functionality` | configure randomizer parameter                                                                                                                                                                                             | `0.4.0` |
| 🔲 | `Functionality` | register/override randomizers                                                                                                                                                                                              | `0.4.0` |
| 🔲 | `Performance`   | cache collection randomizers                                                                                                                                                                                               | `0.4.0` |
| 🔲 | `Performance`   | performance and KPI for each method                                                                                                                                                                                        | `0.4.0` |
| 🔲 | `Documentation` | `MKDocs` site to document functionalities and capacities                                                                                                                                                                   |         |
| 🔲 | `Documentation` | `Java Doc`                                                                                                                                                                                                                 |         |
| 🔲 | `Documentation` | `Medium` article on randomizing data in tests                                                                                                                                                                              |         |

## Pipelines

| Event            | Description                                                                  | Pipeline                                                                                                                                                                                                        | 
|------------------|------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `push` on `main` | Pre-Checks (test + codecov + sonar), <br/> Deployment (deploy, tag, release) | [![🚀 Deploy](https://github.com/elieahd/randomizer/actions/workflows/deploy-on-push.yaml/badge.svg)](https://github.com/elieahd/randomizer/actions/workflows/deploy-on-push.yaml)                              |
| `pull request`   | Checks (test + sonar)                                                        | [![✅ PR checks](https://github.com/elieahd/randomizer/actions/workflows/checks-on-pull-requests.yaml/badge.svg)](https://github.com/elieahd/randomizer/actions/workflows/checks-on-pull-requests.yaml)          |
| `weekly`         | Dependabot updates <br/> maintaining maven and github actions dependencies   | [![Dependabot Updates](https://github.com/elieahd/randomizer/actions/workflows/dependabot/dependabot-updates/badge.svg)](https://github.com/elieahd/randomizer/actions/workflows/dependabot/dependabot-updates) |
