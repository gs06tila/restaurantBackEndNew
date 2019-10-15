package se.experis.resturant.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long reviewId;

    @Column(precision=2, scale=1)
    private double rating;

    @Column(columnDefinition = "TEXT")
    private String reviewText;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createdAt;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updatedAt;


    public Review() {}

    public Review(double rating, String reviewText, Date createdAt, Date updatedAt, Restaurant restaurant, User user) {
        super();
        reviewId=0;
        this.rating = rating;
        this.reviewText = reviewText;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.restaurant = restaurant;
        this.user = user;

    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant")
    private Restaurant restaurant;

    //Getter and setter
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user")
    private User user;

}
