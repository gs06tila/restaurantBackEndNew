package se.experis.resturant.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long reviewId;

    @Column(precision=2, scale=1)
    private float rating;

    @Column(columnDefinition = "TEXT")
    private String reviewText;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createdAt;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updatedAt;

    public Review() {}

    public Review(float rating, String reviewText, Date createdAt, Date updatedAt) {
        this.rating = rating;
        this.reviewText = reviewText;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
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
}
