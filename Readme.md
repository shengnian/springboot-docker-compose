# Spring boot with docker compose.

## Build project

`$git clone https://github.com/shengnian/spring-boot-docker-sample.git`

`$gradlew build && java -jar build/libs/shengnian-spring-boot-docker-0.1.0.jar`

Go to http://localhost:8080 to see your "Hello Docker world!" message.

## Build docker

`$gradlew build buildDocker`

`$docker images` to see the docker container: `shengnianos/shengnian-spring-boot-docker`

`$docker rmi ${docker IMAGE ID}` to see the docker container: `shengnianos/shengnian-spring-boot-docker`

`$docker run -p 8080:8080 -t shengnianos/shengnian-spring-boot-docker` to run docker container 
and you the log will output console.

`docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8080:8080 -t shengnianos/shengnian-spring-boot-docker` active the spring profiles

`docker run -e "JAVA_OPTS=-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n" -p 8080:8080 -p 5005:5005 -t shengnianos/shengnian-spring-boot-docker` 

`$docker ps` to see the runtime docker container.

`$docker stop ${docker CONTAINER ID}` stop it.

`$docker rm ${docker CONTAINER ID}` delete the container




