# Java Maven Project

This project is built using **Apache Maven**, a build automation and dependency management tool for Java projects. Maven simplifies the process of managing project dependencies, compiling code, running tests, and packaging the application.

---

## What is Maven?

**Maven** is a powerful tool used to:
- Manage **dependencies** (external libraries and frameworks).
- Automate the **build** process (compiling, testing, packaging).
- Provide an **easy-to-follow project structure**.
- Ensure consistency across all developers and build environments.

It uses an XML configuration file called `pom.xml` (Project Object Model) to define the project setup, dependencies, and plugins.

---

## Maven Commands

Below are some common Maven commands that you can use to compile, test, package, and deploy your Java application:

```bash
# 1. mvn compile
# Compiles the source code of the project.
mvn compile

# 2. mvn test
# Runs the unit tests of the project.
mvn test

# 3. mvn package
# Packages the compiled code into a JAR or WAR file.
mvn package

# 4. mvn clean
# Cleans up the target directory by deleting all previously compiled files.
mvn clean

# 5. mvn install
# Installs the packaged JAR or WAR file into the local Maven repository.
mvn install

# 6. mvn deploy
# Deploys the artifact to a remote Maven repository.
mvn deploy

# 7. mvn validate
# Validates the project’s configuration and checks if all required files are present.
mvn validate

# 8. mvn site
# Generates a site for the project.
mvn site

# 9. mvn dependency:tree
# Displays the dependency tree of the project.
mvn dependency:tree

# 10. mvn exec:java
# Runs the main class of the project.
mvn exec:java -Dexec.mainClass="com.example.Main"

# 11. mvn clean install
# Cleans the project and then installs the artifact into the local repository.
mvn clean install

# 12. mvn help:effective-pom
# Displays the effective POM for the project.
mvn help:effective-pom
