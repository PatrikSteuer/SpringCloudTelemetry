# SpringCloudTelemetry

A repository showing Spring Cloud capabilities for Cloud Telemetry.
This includes

* Tracing - using Spring Cloud Sleuth and Zipkin.io, but other backends (like Jaeger) are possible, too.
* Metrics - using Micrometer.io and Influx.DB ass metrics backend.
* Distributed Logs - using a distributed logs backend.

# Building the Project

At the root of the project, from a terminal execute:

1. `mvn clean package`

# Running the Project

To run the project, you need to start a few services using Docker first. Make sure your Docker daemon is up and running before executing the following scripts:

From the project root, execute:
1. `./scripts/startMongoDb.sh` - starts a local MongoDB image and an image of Mongo Express, a browser-based admin UI available under [http://localhost:8081](http://localhost:8081).
2. `./scripts/startZipkin.sh` - starts Zipkin tracing server locally on [http://localhost:9411](http://localhost:9411)

Since this project uses 3 services that communicate with each other, it is best to run each of the commands below from a separate terminal.

1. `mvn -f ./sample-service-a/pom.xml spring-boot:run` 
2. `mvn -f ./sample-service-b/pom.xml spring-boot:run` 
3. `mvn -f ./sample-service-c/pom.xml spring-boot:run` 

Once up and running, you can create a person by posting it to `service-a`. The person will be propagated (replicated) into `service-b` from where it will be propagated to `service-c`.

As a result, you will see log output in all 3 services, and also in your [local Mongo Express](http://localhost:8081/db/test/) in the `test` database.

# Metrics

```
docker exec -it scripts_influxdb_1 influx
show databases
```

# References

* [Influx DB, Chronograf and Grafana using Docker Compose](https://github.com/jkehres/docker-compose-influxdb-grafana)
* [Spring Boot Metrics with Influx DB](https://medium.com/@rohansaraf/monitoring-in-springboot-2-0-micrometer-influxdb-chronograf-d049698bfa33)