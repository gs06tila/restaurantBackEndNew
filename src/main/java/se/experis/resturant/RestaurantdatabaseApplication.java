package se.experis.resturant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import se.experis.resturant.domain.*;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class RestaurantdatabaseApplication {
	private static final Logger logger = LoggerFactory.getLogger(RestaurantdatabaseApplication.class);

	@Autowired
	private RestaurantRepository repository;

	@Autowired
	private ReviewRepository revrepository;

	@Autowired
	private UserRepository userrepository;

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

			// Add restaurant objcts and save to db
			Restaurant res1 = new Restaurant("Bistro", "Fogdevägen 3B", "Thai", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 1, createdA, updatedAt);
			Restaurant res2 = new Restaurant("BioBurger", "Burgervägen 3B", "American", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 0, createdA, updatedAt);
			Restaurant res3 = new Restaurant("KorvGubben", "korvavägen 3B", "HotDog", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 1, createdA, updatedAt);
			repository.save(res1);
			repository.save(res2);
			repository.save(res3);

			//Add user objects and save to db
			User us1 = new User("gs06tila", "awesomemail", "secure", 1, createdA, updatedAt, 1);
			User us2 = new User("Edis91", "funnyemail", "impossible", 2, createdA, updatedAt, 1);
			User us3 = new User("LightMachineGun", "superemail", "12345", 3, createdA, updatedAt, 0);
			userrepository.save(us1);
			userrepository.save(us2);
			userrepository.save(us3);

			//Add review to db
			revrepository.save(new Review(4.52, "Fucking awesome!!!", createdA, updatedAt, res1, us1));
			revrepository.save(new Review(2.4, "My girlfriend died after a visit here! the meat came from a man who apparently died of the disease. I really didn´t like her, so you guys deserves 2/10. ", createdA, updatedAt, res2, us3));
			revrepository.save(new Review(5.46, "KorvGubben knows how to serve a really juicy sausage", createdA, updatedAt, res3, us1));

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