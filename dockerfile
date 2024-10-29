FROM openjdk:21-oracle
COPY ./target/Book-Service-0.0.1-SNAPSHOT.jar Book-Service.jar
CMD ["java", "-jar", "Book-Service.jar"]