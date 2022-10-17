FROM openjdk:11
EXPOSE 9090
COPY target/chat-service-0.0.1-SNAPSHOT.jar chat-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/chat-service-0.0.1-SNAPSHOT.jar"]