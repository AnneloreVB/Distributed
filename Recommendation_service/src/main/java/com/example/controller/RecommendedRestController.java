package com.example.controller;

import com.example.domain.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendedRestController {
    
    @Autowired
    private MovieService movieService;
    
    public RecommendedRestController(){
        
    }
    @RequestMapping("/test")
    public String test(){
        return "Hello Youuu hi";
    }
    @RequestMapping("/recommended")
    public String getRecommended(@RequestParam(name = "title") String title){
        return movieService.getRecommended(title);
    }
}
