FROM public.ecr.aws/socar/adoptopenjdk/openjdk11:alpine-jre-11.0.10_9 as digimon

ARG JAR_FILE=target/digimon-0.0.1-SNAPSHOT.jar

WORKDIR /opt/app

COPY ${JAR_FILE} app.jar

ENTRYPOINT [ "java", "-jar", "app.jar"]

EXPOSE 80