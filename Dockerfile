FROM java:8
EXPOSE 9080
ADD /target/demospringproject.jar demospringproject.jar
ENTRYPOINT ["java","-jar","demospringproject.jar"]