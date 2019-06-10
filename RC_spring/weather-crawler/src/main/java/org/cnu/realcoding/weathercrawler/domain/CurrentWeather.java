package org.cnu.realcoding.weathercrawler.domain;

import java.util.ArrayList;
import lombok.Data;

@Data
public class CurrentWeather {
    private String name;
    private ArrayList<Weather> weather;
    private Main main;
    private Others sys;

    @Data
    public static class Weather {
        private String main;
    }

    @Data
    public static class Main {
        private double temp;
        private int pressure;
        private int humidity;
        private double temp_min;
        private double temp_max;
    }

    @Data
    public static class Others {
        private String country;
        private long sunrise;
        private long sunset;
    }
}