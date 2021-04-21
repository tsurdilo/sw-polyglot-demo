Start node func:
``` 
cd nodejs-func
npm run local
curl -X GET localhost:8080
```

Start go func: 
```
cd go-func
go run handle.go
curl -X POST localhost:8081
```

Start java func: 
```
cd java-func
mvn clean install quarkus:dev
curl -X POST localhost:8082/greet
```

Start workflow func: 
```
cd workflow-func
mvn clean intsall quarkus:dev
Curl workflow:  curl -X POST -H "content-type: application/json" -d '{"workflowdata": {}}' localhost:8083/simpleworkflow | jq '.workflowdata'
```
