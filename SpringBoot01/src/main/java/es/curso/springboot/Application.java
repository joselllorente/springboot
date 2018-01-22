package es.curso.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8090 );
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

	}

}