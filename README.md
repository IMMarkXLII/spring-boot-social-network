# spring-boot-social-network

* To run this app, right click on  SocialNetworkApp.java class and run as Java/Spring Boot Application.
* We can also use maven to run this application. Use goals [clean package spring-boot:run] with maven to clean /target directory, package into an executable war and then run as a spring boot application.

       
- to support jsps in your spring boot web project, add the following dependency along with spring-boot-starter-web
```
  	<dependency>
		<groupId>org.apache.tomcat.embed</groupId>
		<artifactId>tomcat-embed-jasper</artifactId>
	</dependency>
```


- To create an executable war file, use the following plugin  

```
  	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<executable>true</executable>
				</configuration>
			</plugin>
		</plugins>
	</build>

```
