./apache-tomcat-10.1.49/bin/shutdown.sh

mvn clean package

cp "./target/Deliverit-$1.war" "./apache-tomcat-10.1.49/webapps"

git add .
git commit -m "$2"
git push -u origin main

./apache-tomcat-10.1.49/bin/startup.sh