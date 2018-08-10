
package com.example.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Movie {
    
    private String title;
    
    private List<String> reviews;
    
    public Movie(){
        reviews = new ArrayList<>();
    }
    public Movie(String title){
        this();
        setTitle(title);
        
    }
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addReview(String review){
        this.reviews.add(review);
    }
    public List<String> getReviews(){
        return this.reviews;
    }
    
     
     
    
}
