FROM openjdk:17-jdk-slim
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
COPY target/api-azure-1.0.3-SNAPSHOT.jar app.jar