# RushStreetInteractive-selenide-cucumber5-allure2 project

Java 8 and Maven 3.6+ must be installed on your computer before running tests.

To run tests, you need to download the project, 
go to the project folder, and call command in the terminal:

mvn clean -Dtest=Runner test allure:serve

The first run of the tests will take a little longer, 
since Maven will download all the dependencies that the project needs.

The project uses the Selenide framework. Selenide uses WebDriverManager
which itself downloads the latest version of the browser that you specified in the configuration. 
By default, this is the latest version of the Chrome browser.

The Internet must be available on the computer without restrictions. 

After running the tests, the local Allure server will be automatically launched,
with a report on running the tests.

@Author: Viktor Zinchenko