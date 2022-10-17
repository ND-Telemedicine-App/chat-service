**RMIT SEPT 2022 Major Project Team 4**

**Members:** 
- Doan Yen Nhi (s3880599)   
- Nguyen Hoang Linh (s3880313)
- Jack Dean (s3722961)
- Matthew Rigo (s3840775)
- Mingkai Wang (s3773115)

**Records**
- Github repository : https://github.com/ND-Telemedicine-App
- jira Board : https://septteam4.atlassian.net/jira/software/projects/SEPTT4S/boards/3/roadmap?shared=&atlOrigin=eyJpIjoiMzI5YzNmOWIzODBhNDY1NThhYjAyODczM2NmM2EzNTYiLCJwIjoiaiJ9

**Code documentation - Release 0.1.0 Major changes & Features - Date: 6/9/22**
- Chat Class
  > Attributes
  > Getters and setters
  > To String method
- Chat Controller:
  > Chat Get API (Chats by Sender Id and Receiver Id, Receiver based on Sender Id, All Chats, Latest Chat)
  > Chat Create API (Create new chat)
- Chat Service:
  > findChatsBySenderIdAndReceiverId method
  > findLatestChat method
  > findAllChats method
  > findReceiverBasedOnSender method
  > createNewChat method
- Chat Repository:
  > findChatsBySenderIdAndReceiverId
  > findChatsBySenderId
- ChatServiceApplicationTests:
  > Created various tests for the APIs

**Code documentation - Release 0.1.1 Major changes & Features - Date: 19/9/22**
- All classes:
  > Debug and code cleanup
  > Modify and implemented more comments on code
  > CI Build and test
- PrescriptionServiceApplicationTests:
  > Added comments for tests

To run this service locally on MySQL:

1. Setup localhost in MySql Workbench
2. Create new schema nd-telemedicine-app
3. Go to target/classes/application.properties and Edit "spring.datasource.password" field with your own MySql Password
4. Run "PrescriptionServiceApplication" located: src/main/java/com/team4/prescription_service
5. If done correctly you can refresh schemas and there should be a new table under nd-telemedicine-app

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql.jpa-and-spring-data)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

