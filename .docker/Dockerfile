FROM amazoncorretto:11

WORKDIR /app

COPY /target/pipeline-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]