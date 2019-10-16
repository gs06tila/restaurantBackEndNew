package se.experis.resturant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.experis.resturant.domain.Restaurant;
import se.experis.resturant.domain.RestaurantRepository;
import se.experis.resturant.domain.Review;
import se.experis.resturant.domain.ReviewRepository;

@RestController
public class ReviewController {
    @Autowired
    private ReviewRepository repository;
/*
    @RequestMapping("/review")
    public Iterable<Review> getReviews() {
        return repository.findAll();
    }

 */
}
