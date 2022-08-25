# Super Plumber Bros Demo

## Create and Configure Your Managed Kafka Instance

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

