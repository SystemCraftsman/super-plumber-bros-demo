# Super Plumber Bros Demo

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