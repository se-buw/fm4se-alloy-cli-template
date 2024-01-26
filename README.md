# Alloy CLI Template

This project is a template for using Alloy CLI. It contains a simple example using Alloy API and add it on CLI.

You can extend this project to your own alloy cli project by following the steps below:


### Project Setup

1. Install OpenJDK/JDK
2. Clone this project or Create a new project with this project as template (click `Use this template` button on the top of this page)
3. Open the project with your favorite IDE (IntelliJ IDEA, Eclipse, etc.)
4. Run `./gradlew build` to build the project
- This will create a jar file in [`build/libs`](build/libs) directory
5. Run `java -jar ./build/libs/<jar-file-name>.jar -e`
    
This will run an example using the Alloy API. The example is in the [`ExampleUsingTheAPI.java`](src/main/java/de/buw/fm4se/alloy/examples/ExampleUsingTheAPI.java) file.

The CLI options are defined in the [`AlloyCli.java`](src/main/java/de/buw/fm4se/alloy/cli/AlloyCli.java) file. You can implement your own package and classes to extend the CLI functionality.

Please check [build.gradle](build.gradle) for additional dependencies. 