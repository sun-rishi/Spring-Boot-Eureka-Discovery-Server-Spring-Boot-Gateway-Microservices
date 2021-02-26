FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} microservicethree-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/microservicethree-0.0.1-SNAPSHOT.jar"]