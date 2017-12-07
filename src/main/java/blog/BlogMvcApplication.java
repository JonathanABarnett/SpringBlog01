package blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
This class configures and starts your Spring Boot application, which is still empty.
The @SpringBootApplication annotation applies the default configuration settings for our
Spring Boot application (finds and loads all entities, controllers, UI templates and other
application assets). Calling SpringApplication.run(…) will start an embedded Tomcat Web
application server at http://localhost:8080 to serve the HTTP requests to your Spring MVC Web application.
 */
@SpringBootApplication
public class BlogMvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogMvcApplication.class, args);
    }
}