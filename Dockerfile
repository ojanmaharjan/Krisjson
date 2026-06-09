#Docker downloads java
FROM eclipse-temurin:21-jdk-alpine AS builder

WORKDIR /app
#Crate /app folder and steps into it

COPY .mvn/ .mvn/
COPY mvnw pom.xml ./
#Copy maven files from your laptop into the box

RUN ./mvnw dependency:go-offline
#Download all your springboot dependecis inside the box

COPY src/ src/
#Copy your java code into the box

RUN ./mvnw clean package -DskipTests
#Compline every thing and produce the docker file.

FROM eclipse-temurin:21
#new box again
WORKDIR /app
#create the new folder

COPY --from=builder /app/target/*.jar app.jar
#From the stage 1 grab only the jar file.
#Copy spring application into docker

EXPOSE 8080
#saying app runs port 8080

#run java , run the jar file, you spring boot application name
ENTRYPOINT ["java","-jar","app.jar"]