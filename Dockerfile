# Added slim adoptopenjdk
FROM adoptopenjdk/openjdk11:alpine-jre

WORKDIR /app

ADD target/UserService.jar UserService.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "UserService.jar"]