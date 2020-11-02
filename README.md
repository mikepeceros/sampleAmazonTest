# sampleAmazonTest
This is only a sample project for passing an Avantica's interview.

## Background

This project was performed under Cucumber, java, maven and testNG technologies.
We are able to modifiy the scenarios in order to retrieve different results in acoording to what the user wants to catch in the search.

## Usage

Dependencies: JAVA_HOME & M2_HOME already set as environmental variables.
Place on the root path of the project and run the next command:

```termninal
mvn verify -Dsurefire.suiteXmlFiles=C:\Users\Mike\Documents\GitHubProjects\sampleAmazonTest\src\test\resources\testng\AmazonTestSuite.xml "-Dcucumber.options=--tags '@S
earchProduct'"
```
If the test case passes, you are going to be able to see the products in the folder /target/screenshots

⚠️ Amazon does not always display products with the badge "Best Seller" in the first page. Also, in the web page you could find that the list of products are updated hourly.
