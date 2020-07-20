FROM tomcat:9.0
RUN rm -rf webapps/
RUN mv webapps.dist webapps
COPY Resources/tomcat-users.xml /usr/local/tomcat/conf/
COPY Resources/context.xml /usr/local/tomcat/webapps/manager/META-INF/context.xml
COPY target/*.war /usr/local/tomcat/webapps/
