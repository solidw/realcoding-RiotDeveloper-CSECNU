package org.cnu.realcoding.lolcrawler.lolcrawler.domain;

import lombok.Data;

@Data
public class LeaguePositionEncryptedID {
    private class miniSeriesDTO {
        String progress;
        int losses;
        int target;
        int wins;
    }
    private String queueType;
    private String summonerName;
    private boolean hotStreak;
    private miniSeriesDTO miniSeries;
    private int wins;
    private boolean veteran;
    private int losses;
    private String rank;
    private String leagueId;
    private boolean inactive;
    private boolean freshBlood;
    private String leagueName;
    private String position; // (Legal values: APEX, TOP, JUNGLE, MIDDLE, BOTTOM, UTILITY, NONE)
    private String tier;
    private String summonerId; //Player's summonerId (Encrypted)
    private int leaguePoints;
}
