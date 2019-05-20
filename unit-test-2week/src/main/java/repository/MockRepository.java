package repository;

import domain.Champion;

import java.util.List;

public interface MockRepository {
    List<Champion> findAll();

    Champion findByName(String name);

    Champion updatePositionByName(String name, String position);

    void addChampion(Champion champion);
}
