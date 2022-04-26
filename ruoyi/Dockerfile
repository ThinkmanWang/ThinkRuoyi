#FROM maven as build-stage
#WORKDIR /app
#COPY . .

#RUN mvn -B clean package -Dmaven.test.skip=true -Dautoconfig.skip -P prod
#RUN ls /app



FROM openjdk:8
WORKDIR /app
COPY ./ruoyi-admin/target/ruoyi-admin.jar /app/ruoyi-admin.jar
ENTRYPOINT ["/bin/sh", "-c", "java -Duser.timezone=Asia/Shanghai -Djava.security.egd=file:/dev/./urandom -jar /app/ruoyi-admin.jar"]
