FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the generated JAR file
COPY target/Scientific_Calculator_final-1.0-SNAPSHOT.jar /app/scientific_calculator.jar

#CMD ["java", "-jar", "/app/scientific_calculator.jar"]
