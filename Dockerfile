FROM openjdk:8
ADD target/HelloDocker-0.0.1-SNAPSHOT.jar myapp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/myapp.jar"]