package se.experis.resturant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import se.experis.resturant.domain.Restaurant;
import se.experis.resturant.domain.RestaurantRepository;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class RestaurantdatabaseApplication {
	private static final Logger logger = LoggerFactory.getLogger(RestaurantdatabaseApplication.class);

	@Autowired
	private RestaurantRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(RestaurantdatabaseApplication.class, args);
		logger.info("Hello Spring Boot");
	}

	@Bean
	/*	The CommandLineRunner interface allows us to
	 	execute additional code before the application
	 	has fully started*/
	CommandLineRunner runner(){
		return args -> {
			//Save demodata to database
			java.util.Date createdA = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse("2017-11-15 15:30:14.332");
			java.util.Date updatedAt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse("2017-11-15 15:30:14.332");

			repository.save(new Restaurant("Bistro", "Fogdevägen 3B", "Thai", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 1, createdA, updatedAt));
			repository.save(new Restaurant("BioBurger", "Burgervägen 3B", "American", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 0, createdA, updatedAt));
			repository.save(new Restaurant("KorvGubben", "korvavägen 3B", "HotDog", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 1, createdA, updatedAt));
		};
	}

}

/*String name,
String address,
String category,
String description,
int active,
java.util.Date createdAt,
java.util.Date updatedAt
 */