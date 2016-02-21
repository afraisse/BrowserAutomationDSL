# BrowserAutomationDSL

## Case Study - Adrian Fraisse, Théophile Morin, Killian Saint Cricq

We implemented our Selenium DSL using an interpreter which is to be found in the Selenium.interpreter project.
Exemples can be found under the samples folder. Our DSL file extension is .SEL.

## How to run the interpreter

- Import the projects into eclipse
- In the Selenium project, run the MWE workflow (pkg : org.xtext.emn.selenium.GenerateSEL)
- Run the Selenium.interpreter as an Eclipse application
- In the new Eclipse instance, create a new general project
- Add a file to the project with the .SEL extension
- Run the interpreter using the plugin button "Execute the currently selected SEL script"

Feedback will be print in the parent eclipse instance's console.
