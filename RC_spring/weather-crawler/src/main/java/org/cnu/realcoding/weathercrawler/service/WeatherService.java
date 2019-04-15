package org.cnu.realcoding.weathercrawler.service;

import org.cnu.realcoding.weathercrawler.api.OpenWeatherMapApiClient;
import org.cnu.realcoding.weathercrawler.domain.CurrentWeather;
import org.cnu.realcoding.weathercrawler.repository.CurrentWeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class WeatherService {
    @Autowired
    private AvailableCityNameService availableCityNameService;

    @Autowired
    private OpenWeatherMapApiClient openWeatherMapApiClient;

    @Autowired
    private CurrentWeatherRepository currentWeatherRepository;

    private LinkedList<String> queue = new LinkedList();

    public List<String> getAvailableCityNames() {
        return availableCityNameService.getAvailableCityNames();
    }

    @Scheduled(initialDelay = 5000L, fixedDelay = 2000L)
    public void getCurrentWeatherPeriodically() {
        if(queue.isEmpty()) {
            queue.addAll(this.getAvailableCityNames());
        }
        String target = queue.pop();
        queue.add(target);

        CurrentWeather currentWeather = openWeatherMapApiClient.getCurrentWeather(target);
        currentWeatherRepository.insertCurrentWeather(currentWeather);
    }

}
