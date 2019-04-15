package org.cnu.realcoding.weathercrawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WeatherCrawlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherCrawlerApplication.class, args);
	}

}
