FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/todo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080

# Set environment variables (for local testing only, remove in production)
ENV DATABASE_URI=${DATABASE_URI}
ENV DATA_USERNAME=${DATABASE_USER}
ENV DATA_PASSWORD=${DATABASE_PASS}

ENTRYPOINT ["java","-jar","demo.jar"]