package org.cnu.realcoding.lolcrawler.lolcrawler.repository;

import org.cnu.realcoding.lolcrawler.lolcrawler.domain.LeaguePositionEncryptedID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.List;

@Repository
public class LeaguePositionRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertLeaguePosition(List<LeaguePositionEncryptedID> leaguePositionEncryptedIDs) {
        Query query;
        for (int i = 0; i < leaguePositionEncryptedIDs.size(); i++) {
            String queueType = leaguePositionEncryptedIDs.get(i).getQueueType();
            if (queueType.equals("RANKED_SOLO_5x5")) { // 5:5 ranked only
                query = query(where("summonerName").is(leaguePositionEncryptedIDs.get(i).getSummonerName()));
                List<? extends LeaguePositionEncryptedID> summoners = mongoTemplate.find(query, leaguePositionEncryptedIDs.get(i).getClass());
                if (!summoners.isEmpty()) {
                    mongoTemplate.update(leaguePositionEncryptedIDs.get(i).getClass());
                    System.out.println("중복입니다. Update 합니다.");
                } else {
                    mongoTemplate.insert(leaguePositionEncryptedIDs.get(i));
                    System.out.println(leaguePositionEncryptedIDs);
                }
            }
        }
    }
}