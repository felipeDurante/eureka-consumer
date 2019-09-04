FROM openjdk:8-jdk-slim
VOLUME /tmp
ADD eureka-consumer/target/eureka-consumer-0.0.1-SNAPSHOT.jar eureka-consumer.jar
EXPOSE 9091
RUN bash -c 'touch /eureka-consumer.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/eureka-consumer.jar"]