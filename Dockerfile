FROM openjdk:18-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
EXPOSE 80
ARG JAR_FILE=target/*.jar
COPY ./target/producto-service-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]