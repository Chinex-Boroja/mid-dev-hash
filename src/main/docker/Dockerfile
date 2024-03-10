FROM amazoncorretto:17.0.3-alpine
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java","-jar","application.jar"]

# FROM amazoncorretto:17.0.3-alpine
# WORKDIR /home/root/chinexboroja
# ARG JAR_FILE=*.jar
# EXPOSE 8080 8081
#
# COPY target/MidDevHash-1.0-SNAPSHOT.jar app.jar
# COPY config.yml config.yml
#
# ENTRYPOINT ["sh", "-c", "java -jar app.jar db migrate config.yml && java -jar app.jar server config.yml"]