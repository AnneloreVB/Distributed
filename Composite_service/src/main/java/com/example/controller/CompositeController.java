
package com.example.controller;

import com.example.client.MovieClient;
import com.example.client.RecommendationClient;
import com.example.client.ReviewClient;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompositeController {
    
    @Autowired
    private MovieClient movieClient;
    
    @Autowired
    private ReviewClient reviewClient;
    
    @Autowired
    private RecommendationClient recommendationClient;
    
    @RequestMapping("/test")
    public String test(){
        return "helloooo";
    }
    
    @RequestMapping("/movie")
    public String getMovie(@RequestParam(name = "title") String title){
        return movieClient.getMovie(title);
    }
    
    @RequestMapping("/review")
    public String getReview(@RequestParam(name = "title") String title){
        return reviewClient.getReviews(title);
    }
    @RequestMapping("/recommended")
    public String getRecommended(@RequestParam(name = "title") String title){
        return recommendationClient.getRecommended(title);
    }
    @RequestMapping("/composite")
    public String getComposite(@RequestParam(name = "title") String title){
        String res = "";
        try{
            if(getMovie(title) != null){
                String movie = "Movie: " +getMovie(title);
                Gson gson = new Gson();
                String json = gson.toJson(movie);
                System.out.println(json);
                res += json;
            }
         
            
        }
        catch(Exception e){
            
        }
        try{
            String movie = " Review: " + getReview(title);
            Gson gson = new Gson();
            String json = gson.toJson(movie);
            System.out.println(json);
            res += json;
        }
        catch(Exception e){
            
        }
        try{
            String movie = " Recommended:" + getRecommended(title);
            Gson gson = new Gson();
            String json = gson.toJson(movie);
            System.out.println(json);
            res += json;
        }
        catch(Exception e){
            
        }
        return res;
    }
    
}
