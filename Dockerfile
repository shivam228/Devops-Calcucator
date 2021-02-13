
FROM openjdk:8
EXPOSE 8081
# Add the application's jar to the container
ADD target/Lab3Junit-1.0-SNAPSHOT.jar Lab3Junit-1.0-SNAPSHOT.jar
# Run the jar file
ENTRYPOINT ["java","-cp","Lab3Junit-1.0-SNAPSHOT.jar","Calcuator"]
