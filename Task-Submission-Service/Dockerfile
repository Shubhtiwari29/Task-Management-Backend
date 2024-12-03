# Use a Maven image to build the application
FROM maven:3.8.5-eclipse-temurin-17 as builder

# Set working directory inside the container
WORKDIR /app

# Copy the project files (including pom.xml)
COPY ./task-submission-service/pom.xml ./task-submission-service/pom.xml
COPY ./task-submission-service/src ./task-submission-service/src

# Build the application without running tests
RUN mvn clean package -DskipTests -f ./task-submission-service/pom.xml

# Use OpenJDK image to run the application
FROM eclipse-temurin:17-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR files from the builder stage
COPY --from=builder /app/task-submission-service/target/*.jar task-submission-service.jar

# Expose the port for the task submission service
EXPOSE 5003

# Command to run the application
ENTRYPOINT ["java", "-jar", "task-submission-service.jar"]
