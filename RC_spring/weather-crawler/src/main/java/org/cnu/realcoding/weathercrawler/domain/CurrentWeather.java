package org.cnu.realcoding.weathercrawler.domain;

import java.util.ArrayList;
import lombok.Data;

@Data
public class CurrentWeather {
//    private Coord coord;
    private ArrayList<Weather> weather;
//    private String base;
    private Main main;
//    private int visibility;
//    private Wind wind;
//    private Cloud clouds;
//    private double dt;
//    private Others sys;
//    private double id;
    private String name;
//    private double cod;

    @Data
    public static class Coord {
        private double lon;
        private double lat;
    }

    @Data
    public static class Weather {
        private int id;
        private String main;
        private String description;
        private String icon;
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
        private double type;
        private double id;
        private double message;
        private String country;
        private long sunrise;
        private long sunset;
    }

    @Data
    public static class Wind {
        private double speed;
        private double deg;
    }

    @Data
    public static class Cloud {
        private double all;
    }
}

/*
@Data
public class CurrentWeather {
    private Coord coord;
    private ArrayList<Weather> weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Cloud clouds;
    private double dt;
    private Others sys;
    private double id;
    private String name;
    private double cod;

    @Data
    public static class Coord {
        private double lon;
        private double lat;
    }

    @Data
    public static class Weather {
        private int id;
        private String main;
        private String description;
        private String icon;
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
        private double type;
        private double id;
        private double message;
        private String country;
        private long sunrise;
        private long sunset;
    }

    @Data
    public static class Wind {
        private double speed;
        private double deg;
    }

    @Data
    public static class Cloud {
        private double all;
    }
}
 */