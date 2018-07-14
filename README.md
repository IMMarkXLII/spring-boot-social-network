# spring-boot-social-network

* To run this app, right click on  SocialNetworkApp.java class and run as Java/Spring Boot Application.
* We can also use maven to run this application. Use goals [clean package spring-boot:run] with maven to clean /target directory, package into an executable war and then run as a spring boot application.



## Apache Tiles configuration

### Add the following dependencies: Refer pom.xml

	* tiles-core
	* tiles-jsp

### Create the following two beans. Refer /spring-boot-tutorial/src/main/java/com/caveofprogramming/SocialNetworkApp.java
	
	* UrlBasedViewResolver
	* TilesConfigurer
	
### Create tiles.xml file (look up templates on google)
	* Refer /spring-boot-tutorial/src/main/webapp/WEB-INF/tiles.xml

### Create layouts( use tiles namespaces to include content in the layouts). 
	* Refer /spring-boot-tutorial/src/main/webapp/WEB-INF/layouts/default.jsp
	
### keep in mind that the controllers should now return tiles-definitions mentioned in tiles configuration xml files. The old jsp 	servlets will still be able to be served as they were.