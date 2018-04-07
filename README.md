# rest-service-cors

### consuming-rest
```text
cd consuming-rest/
mvn package && java -jar target/consuming-rest-0.1.0.jar
```

### rest-service-cors
```text
mvn spring-boot:run -pl rest-service-cors -Dserver.port=9000

or

cd rest-service-cors
mvn package && java -jar target/rest-service-cors-0.1.0.jar
mvn spring-boot:run -Dserver.port=9000
```
