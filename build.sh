#!/usr/bin/env bash
mvn clean install
docker build -t jsonpath-viewer:latest .
#docker push rameshr/alpine-tomcat8:latest
