FROM eclipse-temurin:17
COPY target/lastaug.jar lastaug.jar
CMD ["java","-jar","lastaug.jar"]