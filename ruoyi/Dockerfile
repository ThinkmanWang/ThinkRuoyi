FROM maven as build-stage
WORKDIR /app
COPY . .
RUN mvn clean package -Dmaven.test.skip=true
RUN ls /app

# 基础镜像
FROM openjdk:8
COPY --from=build-stage /app/target/ruoyi.jar ruoyi.jar

ENV JAVA_OPTS="-Xms2048m -Xmx2048m -XX:PermSize=2048m -XX:MaxPermSize=2048m -XX:MaxNewSize=1024m"

#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /ruoyi.jar > /dev/null 2>&1 &" ]