# Randomizer

## Roadmap

### v`0.1.0`
- [x] Alphanumeric
- [x] Alphabetic
- [x] Alphanumeric with special characters
- [x] Double
- [x] Integer
- [x] Enum
- [x] List
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

### v`0.2.0`
- [ ] long / Long
- [ ] float / Float
- [ ] char / Character
- [ ] short / Short
- [ ] byte / Byte
- [ ] BigDecimal
- [ ] BigInteger
- [ ] LocalDate
- [ ] UUID
- [ ] Collection `Map`
- [ ] Collection `Set`
- [ ] Collection `Array`
- [ ] `Devops` bump version 

### v`0.3.0`
- [ ] random objects : `random(Person.class);` (record, instance)
- [ ] random list of objects : `randomListOf(Person.class);`

### v`0.4.0`
- [ ] `Performance` : performance and KPI for each method 
- [ ] `Performance` : `java.util.random` vs `java.util.concurrent.ThreadLocalRandom`
- [ ] `Documentation` : `MKDocs` site to document functionalities and capacities
- [ ] `Documentation` : article on testing with random data (instead of static values)
