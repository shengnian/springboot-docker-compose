# Spring boot with docker compose.

## Build project

`$git clone https://github.com/shengnian/springboot-docker-compose.git`

`cd springboot-docker-compose`

`$gradlew clean bootRepackage buildDocker`

`docker-compose -f src/main/docker/app.yml up -d`

Go to http://localhost:8081 to see your 
```
Hello [ShengnianOS]!
Hello [S]!
```
messages from database.

