package org.cnu.realcoding.weathercrawler.api;

import org.cnu.realcoding.weathercrawler.domain.CurrentWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenWeatherMapApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl = "https://api.openweathermap.org/data/2.5/weather?q={cityName}&appid={apiKey}";

    public CurrentWeather getCurrentWeather(String cityName) {
         return restTemplate.exchange(requestUrl,
                 HttpMethod.GET,
                 null,
                 CurrentWeather.class,
                 cityName,
                 "687f1ddf2e410410acd37f4f9ae3a481").getBody(); //Entity엔 html header 값
    }
}
