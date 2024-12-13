# Randomizer

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

Other

- `Devops` : automatic checks on PR 
  - tests
  - sonar analysis
  - sonar quality gate

- `Devops` : automatic deployments on push on `main` 
  - pre-checks (tests, sonar analysis, sonar analysis gate)
  - package
  - deploy artifact on a maven artifactory

### V`0.2.0`

Functionalities

- add more exceptions on inputs (min, max, length, ...)
- random objects : `Person person = randomObject(Person.class);`
- random list of objects : `List<Person> persons = randomListOf(Person.class);`
- random list of objects with number of elements : `List<Person> persons = randomListOf(Person.class, 5);`

Other

- `Devops` : automate tag in GitHub

### V`0.3.0`

Functionalities

- more primitive randomizers -> `BigDecimal`, `Float`, ...
- more collections -> `Map`, `Set`, ...
 
Other

- `Documentation` : `MKDocs` site to document functionalities and capacities
- `Devops` : automate release in GitHub

### V`0.4.0`

- performance and KPI for each method 
- article on testing with random data
