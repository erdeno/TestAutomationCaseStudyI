![Logo of the project](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwiki.deimos.fr%2Fimages%2F0%2F00%2FSelenium-logo.png&f=1&nofb=1) ![Logo of the project](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.programmableweb.com%2Fsites%2Fdefault%2Ffiles%2Fstyles%2Ffacebook_scale_width_200%2Fpublic%2Fresource%2FCucumber%2520Framework.png%3Fitok%3DfYz2HDEh&f=1&nofb=1)


# Test Automation Case Study I

This is the Case Study I for Kloia QA Bootcamp.


## Project Structure

    .
    ├── pom.xml
    ├── readme.md
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   └── resources
    │   └── test
    │       ├── java
    │       │   └── casestudy
    │       │       ├── config
    │       │       │   ├── config.properties
    │       │       │   └── PropertiesFile.java
    │       │       ├── pages
    │       │       │   ├── CategoryPage.java
    │       │       │   ├── GooglePage.java
    │       │       │   ├── HomePage.java
    │       │       │   ├── LoginPage.java
    │       │       │   ├── MyAccountPage.java
    │       │       │   ├── ProductDetailPage.java
    │       │       │   └── SearchPage.java
    │       │       ├── runners
    │       │       │   └── TestRunner.java
    │       │       ├── step_def
    │       │       │   ├── Hooks.java
    │       │       │   └── MyStepdefs.java
    │       │       └── utils
    │       │           ├── Driver.java
    │       │           └── Helper.java
    │       └── resources
    │           └── features
    │               └── CaseStudy.feature
    └── ...





## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 


After clonning repository you should edit the config.properties file under test/java/casestudy/config with your credentials.

```
googleEmail=<your gmail>
googlePassword=<your gmail password>
bestBuyEmail=<your best buy mail>
bestBuyPassword=<your best buy password>
```
You can run the tests from terminal with this command:

```
mvn test
```


You can see the html report from:
```
target/cucumber-reports/index.html 

```

