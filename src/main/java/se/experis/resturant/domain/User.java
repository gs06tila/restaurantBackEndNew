package se.experis.resturant.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
    @Id //Define primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Define automatically generated ID
    @Column(nullable = false, updatable = false)
    private long userId;

    @Column(length=128, nullable = false, updatable = false)
    private String username;

    @Column(length = 128)
    private String email;

    @Column(length = 20, nullable = false)
    private String password;

    @Column(length = 1, nullable = false)
    private int role;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createdAt;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updatedAt;

    @Column(length = 1)
    private int active;

    public User() {}

    public User(String username, String email, String password, int role, Date createdAt, Date updatedAt, int active) {
        super();
        userId=0;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.active = active;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
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

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
   @JsonIgnore
    private List<Review> reviews;

    //Getters and setters
    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

}
