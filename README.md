![banner](https://user-images.githubusercontent.com/10568159/186654205-dcecc6c4-34c9-418a-afe3-f987e36368d0.png)

![Plumbers-1](https://user-images.githubusercontent.com/10568159/186654282-8d63b6ac-ac78-4230-b9b8-dbdf9847bfcb.jpg)


## Create and Configure Your Managed Kafka Instance

You can run the following commands in order or you can use the RHOAS web interface for creating a Kafka instance.

```shell
rhoas login
```

```shell
rhoas kafka create --name super-plumber-bros
```

```shell
rhoas service-account create --file-format json --short-description="super-plumber-bros-sa"
```

```shell
rhoas kafka acl grant-access --producer --consumer --service-account YOUR_SERVICE_ACCOUNT_ID --topic all --group all
```

```shell
rhoas kafka topic create --name repair-request.events
```

## Run the Services

You can run each service with `./mvnw clean package quarkus:dev` command.
You will need to configure a PostgreSQL database for each service.

## Kafka Connect with the Debezium Connector

You will need to run a Kafka Connect instance with the given configurations under `resources`.

## Play the Game

https://www.youtube.com/watch?v=_trHewBi5xY
