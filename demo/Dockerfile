FROM hub.c.163.com/library/java:8-alpine
MAINTAINER xxx@126.com
ADD ./demo/target/demo.jar /app.jar
EXPOSE 8989
ENTRYPOINT ["/usr/bin/java","-jar","app.jar"]
