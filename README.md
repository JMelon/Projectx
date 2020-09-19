# ProjectX - Test Automation Framework

General purpose test automation framework for wide range of applications. 
It's completely open for customisations to fit the context and to make it flexible with minimum limitations.

## Getting started
1. Clone the project
2. Import project to Intellij or other IDE
    1. Make sure all dependencies are installed
3. Write test(s) under `src/test/java/tests/`
4. Run the tests using Intellij or command line
    1. Running with Intellij - select test method or test class and press `Ctrl+Shift+F10`
    2. Running with command line - navigate to project root and execute `gradlew :test`

## Capabilities
List of implemented capabilities linking to wiki where detailed usage is described.
- TBD (currently no capabilities)

## Structure
    |-- README.md
    |-- settings.gradle
    |-- gradlew.bat
    |-- gradlew
    |-- build.gradle
    |-- .gitignore
    |-- src
        |-- test
            |-- resources <- Configuration location
            |-- java
                |-- tests <- Container for test, structuring inside is important
                |-- pojo <- Object repository for general use, each feature has it's own object repo
                |-- util <- The core the framework 
                    |-- configuration <- Configuration management capability
                    |-- ui <- Selenium capability
                    |-- webapi <- Rest assured / Web request capability
## Dependencies
Recommended versions to use, other versions can also work with little adjustments

| Component             | Version        | Purpose                           | Source       
| :-------------------- | :------------- |:--------------------------------- | :------------------------------------------------------------------------- 
| Java                  | 15             | Selected implementation language  | https://openjdk.java.net
| Gradle                | 6.6.1          | Build and dependency management   | https://gradle.org
| junit-jupiter         | 5.7.0          | Framework for writing tests       | https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter
| selenium-jupiter      | 3.3.5          | Testing UI applications           | https://mvnrepository.com/artifact/io.github.bonigarcia/selenium-jupiter
| rest-assured          | 4.3.1          | Testing web services (Web API)    | https://mvnrepository.com/artifact/io.rest-assured/rest-assured
| assertj-core          | 3.17.2         | Advanced assertions               | https://mvnrepository.com/artifact/org.assertj/assertj-core
| hamcrest              | 2.2            | Assertion matchers                | https://mvnrepository.com/artifact/org.hamcrest/hamcrest
| log4j-core            | 2.13.3         | Logging                           | https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core
| jackson-core          | 2.11.2         | Configuration management          | https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core

## Notes
- When using parallelization, make sure threads can access the same resources without exposing/creating erroneous behavior or producing unpredictable results.

## Contributing
Pull requests are welcome. For any change, please open an issue first to discuss what you would like to change/implement.

## License
[MIT](https://github.com/JMelon/Projectx/blob/master/LICENSE)