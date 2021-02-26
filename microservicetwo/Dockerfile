FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} microservicetwo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/microservicetwo-0.0.1-SNAPSHOT.jar"]