# Randomizer
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=elieahd_randomizer&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=elieahd_randomizer)

```xml
<dependency>
    <groupId>com.devt</groupId>
    <artifact>randomizer</artifact>
    <version>0.1.0</version>
</dependency>
```

## Roadmap

### V`0.1.0`
| Functionality                        | Return type         | Methods                                                                                           |
|--------------------------------------|---------------------|---------------------------------------------------------------------------------------------------|
| Alphanumeric                         | `String`            | `randomAlphanumeric()` / `randomAlphanumeric(30)`                                                 |
| Alphabetic                           | `String`            | `randomAlphabetic()` / `randomAlphabetic(30)`                                                     |
| Alphanumeric with special characters | `String`            | `randomAlphanumericWithSpecialCharacters()` / `randomAlphanumericWithSpecialCharacters(30)`       |
| Double                               | `Double`            | `randomDouble()` / `randomDouble(60.0, 70.0)`                                                     |
| Integer                              | `Integer`           | `randomInteger()` / `randomInteger(50, 60)`                                                       |
| Enum                                 | `T extends Enum<T>` | `randomEnum(Color.class);`                                                                        |
| List                                 | `List<T>`           | `randomListOf(i -> randomAlphanumeric())` / `randomListOf(i -> randomEnum(Color.class), 10);`     |
- `Devops` : automatic checks on PR 
  - tests
  - sonar analysis
  - sonar quality gate
- `Devops` : automatic deployments on push on `main` 
  - pre-checks (tests, sonar analysis, sonar analysis gate)
  - package
  - tag in github
  - create release
  - deploy artifact on a maven artifactory
  - automatic version

### V`0.2.0`
- more primitive support
  - long / Long
  - float / Float
  - char / Character
  - short / Short
  - byte / Byte
  - BigDecimal
  - BigInteger
  - LocalDate
  - UUID
- more collections -> `Map`, `Set`, ...

### V`0.3.0`
- random objects : `Person person = randomObject(Person.class);`
- random list of objects : `List<Person> persons = randomListOf(Person.class);`
- random list of objects with number of elements : `List<Person> persons = randomListOf(Person.class, 5);`

### V`1.0.0`
- `Performance` : performance and KPI for each method 
- `Performance` : `java.util.random` vs `java.util.concurrent.ThreadLocalRandom`
- `Documentation` : `MKDocs` site to document functionalities and capacities
- `Documentation` : article on testing with random data (instead of static values)
