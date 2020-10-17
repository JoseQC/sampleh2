FROM openjdk:8-jdk-alpine
COPY "./target/SampleDockerH2Two-SampleDockerH2Two.jar" "app.jar"
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
