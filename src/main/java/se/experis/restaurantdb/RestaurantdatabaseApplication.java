package se.experis.restaurantdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se.experis.restaurantdb.domain.*;

@SpringBootApplication
public class RestaurantdatabaseApplication {
	@Autowired
	private ReviewRepository revrepository;

	@Autowired	
	private RestaurantRepository repository;

	@Autowired	
	private UserRepository urepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RestaurantdatabaseApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			//Add user objects and save to db
			User us1 = new User("timfoodlover", "awesome", "foodlove@lovefood.se", "ADMIN", 1);
			User us2 = new User("mastersushi", "sushi", "sushi@sushi.se", "USER", 1);
			User us3 = new User("LightMachineGun", "superemail@gun.se", "mailmail@mail.se", "USER", 1);
			User us4 = new User("gs06tila", "masterpassword", "gs06tila@gmail.com", "ADMIN", 1);
			User us5 = new User("restaurantuser", "password", "restaurant@restaurant.se", "USER", 1);
			User us6 = new User("foodUser", "password1", "foos@restaurant.se", "USER", 0);
			User us7 = new User("svensen", "password", "pass@restaurant.se", "USER", 1);
			urepository.save(us1);
			urepository.save(us2);
			urepository.save(us3);
			urepository.save(us4);
			urepository.save(us5);
			urepository.save(us6);
			urepository.save(us7);

			// Add restaurant objcts and save to db
			Restaurant res1 = new Restaurant("Pinchos", " Klostergatan 10", "Växjö", "Thai", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 1, us1);
			Restaurant res2 = new Restaurant("Knock 'em Down", " Västra Esplanaden 5", "Växjö", "American", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 0, us1);
			Restaurant res3 = new Restaurant("PM & Vänner", "Storgatan 22", "Växjö", "HotDog", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 1, us1);
			Restaurant res4 = new Restaurant("Båtsmannen", "Båtsmanstorget 1", "Växjö", "HotDog", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 1, us1);
			Restaurant res5 = new Restaurant("Izakaya Moshi", "Södra Järnvägsgatan 2", "Växjö", "HotDog", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 1, us1);
			Restaurant res6 = new Restaurant("Massimo", " Sandgärdsgatan 10", "Växjö", "HotDog", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 1, us1);
			Restaurant res7 = new Restaurant("Grilleriet Burgers Växjö", " Kungsgatan 4", "Växjö", "HotDog", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 1, us1);
			Restaurant res8 = new Restaurant("Umami Monkey", "Storgatan 18", "Växjö", "HotDog", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 1, us1);
			Restaurant res9 = new Restaurant("Urban Smak", "Västergatan 6", "Växjö", "HotDog", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 1, us1);
			Restaurant res10 = new Restaurant("Piazza Teatro", "Teatertorget", "Växjö", "HotDog", "pdcokjw pokcq  pok   pojcsvw vww veww ev w", 1, us1);
			repository.save(res1);
			repository.save(res2);
			repository.save(res3);
			repository.save(res4);
			repository.save(res5);
			repository.save(res6);
			repository.save(res7);
			repository.save(res8);
			repository.save(res9);
			repository.save(res10);

			//Add review to db
			revrepository.save(new Review(2.5, "This place was ranked as a top place for fish and chips. So we searched it out. Sorry it was average at best and the service was even less. Would not reccomend it.", res1, us2));
			revrepository.save(new Review(5, "Such a nice place! The prices are incredible considering the portion sizes. Been here a couple times before and will definitely be going back. Lovely atmosphere, lovely staff and great service!", res2, us3));
			revrepository.save(new Review(4, "three of us went in for brunch. Interesting to see the staff from the bank nearby eating there. the decor is nicely different, clean and tidy. The staff were friendly and welcoming. The food was very reasonably priced, well presented and served quickly.", res3, us4));
			revrepository.save(new Review(4.7, "Great place to grab a halal English breakfast. Customer service always very good. Well priced between £5-8 for a big breakfast. Definitely recommend", res4, us5));
			revrepository.save(new Review(3, "I heard nice things about this place, didn't try their breakfast yet went there for pizza, nice sourdough pizzas, good quality ingredients but my pizza was overcooked a bit burnt, will try the breakfast next time", res5, us6));
			revrepository.save(new Review(3.9, "Amazing breakfast and amazing interior, I love the place from the first second I walked in and I loved their French toast - so tasty and colourful and also the owner Is very friendly and provides a great service which is amazing to see", res6, us7));
			revrepository.save(new Review(4.8, "A quick visit with a business colleague and it was a nice 30 mins coffee catch up in the morning! We only had a coffee each but it was a nice atmosphere and friendly service. Will visit again", res7, us1));
			revrepository.save(new Review(4.2, "They have a good variety of food and drink. Nice quick food for my lunch break. Only comment for improvement would be to cook the broccoli in the hot boxes. Felt a bit too raw for my liking.", res8, us2));
			revrepository.save(new Review(1.2, "I ordered lamb wrap. I took it back to my office and tried to put it on a plate where the ‘wrap’ turned into lamb and rice. I say lamb and rice but what I mean by that is 1kg of rice and 5g of lamb. Definitely the worst £6.75 I have ever spent.", res9, us3));
			revrepository.save(new Review(1.9, "Very disappointing, usually a decent mid-range curry house has clearly gone downhill. 30 minutes after ordering the waiter comes back to ask what I ordered", res10, us4));
		};
	}	
}
