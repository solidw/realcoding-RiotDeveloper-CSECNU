package org.cnu.realcoding.lolcrawler.lolcrawler.api;

import org.cnu.realcoding.lolcrawler.lolcrawler.domain.LeaguePositionEncryptedID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OpenLeaguePositionEncryptedIDApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl = "https://kr.api.riotgames.com/lol/league/v4/positions/by-summoner/{encryptedID}?api_key={apiKey}";

    public List<LeaguePositionEncryptedID> getLeaguePositionEncryptedIDs(String ID) {
        ResponseEntity<List<LeaguePositionEncryptedID>> leaguePositionResponse =
                restTemplate.exchange(requestUrl,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<LeaguePositionEncryptedID>>() {

                        },
                        ID,
                        "RGAPI-cc5d4edd-28d3-4a8b-ae28-f4e8c4e24c27");

        List<LeaguePositionEncryptedID> leaguePositions = leaguePositionResponse.getBody();
        return leaguePositions;
    }
}