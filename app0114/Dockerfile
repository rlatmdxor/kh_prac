FROM openjdk:17-ea-slim

WORKDIR /kh

COPY ./build/libs/app0114-0.0.1-SNAPSHOT.jar /kh/app0114.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/kh/app0114.jar"]