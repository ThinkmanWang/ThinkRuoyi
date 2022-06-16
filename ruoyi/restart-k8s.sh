#!/bin/sh

docker build . -t localhost:32000/ruoyi:latest
docker push localhost:32000/ruoyi:latest
kubectl rollout restart -n kube-system deployment ruoyi-api
