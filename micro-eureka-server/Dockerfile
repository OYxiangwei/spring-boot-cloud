FROM openjdk:8-jre-alpine

LABEL maintainer="992543768@qq.com"

ENV TZ=Asia/Shanghai \
    DIST_NAME=micro-eureka-server-0.0.1-SNAPSHOT

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime \
    && echo $TZ > /etc/timezone

COPY target/"$DIST_NAME.jar" /"$DIST_NAME.jar"

EXPOSE 8761

ENTRYPOINT java $JAVA_OPTS -jar /$DIST_NAME.jar