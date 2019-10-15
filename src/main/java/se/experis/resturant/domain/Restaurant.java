package se.experis.resturant.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Restaurant {
    @Id //Define primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //Define automatically generated ID
    private long restaurantId;

    @Column(length=128)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String address;

    private String category;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(length=1)
    private int active;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createdAt;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updatedAt;

    public Restaurant() {}

    public Restaurant(String name, String address, String category, String description, int active, java.util.Date createdAt, java.util.Date updatedAt) {
        super();
        this.name = name;
        this.address = address;
        this.category = category;
        this.description = description;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurant")
    private List<Review> reviews;

    //Getters and setters
    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
