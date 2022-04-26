#!/bin/sh

docker build . -t ruoyi-api:latest
docker save ruoyi-api > ruoyi-api.tar
