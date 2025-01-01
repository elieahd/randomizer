# Randomizer

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=elieahd_randomizer&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=elieahd_randomizer)
[![codecov](https://codecov.io/github/elieahd/randomizer/graph/badge.svg?token=Z8LY9K22WV)](https://codecov.io/github/elieahd/randomizer)

## Types

### Field types

| Usage                                                   | Description                                                                                                 |
|---------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|
| `int output = random(int.class);`                       | random `int` between `0` and `100`                                                                          |
| `Integer output = random(Integer.class);`               | random `Integer` between `0` and `100`                                                                      |
| `float output = random(float.class);`                   | random `float` between `0.0f` and `100.0f`                                                                  |
| `Float output = random(Float.class);`                   | random `Float` between `0.0f` and `100.0f`                                                                  |
| `double output = random(double.class);`                 | random `double` between `0.0` and `100.0`                                                                   |
| `Double output = random(Double.class);`                 | random `Double` between `0.0` and `100.0`                                                                   |
| `long output = random(long.class);`                     | random `long` between `0L` and `100L`                                                                       |
| `Long output = random(Long.class);`                     | random `Long` between `0L` and `100L`                                                                       |
| `short output = random(short.class);`                   | random `short` between `0` and `100`                                                                        |
| `Short output = random(Short.class);`                   | random `Short` between `0` and `100`                                                                        |
| `BigDecimal output = random(BigDecimal.class);`         | random `BigDecimal` between `BigDecimal.ZERO` and `BigDecimal.valueOf(100.0)`                               |
| `BigInteger output = random(BigInteger.class);`         | random `BigInteger` between `BigInteger.ZERO` and `BigInteger.valueOf(100L)`                                |
| `String output = random(String.class);`                 | random `String` of 10 characters alphanumeric values (uppercase and lowercase) including special characters |
| `Character output = random(Character.class);`           | random `Character` letters                                                                                  |
| `char output = random(char.class);`                     | random `char` letters                                                                                       |
| `Byte output = random(Byte.class);`                     | random `Byte` between `-128` and `127`                                                                      |
| `byte output = random(byte.class);`                     | random `byte` between `-128` and `127`                                                                      |
| `BigInteger output = random(BigInteger.class);`         | random `BigInteger` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                                |
| `Date output = random(Date.class);`                     | random `java.util.Date` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                            |
| `Date output = random(Date.class);`                     | random `java.sql.Date` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                             |
| `LocalDate output = random(LocalDate.class);`           | random `LocalDate` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                                 |
| `LocalTime output = random(LocalTime.class);`           | random `LocalTime` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                                 |
| `LocalDateTime output = random(LocalDateTime.class);`   | random `LocalDateTime` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                             |
| `ZonedDateTime output = random(ZonedDateTime.class);`   | random `ZonedDateTime` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                             |
| `OffsetDateTime output = random(OffsetDateTime.class);` | random `OffsetDateTime` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                            |
| `OffsetTime output = random(OffsetTime.class);`         | random `OffsetTime` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                                |
| `Instant output = random(Instant.class);`               | random `Instant` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                                   |
| `Color output = random(Color.class);`                   | random an enum value (exception is thrown if enum does not contains any values)                             |

### Collection randomizer

| Usage                                                                      | Description                                                                       |
|----------------------------------------------------------------------------|-----------------------------------------------------------------------------------|
| `List<String> elements = randomListOf(String.class)`                       | generate a list of 5 elements of random string                                    |
| `Map<Integer, String> elements = randomMapOf(Integer.class, String.class)` | generate a map of 5 elements of random integer as key with value as random string |
| `Set<String> elements = randomSetOf(String.class)`                         | generate a set of 5 elements of random string                                     |
| `String[] elements = randomArrayOf(String.class)`                          | generate an array of 5 elements of random string                                  |
| `Stream<String> elements = randomStreamOf(String.class)`                   | generate a stream of 5 elements of random string                                  |

## Todo / Backlog

| Category        | Description                                              | Version |
|-----------------|----------------------------------------------------------|---------|
| `Devops`        | publish artifact to maven central                        | `0.2.0` |
| `Functionality` | randomize object (e.g. `random(Person.class)`            | `0.3.0` |
| `Functionality` | randomize record (e.g. `random(Person.class)`            | `0.3.0` |
| `Functionality` | randomize collection (e.g. `randomListOf(Person.class)`) | `0.3.0` |
| `Functionality` | configure randomizer parameter                           |         |
| `Functionality` | register/override randomizers                            |         |
| `Performance`   | performance and KPI for each method                      |         |
| `Performance`   | cache collection randomizers                             |         |
| `Documentation` | `MKDocs` site to document functionalities and capacities |         |

## Pipelines

| Event            | Description                                                                  | Pipeline                                                                                                                                                                                                        | 
|------------------|------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `push` on `main` | Pre-Checks (test + codecov + sonar), <br/> Deployment (deploy, tag, release) | [![🚀 Deploy](https://github.com/elieahd/randomizer/actions/workflows/deploy-on-push.yaml/badge.svg)](https://github.com/elieahd/randomizer/actions/workflows/deploy-on-push.yaml)                              |
| `pull request`   | Checks (test + sonar)                                                        | [![✅ PR checks](https://github.com/elieahd/randomizer/actions/workflows/checks-on-pull-requests.yaml/badge.svg)](https://github.com/elieahd/randomizer/actions/workflows/checks-on-pull-requests.yaml)          |
| `weekly`         | Dependabot updates <br/> maintaining maven and github actions dependencies   | [![Dependabot Updates](https://github.com/elieahd/randomizer/actions/workflows/dependabot/dependabot-updates/badge.svg)](https://github.com/elieahd/randomizer/actions/workflows/dependabot/dependabot-updates) |
