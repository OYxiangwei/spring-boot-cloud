FROM java:8
VOLUME /tmp
ADD ./target/gateway_about.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8060
ENTRYPOINT ["java","-jar","/app.jar"]