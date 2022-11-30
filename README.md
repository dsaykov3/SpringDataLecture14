# SpringDataLecture14

Add this to bin->tomcat_users.xml
```xml
<role rolename="manager-gui"></role>
<user username="tomcat" password="admin" roles="manager-gui,manager-script,manager-jmx"></user>
</tomcat-users>

```
Add that to setting.xml in user .m2 directory in the users folder.
```xml
 <servers>
     <server>
       <id>TomcatServer</id>
       <username>tomcat</username>
       <password>admin</password>
     </server>
	 </servers>
```
  
 Add run configuration in IntelliJ with the following commands
```java
 clean package tomcat7:deploy
```
 
 Then while having the Tomcat running, just run the created app.
 The plugin is configured inside the pom.xml
