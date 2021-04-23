# CucumberPOM_PesquisaQA

O objetivo deste "test suite" é preencher um formulário com sucesso, utilizando-se as BDD - Behavior Driven Develoopment.
Para aprimorar a criação deste teste, procurei utilizar o POM - Page object model design pattern e também procurei seguir
algumas best practices indicados neste link:

16 Selenium Best Practices For Efficient Test Automation
https://www.lambdatest.com/blog/selenium-best-practices-for-web-testing/

# Environment
This project was executed in Windows 10 environemt.

# Main Tools 
- Eclipse IDE for Enterprise Java and Web Developers
- Maven plugin
- Cucumber 
- Junit
- Selenium 
- Chrome Webdriver
- Maven Cucumber reporting

# Execution of Test
The test suite can be executed using three different ways:
- **Run as Cucumber feature**

Using /CucumberTestPOM/src/test/resources/Features/**pesquisaQA.feature**
Running this way only generate a report "pretty" in the console.

- **Run as Junit**

Using /CucumberTestsPOM/src/test/java/StepDefinitions/**TestRunner.java**
Generate reports in the format json, xml and html.

- **Run as Maven** (remember to set in the Run Configuration-> goals = clean install

Using /**CucumberTestPOM** project. 
Generate a more user friendly report with more graphic informations.

# Reports Location
**Basic reports** are located at **/CucumberTests/target/cucumber-reports**:
- Cucumber.json
- Cucumber.xml
- HtmlReports.html

**Advanced reports** is located at **/CucumberTests/target/cucumber-reports/advanced-reports/cucumber-html-reports**:
- overview-feature.html
