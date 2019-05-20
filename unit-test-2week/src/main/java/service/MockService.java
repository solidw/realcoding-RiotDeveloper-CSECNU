package service;

import domain.Champion;
import repository.MockRepository;

import java.util.List;

public class MockService {
    private final MockRepository mockRepository;

    public MockService(MockRepository mockRepository) {
        this.mockRepository = mockRepository;
    }

    public List<Champion> findAllChampions() {
        return mockRepository.findAll();
    }

    public Champion findByChampionName(String name) {
        Champion champion = mockRepository.findByName(name);
        return champion;
    }

    public Champion updatePositionByName(String name, String position) {
        Champion champion = findByChampionName(name);
        champion.setName(position);

        return champion;
    }

    public void addChampion(Champion champion){
        Champion addChampion = new Champion(champion.getName(), champion.getPosition(), champion.getHasSkinCount());
        mockRepository.addChampion(addChampion);
        return;
    }
}
