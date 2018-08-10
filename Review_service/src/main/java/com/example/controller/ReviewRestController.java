package com.example.controller;

import com.example.domain.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewRestController {
    
    @Autowired
    private MovieService movieService;
    
    public ReviewRestController(){
        
    }
    @RequestMapping("/test")
    public String test(){
        return "Hello Youuu hi";
    }
    @RequestMapping("/review")
    public String getReviews(@RequestParam(name = "title") String title){
        return movieService.getReview(title);
    }
}
