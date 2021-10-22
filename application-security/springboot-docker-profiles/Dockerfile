# Start with a base image containing Java runtime
FROM amazoncorretto:11

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Default to UTF-8 file.encoding
ENV LANG C.UTF-8

RUN yum update curl -y

# Make port 8080 available to the world outside this container
RUN yum update bash cpio expat glibc python2 libxml openldap  libssh2 libxml2 openldap -y
RUN yum install shadow-utils e2fsprogs -y

ONBUILD RUN yum update -y -q

RUN  useradd -u 9001 -ms /bin/bash dockeruser
USER dockeruser
WORKDIR /home/dockeruser

RUN mkdir -p /tmp/landing
RUN mkdir -p /tmp/explode
HEALTHCHECK CMD curl --fail http://localhost:8080/actuator/health || exit 1

COPY target/rest-service-0.0.1-SNAPSHOT.jar .
# Run the jar file
ENTRYPOINT ["java","-jar","rest-service-0.0.1-SNAPSHOT.jar"]
