# otus-architect
student: Oleg Gerasimov

## Homework1
## checkout
`git clone git@github.com:geracimov/otus-architect.git && cd otus-architect && git checkout hw1`
### run
`kubectl apply -f ./hw1` 
### test
`newman run ./hw1/test/architect-hw1.postman_collection.json`

## Homework2
## checkout
`git clone git@github.com:geracimov/otus-architect.git && cd otus-architect && git checkout hw2`
## run
`helm install crud-simple-service  ./hw2/crud-simple-chart` 
## test
`newman run ./hw2/test/architect-hw2.postman_collection.json` 