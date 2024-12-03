# Description
The Task-Management-Backend is a Spring Boot-based backend API that provides CRUD functionalities for managing tasks. 
The application is designed with a clean architecture and incorporates key backend features, such as RESTful APIs, 
data persistence with MySQL,and Kafka integration for real-time updates. 
This backend can be paired with a frontend application to create a complete task management system.

# Features:->
1) CRUD Operations: Allows for creating, retrieving, updating, and deleting tasks.
2) Real-Time Messaging: Integrates Kafka for efficient message handling between services.
3) Microservices Architecture: Built to support microservices for enhanced modularity and scalability.
4)Data Persistence: Uses MySQL as the database to store and manage task data.

# Technologies Used :->
1) Spring Boot: Provides the backend framework for building REST APIs.
2) MySQL: Manages data storage for tasks.
3) Kafka: Supports asynchronous communication between microservices.
4) Java: Core programming language for the application.


# Prerequisites
To run this project locally, you’ll need: ->
Java 17
Maven for dependency management
MySQL server
Kafka server
Installation


# Set up a MySQL database (e.g., task_management).
Update the application.properties file with your MySQL configurations:
spring.datasource.url=jdbc:mysql://localhost:3306/task_management
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword

# Configure Kafka:
Ensure Kafka is running locally or update the application.properties file to match your Kafka server configuration.

# Here are some of the core API endpoints available in this project:
Create Task: POST /api/tasks
Get Task by ID: GET /api/tasks/{id}
Update Task: PUT /api/tasks/{id}
Delete Task: DELETE /api/tasks/{id}
List All Tasks: GET /api/tasks

# Test API End Points
After starting the server, you can use tools like Postman or cURL to interact with the API endpoints. These allow you to perform various operations such as adding a new task, retrieving task details, updating a task, and deleting a task.
