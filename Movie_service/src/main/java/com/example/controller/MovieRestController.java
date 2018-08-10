package com.example.controller;

import com.example.domain.MovieRetriever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieRestController {
    
    @Autowired
    private MovieRetriever retriever;
    
    public MovieRestController(){
        
    }
    @RequestMapping("/test")
    public String test(){
        return "Hello Youuu hi";
    }
    @RequestMapping("/movie")
    public String getMovie(@RequestParam(name = "title") String title){
        return retriever.getInfo(title);
    }
}
