FROM openjdk:8
ADD target/demo-0.0.1-SNAPSHOT-jar-with-dependencies.jar demo-0.0.1-SNAPSHOT-jar-with-dependencies.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT-jar-with-dependencies.jar"]