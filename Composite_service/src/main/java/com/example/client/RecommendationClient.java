/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "recommendation-service")
@RibbonClient(name = "recommendation-service")
public interface RecommendationClient {
    
    @GetMapping("/recommended")
    String getRecommended(@RequestParam(name = "title") String title);        
}
