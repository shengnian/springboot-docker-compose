FROM openjdk:8-jre-alpine

VOLUME /tmp

ADD shengnian-springboot-docker-compose-0.1.0.jar app.jar

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS\
    SOS_SLEEP=0

EXPOSE 8081:8081
CMD echo "The ShengnianOS springboot-docker-compose will start in ${SOS_SLEEP}s" && \
    sleep ${SOS_SLEEP} && \
    java -Djava.security.egd=file:/dev/./urandom -jar /app.jar
