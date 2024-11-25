## Web_Automation_Google_Calculator
This framework is an end to end automated test suite that tests the functionality of calculator component on Google. This framework is based on Selenium Webdriver, Java and TestNG. It can be customized to run the tests using different browsers.

## Prerequisites
1. JDK version 11 or later must be installed
2. Maven latest version must be installed
3. Configure JAVA_HOME and MAVEN_HOME

## Usage
Clone this repository to your local computer.

## Execute Test
Once you have the code on your computer, use your computer terminal to run the following maven command in the root folder of your maven project.

1. To run the regression suite:
```
mvn test -PRegressionTest
```

2. To run the smoke suite:
```
mvn test -PSmokeTest
```

3. To run the test on a specific browser:
```
mvn test -PRegressionTest -Dbrowser=firefox
```

## Extent Reports
Reports are saved under ``` {PROJECT_ROOT_FOLDER}/reports/index.html ```


![image](https://github.com/user-attachments/assets/cdc89c29-6cc6-4315-a4ee-19b7add3b3fe)

![image](https://github.com/user-attachments/assets/d970198c-aed3-437f-acc8-3ddb99686d0e)
