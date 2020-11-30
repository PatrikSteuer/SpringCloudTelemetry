#!/bin/bash

curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Alan\",  \"lastName\" : \"Turing\" }" http://localhost:8001/people
curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Dennis\",  \"lastName\" : \"Ritchie\" }" http://localhost:8001/people
curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Grady\",  \"lastName\" : \"Booch\" }" http://localhost:8001/people