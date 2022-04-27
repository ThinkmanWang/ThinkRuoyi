#!/bin/sh

mvn -B clean package -Dmaven.test.skip=true -Dautoconfig.skip -P prod
