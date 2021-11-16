#!/bin/bash

# Test and build the app
echo -e "\e[1m\e[34mTest and build the app\e[39m\e[0m"
mvn clean compile package -DskipTests

