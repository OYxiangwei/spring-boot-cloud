FROM java:8
VOLUME /tmp
ADD ./target/configs.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8888
ENTRYPOINT ["java","-jar","/app.jar"]