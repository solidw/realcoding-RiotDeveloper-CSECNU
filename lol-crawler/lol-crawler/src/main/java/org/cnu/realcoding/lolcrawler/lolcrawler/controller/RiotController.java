package org.cnu.realcoding.lolcrawler.lolcrawler.controller;

import org.cnu.realcoding.lolcrawler.lolcrawler.api.OpenLeaguePositionEncryptedIDApiClient;
import org.cnu.realcoding.lolcrawler.lolcrawler.api.OpenLeaguePositionSummonerNameApiClient;
import org.cnu.realcoding.lolcrawler.lolcrawler.domain.LeaguePositionEncryptedID;
import org.cnu.realcoding.lolcrawler.lolcrawler.domain.LeaguePositionSummonerName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RiotController {
    @Autowired
    private OpenLeaguePositionSummonerNameApiClient openLeaguePositionSummonerNameApiClient;
    private LeaguePositionSummonerName leaguePositionSummonerName;

    @Autowired
    private OpenLeaguePositionEncryptedIDApiClient openLeaguePositionEncryptedIDApiClient;
    private List<LeaguePositionEncryptedID> leaguePositionEncryptedID;

    @RequestMapping("/")
    public String index() {
        return "Go to localhost:8080/index.html";
    }

    @RequestMapping("/summoner/{name}")
    public LeaguePositionSummonerName index(@PathVariable String name) {
        leaguePositionSummonerName = openLeaguePositionSummonerNameApiClient.getLeaguePositionByName(name);
        return leaguePositionSummonerName;
    }

    @RequestMapping("/search/{name}")
    public List<LeaguePositionEncryptedID> indexFromID(@PathVariable String name) {
        String ID = "";
        leaguePositionSummonerName = openLeaguePositionSummonerNameApiClient.getLeaguePositionByName(name);
        ID = leaguePositionSummonerName.getId();
        leaguePositionEncryptedID = openLeaguePositionEncryptedIDApiClient.getLeaguePositionEncryptedID(ID);

        return leaguePositionEncryptedID;
    }
}
