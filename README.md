# Randomizer
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=elieahd_randomizer&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=elieahd_randomizer)
[![codecov](https://codecov.io/github/elieahd/randomizer/graph/badge.svg?token=Z8LY9K22WV)](https://codecov.io/github/elieahd/randomizer)

## Types

### Field types

| Class            | Usage                                                   | Description                                                                                                 |
|------------------|---------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|
| `int`            | `int output = random(int.class);`                       | random `int` between `0` and `100`                                                                          |
| `Integer`        | `Integer output = random(Integer.class);`               | random `Integer` between `0` and `100`                                                                      |
| `float`          | `float output = random(float.class);`                   | random `float` between `0.0f` and `100.0f`                                                                  |
| `Float`          | `Float output = random(Float.class);`                   | random `Float` between `0.0f` and `100.0f`                                                                  |
| `double`         | `double output = random(double.class);`                 | random `double` between `0.0` and `100.0`                                                                   |
| `Double`         | `Double output = random(Double.class);`                 | random `Double` between `0.0` and `100.0`                                                                   |
| `long`           | `long output = random(long.class);`                     | random `long` between `0L` and `100L`                                                                       |
| `Long`           | `Long output = random(Long.class);`                     | random `Long` between `0L` and `100L`                                                                       |
| `short`          | `short output = random(short.class);`                   | random `short` between `0` and `100`                                                                        |
| `Short`          | `Short output = random(Short.class);`                   | random `Short` between `0` and `100`                                                                        |
| `BigDecimal`     | `BigDecimal output = random(BigDecimal.class);`         | random `BigDecimal` between `BigDecimal.ZERO` and `BigDecimal.valueOf(100.0)`                               |
| `BigInteger`     | `BigInteger output = random(BigInteger.class);`         | random `BigInteger` between `BigInteger.ZERO` and `BigInteger.valueOf(100L)`                                |
| `String`         | `String output = random(String.class);`                 | random `String` of 10 characters alphanumeric values (uppercase and lowercase) including special characters |
| `Character`      | `Character output = random(Character.class);`           | random `Character` letters                                                                                  |
| `char`           | `char output = random(char.class);`                     | random `char` letters                                                                                       |
| `Byte`           | `Byte output = random(Byte.class);`                     | random `Byte` between `-128` and `127`                                                                      |
| `byte`           | `byte output = random(byte.class);`                     | random `byte` between `-128` and `127`                                                                      |
| `UUID`           | `BigInteger output = random(BigInteger.class);`         | random `BigInteger` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                                |
| `Date`           | `Date output = random(Date.class);`                     | random `java.util.Date` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                            |
| `Date`           | `Date output = random(Date.class);`                     | random `java.sql.Date` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                             |
| `LocalDate`      | `LocalDate output = random(LocalDate.class);`           | random `LocalDate` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                                 |
| `LocalTime`      | `LocalTime output = random(LocalTime.class);`           | random `LocalTime` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                                 |
| `LocalDateTime`  | `LocalDateTime output = random(LocalDateTime.class);`   | random `LocalDateTime` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                             |
| `ZonedDateTime`  | `ZonedDateTime output = random(ZonedDateTime.class);`   | random `ZonedDateTime` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                             |
| `OffsetDateTime` | `OffsetDateTime output = random(OffsetDateTime.class);` | random `OffsetDateTime` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                            |
| `OffsetTime`     | `OffsetTime output = random(OffsetTime.class);`         | random `OffsetTime` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                                |
| `Instant`        | `Instant output = random(Instant.class);`               | random `Instant` between `01/01/2000 00:00:00` and `31/12/20230 23:59:59`                                   |
| `Enum`           | `Color output = random(Color.class);`                   | random an enum value (exception is thrown if enum does not contains any values)                             |

### Collection randomizer

| Class    | Usage                                                                      | Description                                                                       |
|----------|----------------------------------------------------------------------------|-----------------------------------------------------------------------------------|
| `List`   | `List<String> elements = randomListOf(String.class)`                       | generate a list of 5 elements of random string                                    |
| `Map`    | `Map<Integer, String> elements = randomMapOf(Integer.class, String.class)` | generate a map of 5 elements of random integer as key with value as random string |
| `Set`    | `Set<String> elements = randomSetOf(String.class)`                         | generate a set of 5 elements of random string                                     |
| `Array`  | `String[] elements = randomArrayOf(String.class)`                          | generate an array of 5 elements of random string                                  |
| `Stream` | `Stream<String> elements = randomStreamOf(String.class)`                   | generate a stream of 5 elements of random string                                  |

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
