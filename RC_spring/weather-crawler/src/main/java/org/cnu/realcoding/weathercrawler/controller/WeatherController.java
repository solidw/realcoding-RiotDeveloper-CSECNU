package org.cnu.realcoding.weathercrawler.controller;

import org.cnu.realcoding.weathercrawler.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/available-cities")
    public List<String> getAvailableCities() {
        return weatherService.getAvailableCityNames();
    }
}
