
package com.example.controller;

import com.example.domain.Movie;
import com.example.domain.MovieService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    
    @Bean
    public MovieService movieService(){
        MovieService service = new MovieService();
        Movie m = new Movie("The italian job", "action , crime, thriller","Mark Wahlberg, Charlize Theron, Donald Sutherland, Jason Statham", 2003);
        Movie m2 = new Movie("The Transporter","action, crime, thriller","Jason Statham, Qi Shu, Matt Schulze, François Berléand",2002);
        Movie m3 = new Movie("Snow White and the Huntsman","Action, Adventure, Drama","Kristen Stewart, Chris Hemsworth, Charlize Theron, Sam Claflin",2012);
        m.addRecommended(new Movie("The Transporter","action, crime, thriller","Jason Statham, Qi Shu, Matt Schulze, François Berléand",2002));
        m.addRecommended(new Movie("Snow White and the Huntsman","Action, Adventure, Drama","Kristen Stewart, Chris Hemsworth, Charlize Theron, Sam Claflin",2012));
        m2.addRecommended(new Movie("The italian job", "action , crime, thriller","Mark Wahlberg, Charlize Theron, Donald Sutherland, Jason Statham", 2003));
        m3.addRecommended(new Movie("The italian job", "action , crime, thriller","Mark Wahlberg, Charlize Theron, Donald Sutherland, Jason Statham", 2003));
        service.addMovie(m);
        service.addMovie(m2);
        service.addMovie(m3);
        return service;
    }
}
