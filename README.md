ps-guitar-rest
============

A Basic Spring Data JPA app with an H2 DB running on Spring Boot

Prerequisites
-------------
You will need to following tools in order to work with this project and code

* git (http://git-scm.com/)
* JDK 1.8+ (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* Maven 3.x+ (http://maven.apache.org/)
* An IDE of your choice.  (Eclipse, IntelliJ, Spring STS, Netbeans, etc.)

Getting Started
---------------
To run this project locally, perform the following steps.

* Clone project to your machine using git - "git clone https://github.com/dlbunker/ps-guitar-rest.git"
* Import the project into your IDE using the maven pom.xml.  In spring STS suite this is done by importing an existing maven project
* Run the JUnit tests in the src/test/java folder.  If all the tests pass, pat yourself on the back.
* Next try running the app as a Spring Boot app.  You can do this by running the Main.java file in this project as a standard java project or you can run spring boot at your project's root with Maven using the following command.  'mvn spring-boot:run'

Spring Data REST - 1.2.1.RELEASE
-------------
Spring Boot
Spring MVC
Spring Data JPA

Main class
-------------
@Configuration
@EnableAutoConfiguration
@ComponentScan

Repository
-------------
@Repository
@PersistenceContext
private EntityManager entityManager;
@RepositoryRestResource(path="companies") -> http://localhost:8080/api/companies

Test
-------------
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Main.class)
@WebAppConfiguration

Default H2 database
-------------
Driver Class	org.h2.Driver
JDBC URL	jdbc:h2:mem:testdb
User Name	sa
Password	 <blank>
https://springframework.guru/using-the-h2-database-console-in-spring-boot-with-spring-security/

Customimzig REST payloads
-------------
Spring Data REST projections
@Projection(name="modelDetail", types={Model.class})
public interface ModelDetail {
}