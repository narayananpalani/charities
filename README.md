# Charity Donation Microservice
This small backend service is to expose multiple charity options to select particular charities' bank accounts to make a possible donation by adding them as beneficiaries.

## TechStack
Spring Boot 3
Java 17

### Guide:
[Linkedin](https://www.linkedin.com/pulse/trends-backend-development-using-spring-boot-narayanan-palani-r21ze/?trackingId=ck7nMdxDRbu9YSI8AWypgQ%3D%3D)

## Running the application and testing the web services

The minimum version of Java that is required by Spring Framework 6 and Spring Boot 3 is Java 17. Make sure you have JDK 17 or newer installed.

You can build and run the application from your IDE or from the command line using the Spring Boot Maven plugin:

On Windows:

    mvnw.cmd spring-boot:run

On macOS or Linux:

    ./mvnw spring-boot:run


Note:
In case of error such as maven failures like ClassNotFoundException, build wrapper accordingly.
E.g:

    Error: Could not find or load main class org.apache.maven.wrapper.MavenWrapperMain
    Caused by: java.lang.ClassNotFoundException: org.apache.maven.wrapper.MavenWrapperMain

please use the command to rectify:

    mvn -N io.takari:maven:wrapper


Then you can use an HTTP client tool to call the web services. Examples using `curl`:

Get information about the senders of emojis:

    curl http://localhost:8080/charities