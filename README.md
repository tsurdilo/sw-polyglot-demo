Start node func: npm run local
Curl node: curl -X POST localhost:8080

Start go func: go run handle.go
Curl go: curl -X POST localhost:8081

Start java func: mvn clean install quarkus:dev
Curl java: curl -X POST localhost:8082/greet

Start workflow func: mvn clean intsall quarkus:dev
Curl workflow:  curl -X POST -H "content-type: application/json" -d '{"workflowdata": {}}' localhost:8083/simple | jq '.workflowdata'
