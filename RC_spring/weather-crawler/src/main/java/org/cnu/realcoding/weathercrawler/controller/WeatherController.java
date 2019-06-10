package org.cnu.realcoding.weathercrawler.controller;

import org.cnu.realcoding.weathercrawler.api.OpenWeatherMapApiClient;
import org.cnu.realcoding.weathercrawler.domain.CurrentWeather;
import org.cnu.realcoding.weathercrawler.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;
    @Autowired
    private OpenWeatherMapApiClient openWeatherMapApiClient;

    @GetMapping("/available-cities")
    public List<String> getAvailableCities() {
        return weatherService.getAvailableCityNames();
    }

    @GetMapping("/byCityName/{cityName}")
    public CurrentWeather getWeatherInformation(@PathVariable String cityName) { return openWeatherMapApiClient.getCurrentWeather(cityName);}

}
