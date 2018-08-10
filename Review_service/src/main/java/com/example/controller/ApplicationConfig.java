
package com.example.controller;

import com.example.domain.Movie;
import com.example.domain.MovieService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    
    @Bean
    public MovieService movieService(){
        MovieService service = new MovieService();
        Movie m = new Movie("Twilight");
        m.addReview("The movie is lush and beautiful, and the actors are well-chosen.");
        m.addReview("Twilight will mesmerize its target audience, 16-year-old girls and their grandmothers.");
        Movie m2 = new Movie("Fifty shades of grey");
        m2.addReview("Great art it is not - but it is frisky, in charge of itself, and about as keenly felt a vision of this SM power game we could realistically have expected to see.");
        m2.addReview("Just finished watching Fifty Shades of Grey and I gotta say... the film was beautiful. Yes, I am using the word beautiful to describe this movie. I went into the theater completely prepared to be embarrassed because of how graphic it was supposed to be");
        Movie m3 = new Movie("The italian job");
        m3.addReview("I love the mini's");
        service.addMovie(m);
        service.addMovie(m2);
        service.addMovie(m3);
        return service;
    }
}
