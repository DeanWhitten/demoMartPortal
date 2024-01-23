FROM amazoncorretto:17
WORKDIR /demoMartPortal
COPY build/libs/*.jar demoMartPortal-0.0.1-SNAPSHOT.jar


CMD ["./gradlew", "clean", "bootJar"]


EXPOSE 8080
CMD ["java", "-jar", "demoMartPortal-0.0.1-SNAPSHOT.jar"]

