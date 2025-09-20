# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set environment variable for the JAR file
ENV JAR_FILE=target/auth-0.0.1-SNAPSHOT.jar

# Set working directory inside container
WORKDIR /app

# Copy the JAR file from the host to the container
COPY ${JAR_FILE} app.jar

# Expose the port your Spring Boot app listens on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
