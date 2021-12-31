FROM maven as build-stage
WORKDIR /app
COPY . .

mvn -B clean package -Dmaven.test.skip=true -Dautoconfig.skip -P prod
RUN ls /app



FROM openjdk:8
WORKDIR /app
COPY --from=build-stage /app/target/ruoyi.jar /app/ruoyi-admin.jar
ENTRYPOINT ["/bin/sh", "-c", "java -Duser.timezone=Asia/Shanghai -Djava.security.egd=file:/dev/./urandom -jar /app/ruoyi-admin.jar"]
