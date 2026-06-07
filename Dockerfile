#Docker downloads java
FROM eclipse-temurin:21

#Copy spring application into docker
COPY target/*.jar app.jar

#Run the application
#run java , run the jar file, you spring boot application name
ENTRYPOINT ["java","-jar","app.jar"]