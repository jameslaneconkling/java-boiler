FROM openjdk:8-jre-alpine

WORKDIR /var/app

COPY target/java-boiler-0.1-SNAPSHOT-shaded.jar /var/app/java-boiler-shaded.jar

ENTRYPOINT [ "java", "-jar", "java-boiler-shaded.jar" ]
