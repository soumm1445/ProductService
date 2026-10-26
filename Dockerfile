FROM eclipse-temurin:17-jdk-alpine

EXPOSE 9090

COPY ./target/CRUD.jar CRUD.jar

ENTRYPOINT ["java", "-jar", "/CRUD.jar"]