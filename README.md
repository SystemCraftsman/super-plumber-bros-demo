# super-plumber-bros-demo

rhoas login

rhoas kafka create --name super-plumber-bros

rhoas service-account create --file-format json --short-description="super-plumber-bros-sa"

rhoas kafka acl grant-access --producer --consumer --service-account 5c63f34c-fefc-40d6-86f5-b4dbb3cb0eaa --topic all --group all

rhoas kafka topic create --name repair-request.events


