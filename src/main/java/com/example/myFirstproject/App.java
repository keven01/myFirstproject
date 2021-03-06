package com.example.myFirstproject;

/**
 * Hello world!
 *
 */
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
  
@SpringBootApplication  
public class App extends SpringBootServletInitializer {  
  
    public static void main(String[] args) {  
    	System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);  
    }  
   @Override
    protected App configure(App builder) {
        return builder.sources(Application.class);
    }
}
