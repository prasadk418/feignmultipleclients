package com.example.feign.controller;

import com.example.feign.feign.IJsonPlaceHolderData;
import com.example.feign.feign.IWeatherClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class FeignController {

	@Autowired
    private IWeatherClient weatherClient;
	
	@Autowired
    private IJsonPlaceHolderData jsonPlaceHolderClient;

    @Autowired
    public FeignController(IWeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    @GetMapping(path = "/weather")
    ResponseEntity<Map> getWeather() {
        return ResponseEntity.ok(weatherClient.getWeather().getBody());
    }
    
    @GetMapping(path = "/json")
    ResponseEntity<Map> getJsonPlaceHolder() {
        return ResponseEntity.ok(jsonPlaceHolderClient.getJson().getBody());    	
    }

}