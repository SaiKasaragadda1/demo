FROM openjdk:8
EXPOSE 8081
ADD target/demo-deploy.jar demo-deploy.jar
ENTRYPOINT [ "java","-jar","/demo-deploy.jar" ]