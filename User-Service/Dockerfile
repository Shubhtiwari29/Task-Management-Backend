# Use a Maven image to build the application
FROM maven:3.8.5-eclipse-temurin-17 as builder

# Set working directory inside the container
WORKDIR /app

# Copy the project files
COPY . .

# Build the application without running tests
RUN mvn clean package -DskipTests

# Use OpenJDK image to run the application
FROM eclipse-temurin:17-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR files from the builder stage
COPY --from=builder /app/service/target/*.jar service.jar

# Expose the ports for each service
EXPOSE 5000 5001 5002 5003 8070

# Command to run the application
ENTRYPOINT ["java", "-jar", "service.jar"]
