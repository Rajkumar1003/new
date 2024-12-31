FROM eclipse-temurin:17
COPY target/get.jar get.jar
CMD [ "java","-jar","get.jar" ]