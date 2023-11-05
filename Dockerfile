FROM openjdk
EXPOSE 8080
ADD target /jobsApplicationManagement.jar
ENTRYPOINT ["java","-jar","/jobsApplicationManagement"]