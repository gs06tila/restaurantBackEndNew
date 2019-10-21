package se.experis.restaurantdb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.experis.restaurantdb.domain.Restaurant;
import se.experis.restaurantdb.domain.RestaurantRepository;
import se.experis.restaurantdb.domain.Review;
import se.experis.restaurantdb.domain.ReviewRepository;

@RestController
public class ReviewController {
    @Autowired
    private ReviewRepository repository;

    /*@RequestMapping("/api/reviews/top")
    public Iterable<Review> getReviews() {
        return repository.findTop5ByOrderByRatingDesc();
        //return repository.findAll();
    }*/
}
