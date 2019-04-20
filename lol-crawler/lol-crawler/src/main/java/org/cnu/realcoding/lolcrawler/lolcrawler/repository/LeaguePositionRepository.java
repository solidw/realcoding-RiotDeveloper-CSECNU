package org.cnu.realcoding.lolcrawler.lolcrawler.repository;

import org.cnu.realcoding.lolcrawler.lolcrawler.domain.LeaguePositionEncryptedID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LeaguePositionRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertLeaguePosition(LeaguePositionEncryptedID leaguePositionEncryptedID) {
        mongoTemplate.insert(leaguePositionEncryptedID);
    }


}
