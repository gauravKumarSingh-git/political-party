FROM openjdk:17
EXPOSE 8080
ADD target/PoliticalParty-1-0.0.1-SNAPSHOT.jar PoliticalParty-1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/PoliticalParty-1-0.0.1-SNAPSHOT.jar"]