package org.cnu.realcoding.lolcrawler.lolcrawler.domain;

import lombok.Data;

@Data
public class LeaguePosition {
    private int profileIconId;
    private String name;
    private String puuid;
    private long summonerLevel;
    private long revisionDate;
    private String id;
    private String accountId;
}
