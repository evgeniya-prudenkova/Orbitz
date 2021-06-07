# Orbitz

INTRODUCTION OF PROJECT
 
 1. PROJECT: It is a web-based Maven automation functional project for the application Orbitz.
 2. FRAMEWORK(BDD): Cucumber-JUnit, using Selenium WebDriver and Java, including page object model pattern.
 
PROJECT FEATURES WHICH SUPPORTS
 1. Easily configurable to execute scripts on different browsers.
 2. Centrilized ogject Repositories to keep all web elements.
 3. Reusable Gherkin steps and scripts with different provided data.
 4. Screenshot capturing during succesful and unsuccesful execution.
 5. Execution scripts using Maven command line.
 6. Maven Cucumber detailed report.

SOFTWARE REQUIRED TO RUN PROJECT

 1. Maven(4.0.0)
 2. Java (Versuion 1.8x)
 3. IntelliJ Idea (Community Edition)
 4. IntelliJ Idea plugins (Cucumber for Java, Gherkin)
 5. Cucumber Framework (5.7.0)
 
STEPS TO CONFIGURE PROJECT BEFORE RUN ON LOCALE MACHINE(IntelliJ)
 1. Add new Maven run confuguration for IntelliJ IDEA
 - Command line: clean test
 - Apply and Save the changes
 
STEPS TO RUN PROJECT USING MAVEN COMMAND LINE
 1. Open terminal/command prompt.
 2. Navigate till project home directory path (pom.xml)
 3. Provide comand as "mvn clean test"
 
TO GET THE DETAILED REPORT
 Available: ProjectHomeDirectory\target\cucumber-html-reports\overview-feature.html

