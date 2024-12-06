# Use the OpenJDK base image
FROM openjdk:11-jdk

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/todo-api-1.0-SNAPSHOT.jar todo-api.jar

# Expose port 8080
EXPOSE 8080

# Run the Spring Boot application
CMD ["java", "-jar", "todo-api.jar"]

