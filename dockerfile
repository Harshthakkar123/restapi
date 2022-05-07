FROM maven:3.5.4-jdk-8-alpine as maven
COPY ./pom.xml ./pom.xml
COPY ./src ./src
RUN mvn dependency:go-offline && mvn package

FROM openjdk:8u171-jre-alpine
WORKDIR /spring
COPY --from=maven target/springrest-*.jar ./springrest.jar
CMD ["java", "-jar", "./springrest.jar"]
