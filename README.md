#Simple microservice with eureka client and server

Note: run as springbootapp

first- Run discovery server
then all other microservices
In the end run spring cloud gateway

Go To Url: http://localhost:8661/service-one/get
Go To Url: http://localhost:8662/service-two/get
Go To Url: http://localhost:8663/service-three/get

Now Go To Url for gateway routing :
http://localhost:8080/service-one/get    
http://localhost:8080/service-two/get    
http://localhost:8080/service-three/get   

## Feedback

Please report bugs, concerns, suggestions by issues.
