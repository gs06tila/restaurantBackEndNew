package se.experis.restaurantdb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import se.experis.restaurantdb.domain.Restaurant;
import se.experis.restaurantdb.domain.RestaurantRepository;
import se.experis.restaurantdb.domain.Review;

import java.util.List;

@RestController
public class RestaurantController {
	@Autowired
	private RestaurantRepository repository;

	@RequestMapping("/cars")
	public Iterable<Restaurant> getRestaurants() {
		return repository.findAll();
	}
}
