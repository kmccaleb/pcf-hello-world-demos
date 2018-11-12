# pcf-hello-world-demos
Three simple Pivotal Cloud Foundry (PCF) demos using Spring Boot, PHP and Golang that displays current time

## Java build and deploy
at the shell type 
1. mvn package (to create war file)
2. cf push to deploy to cloud (make sure manifest yaml points to the war file location)

## PHP build and deploy
1. cd php-time
2. cf push

## Golang build and deploy
1. cd go-time
2. cf push
