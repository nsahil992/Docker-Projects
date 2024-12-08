# Use OpenJDK as the base image
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the compiled JAR file
COPY target/simple-java-api-1.0-SNAPSHOT.jar app.jar

# Expose the port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]

