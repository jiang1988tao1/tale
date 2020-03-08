FROM openjdk:8-jre-alpine
VOLUME ["/data","/data/db","/data/logs"]
WORKDIR /app
ADD target/dist/tale.tar.gz /app
RUN sh -c 'touch /app/tale-latest.jar'
ENV  JAVA_OPTS="-server -Xmx256m -Xms256m -Dfile.encoding=UTF8  -Duser.timezone=GMT+08"
CMD  exec  java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom  -jar /app/tale-latest.jar --app.env=prod