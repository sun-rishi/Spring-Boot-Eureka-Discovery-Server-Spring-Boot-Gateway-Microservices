# Microservices With Eureka Client, Server and Spring Cloud Gateway

This project has three microservices which are registered with Eureka Server. Spring Cloud Gateway is used to communicate to each of the service.


# Quick Start
Note: Run as Springbootapp using Spring Tool Suite.

Run discovery server. (PORT - 8761)

Run all three microservices. (PORT - 8661,8662,8663)

Run gateway Service. (PORT - 8080)

# Final Review
Go To Url: http://localhost:8661/service-one/get

Go To Url: http://localhost:8662/service-two/get

Go To Url: http://localhost:8663/service-three/get

Go To Url for gateway routing for all three services:

http://localhost:8080/service-one/get   

http://localhost:8080/service-two/get  

http://localhost:8080/service-three/get   

## Feedback

Please report bugs, concerns, suggestions by issues.
