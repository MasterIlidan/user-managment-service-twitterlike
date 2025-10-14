FROM openjdk:17
COPY target/user-management-service-twitterlike-0.0.1-SNAPSHOT.jar user-management-service-twitterlike-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "user-management-service-twitterlike-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
