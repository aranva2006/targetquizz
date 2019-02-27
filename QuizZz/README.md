# Welcome to the QuizZz project!

This application is being developed as a Spring Boot learning project. It includes technologies rest web services, Spring security and Spring MVC. 

The idea of the application is simple.Users who has registered and logged in to the app can then play quizzes available. 
It also includes a user management module with functionality such as sign up and login. 
It then uses Spring Security and Spring AOP for authentication and authorization purposes. 
Users are required to open an account in order to play quiz.

The application includes a simple but functional web frontend using AngularJS and Bootstrap.

## Getting Started

All the code required to run this project is available in this Git repository. You can either download it as a zip file from Github or run:

### Environment

In order to run QuizZz you will need:

* [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html) - Main Backend Language
* [Maven](https://maven.apache.org/) - Dependency Management
* [H2]-  The default RDBMS.

In addition, there are a few optional yet recommended installations:

* [Git](https://git-scm.com)
* Your favorte IDE. I am using [Spring STS](https://spring.io/tools/sts/all), which is based on Eclipse, but feel free to use whichever you find more convenient.
* An SMTP client such as [FakeSMTP](http://nilhcem.com/FakeSMTP/). In order to test and verify user registrations, it is easier to use a stubbed SMTP server than a real email provider.

#### Database Setup

QuizZz app comes with H2 db support. In order to connect to h2 database, you need to update application-h2.properties file with authentication details.
mail