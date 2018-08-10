
package com.example.domain;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    
    private String title;
    private int year;
    private String genre;
    private String actors;
    
    private List<Movie> recommended;
    
    public Movie(){
        recommended = new ArrayList<>();
    }
    public Movie(String title,String genre, String actors, int year){
        this();
        setTitle(title);
        
    }
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
    
    public void addRecommended(Movie review){
        this.recommended.add(review);
    }
    public List<Movie> getRecommended(){
        return this.recommended;
    }
    
     
     
    
}
