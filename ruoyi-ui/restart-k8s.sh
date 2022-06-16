#!/bin/sh

docker build . -t localhost:32000/ruoyi-ui:latest
docker push localhost:32000/ruoyi-ui:latest
kubectl rollout restart -n kube-system deployment ruoyi-ui
