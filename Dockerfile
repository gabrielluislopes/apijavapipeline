FROM amazoncorretto:11

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar /app/spring-app.jar

ENTRYPOINT ["java", "-jar", "spring-app.jar"]