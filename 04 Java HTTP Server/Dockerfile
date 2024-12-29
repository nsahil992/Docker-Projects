# Use OpenJDK with JDK instead of JRE
FROM openjdk:11-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source code to the container
COPY src/Main.java .

# Compile the Java file
RUN javac Main.java

# Expose port 8080
EXPOSE 8080

# Command to run the application
CMD ["java", "Main"]

