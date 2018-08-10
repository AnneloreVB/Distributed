
package com.example.domain;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class MovieService {
    private List<Movie> movies;
    
    public MovieService(){
        movies = new ArrayList<>();
    }
    
    public void addMovie(Movie movie){
        movies.add(movie);
    }
    public void removeMovie(String title){
        movies.remove(getMovie(title));
    }
    public void updateMovie(Movie movie){
        removeMovie(movie.getTitle());
        addMovie(movie);
    }
    public Movie getMovie(String title){
        Movie res = null;
        for(Movie m : this.movies){
            if(m.getTitle().equalsIgnoreCase(title)){
                res = m;
            }
        }
        return res;
    }
    public List<Movie> getAllMovies(){
        return this.movies;
    }
    public String getRecommended(String title){
        Gson json = new Gson();
        this.getMovie(title).getRecommended();
        String result = json.toJson(getMovie(title).getRecommended());
        return result;
    }
}
