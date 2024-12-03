# Use a Maven image to build the application
FROM maven:3.8.5-eclipse-temurin-17 as builder

# Set working directory inside the container
WORKDIR /app

# Copy the project files (including pom.xml)
COPY ./eureka-server/pom.xml ./eureka-server/pom.xml
COPY ./eureka-server/src ./eureka-server/src

# Build the application without running tests
RUN mvn clean package -DskipTests -f ./eureka-server/pom.xml

# Use OpenJDK image to run the application
FROM eclipse-temurin:17-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR files from the builder stage
COPY --from=builder /app/eureka-server/target/*.jar eureka-server.jar

# Expose the port for Eureka server
EXPOSE 8070

# Command to run the application
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]
