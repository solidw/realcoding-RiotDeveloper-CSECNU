package org.cnu.realcoding.weathercrawler.controller;

import org.cnu.realcoding.weathercrawler.domain.Dog;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DogController {
    private List<Dog> dogList = new ArrayList<>();
    @PostMapping("/dogs") // http://localhost:8080/dogs
    public void insertDog(@RequestBody Dog dog) {
        dogList.add(dog);
    }

    @GetMapping("/dogs")
    public List<Dog> findAllDogs() {
        return dogList ;
    }

    @GetMapping("/dogs/{name}") // http://localhost:8080/dogs/"ian"
    public Dog findDogs(@PathVariable String name) {
        for (int i = 0; i < dogList.size(); i++) {
            if (dogList.get(i).getName() == name) {
                return dogList.get(i);
            }
        }
        return null;
    }
}
