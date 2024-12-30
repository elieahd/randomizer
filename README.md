# Randomizer

## Roadmap

### v`0.1.0` + `0.2.0`

- [x] Numbers
    - [x] BigDecimal
    - [x] BigInteger
    - [x] Double / double
    - [x] Float / float
    - [x] Integer / int
    - [x] Long / long
    - [x] Short / short
- [x] String
- [x] Character / char
- [x] Byte / byte
- [x] Enum
- [x] UUID
- [x] Dates
    - [x] java.util.Date
    - [x] java.sql.Date
    - [x] java.time.LocalDate
    - [x] java.time.LocalTime
    - [x] java.time.LocalDateTime
    - [x] java.time.ZonedDateTime
    - [x] java.time.OffsetDateTime
    - [x] java.time.OffsetTime
    - [x] java.time.Instant
- [x] Collection
    - [x] `Map`
    - [x] `Set`
    - [x] `Array`
    - [x] `Stream`
    - [x] `List`
- [x] `Devops` : automatic checks on PR
    - [x] tests
    - [x] sonar analysis
    - [x] sonar quality gate
- [x] `Devops` : automatic deployments on push on `main`
    - [x] pre-checks (tests, sonar analysis, sonar analysis gate)
    - [x] package
    - [ ] deploy artifact on a maven artifactory
    - [x] tag in github
    - [x] create release

### v`0.3.0`

- [ ] random objects : `random(Person.class);`
- [ ] random record : `random(Person.class);`
- [ ] random collection : `randomListOf(Person.class);`, ...

### Future enhancements

- [ ] `Performance` : performance and KPI for each method
- [ ] `Performance` : `java.util.random` vs `java.util.concurrent.ThreadLocalRandom`
- [ ] `Cache` : collection randomizers
- [ ] `Documentation` : `MKDocs` site to document functionalities and capacities
