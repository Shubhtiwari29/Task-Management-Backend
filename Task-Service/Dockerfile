# Use a Maven image to build the application
FROM maven:3.8.5-eclipse-temurin-17 as builder

# Set working directory inside the container
WORKDIR /app

# Copy the project files (including pom.xml)
COPY ./task-service/pom.xml ./task-service/pom.xml
COPY ./task-service/src ./task-service/src

# Build the application without running tests
RUN mvn clean package -DskipTests -f ./task-service/pom.xml

# Use OpenJDK image to run the application
FROM eclipse-temurin:17-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR files from the builder stage
COPY --from=builder /app/task-service/target/*.jar task-service.jar

# Expose the port for the task service
EXPOSE 5002

# Command to run the application
ENTRYPOINT ["java", "-jar", "task-service.jar"]
