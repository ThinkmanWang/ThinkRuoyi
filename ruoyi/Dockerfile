# 基础镜像
FROM openjdk:8

ADD target/ruoyi.jar ruoyi.jar
#ENV JAVA_OPTS=""

#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Xms2048m -Xmx2048m -XX:PermSize=2048m -XX:MaxPermSize=2048m -XX:MaxNewSize=1024m -jar ruoyi-admin_8443.jar > /dev/null 2>&1 & /ruoyi.jar" ]