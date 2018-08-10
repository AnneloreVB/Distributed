
package com.example.controller;

import com.example.domain.MovieRetriever;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    
    @Bean
    public MovieRetriever retriever(){
        return new MovieRetriever();
    }
}
