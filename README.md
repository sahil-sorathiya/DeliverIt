# DeliverIt

## Version 1 (Project structure)
1. Created standard project structure
2. Configured JDK in intellij
3. Created directories like "webapps" & files like "pom.xml"
4. Wrote "Main" class
5. Compiled the "Main" class and ran it

## Version 2 (Tomcat & First Servlet)
1. Configured pom.xml by adding repository
2. Dependency "servlet api" added
3. Created "MyServlet" class
4. Created "web.xml" in "webapp/WEB-INF"
5. Added Servlet Mapping in "web.xml"
6. Created "index.html" in "webapp"
7. Compile using "mvn clean package"
8. Add war file into /tomcat/webapps
9. Start tomcat
10. Goto "localhost:8080/DeliverIt-1.x"
11. It will show "index.html"
12. Goto "/myservlet" route, it will run "MyServlet"

## Version 3 (Postgresql)
1. Installed progress locally and configured its path in terminal
2. From terminal created user with appropriate permissions
3. Created DB and Table, also inserted one dummy row in the table
4. Downloaded postgress-jdbc driver and move that .jar file into "/tomact/lib"
5. Added "postgressql" dependency in "pom.xml"
6. Connected to db inside "MyServlet"
7. Prepared a SELECT statement
8. Executed it, and returned output as res