package com.example.feign.feign.imp;

import com.example.feign.feign.IWeatherClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class WeatherFallback implements IWeatherClient {

    @Override
    public ResponseEntity<Map> getWeather() {
    	System.out.println("Weather serive is down");
        return null;
    }

}
