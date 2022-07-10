FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/appointment-service-0.0.1-SNAPSHOT.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n -jar /app.jar