# JavaTemperatureConverter

A small command-line Java application that converts temperatures between
Celsius and Fahrenheit. Select a direction, enter a value, and the program
prints the converted temperature. The JVM vendor is reported on startup
through the bundled `jlibutils` helper library.

[![Java CI](https://github.com/Project516/JavaTemperatureConverter/actions/workflows/gradle.yml/badge.svg)](https://github.com/Project516/JavaTemperatureConverter/actions/workflows/gradle.yml)
[![Build and upload release assets](https://github.com/Project516/JavaTemperatureConverter/actions/workflows/release.yml/badge.svg)](https://github.com/Project516/JavaTemperatureConverter/actions/workflows/release.yml)

## How it works

When you launch the app it:

1. Prints the running JVM vendor (for example `Temurin`).
2. Prompts for a single character choosing the conversion direction:
   - `f` converts a Celsius value to Fahrenheit.
   - `c` converts a Fahrenheit value to Celsius.
3. Reads the numeric value and prints the result.

Any unrecognized input prints `Invalid input!` instead of converting.

## Requirements

- **Java 8** or newer. The build targets Java 8 bytecode, so any JDK from
  8 onward can run the shadowed jar. A recent build of
  [Eclipse Temurin](https://adoptium.net/temurin) or a JDK from
  [SDKMAN](https://sdkman.io) works well.
- Make sure the `java` executable is on your system `PATH`.

## Quick start (release build)

1. Download the latest `app-all.jar` from the
   [Releases page](https://github.com/Project516/JavaTemperatureConverter/releases).
2. Run the jar:

   ```sh
   java -jar app-all.jar
   ```

## Build from source

1. Clone the repository:

   ```sh
   git clone https://github.com/Project516/JavaTemperatureConverter.git
   cd JavaTemperatureConverter
   ```

2. Build with the bundled Gradle wrapper (no local Gradle install needed):

   ```sh
   ./gradlew build
   ```

3. Run the shadowed jar produced under `app/build/libs/`:

   ```sh
   java -jar app/build/libs/app-all.jar
   ```

A convenience `test.sh` script is also provided that builds and immediately
runs the jar:

```sh
./test.sh
```

The build also runs `spotlessApply`, so formatting is normalized as part of
every compile and any formatting drift is corrected automatically.

## Project structure

```
settings.gradle            # Gradle settings (root project: JavaTemperatureConverter)
gradle/libs.versions.toml  # Version catalog for dependencies
libs/
  jlibutils-0.0.1.jar      # Bundled helper (provides SystemInfo.vendor())
app/
  build.gradle             # Application, Shadow, Spotless plugin configuration
  src/main/java/dev/project516/JavaTemperatureConverter/
    Main.java               # Entry point; prints vendor and starts the loop
    Runtime.java            # Read-evaluate loop for direction and value
    ConvertTemp.java        # Celsius <-> Fahrenheit conversion math
    Text.java               # Instruction prompt text
```

## Continuous integration

- `.github/workflows/gradle.yml`: builds the project and submits the
  dependency graph on every push and pull request to `master`.
- `.github/workflows/release.yml`: builds the `app-all.jar` and uploads
  it as an asset whenever a GitHub release is created.
- `.github/workflows/javadoc.yml`: generates Javadoc and deploys it to
  GitHub Pages.
- `.github/dependabot.yml`: scheduled checks for dependency updates.

## Documentation

The online Javadoc published from CI is available at
<https://project516.dev/JavaTemperatureConverter>.

## License

This project is licensed under the
[GNU General Public License v3.0](LICENSE).
