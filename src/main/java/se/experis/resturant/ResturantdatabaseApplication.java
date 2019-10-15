package se.experis.resturant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResturantdatabaseApplication {
	private static final Logger logger = LoggerFactory.getLogger(ResturantdatabaseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ResturantdatabaseApplication.class, args);
		logger.info("Hello Spring Boot");
	}

}
