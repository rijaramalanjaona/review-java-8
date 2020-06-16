package dev.rija.reviewjava8.r02foreach;

import dev.rija.reviewjava8.r02foreach.utils.DataGenerator;

import java.util.Map;

public class LoopMapWithLambda {
    public static void main(String[] args) {
        Map<String, Integer> items = DataGenerator.getMap();

        items.forEach((key, value) -> System.out.println("Key : " + key + " Value : " + value));

        System.out.println("--------------------------");

        // cible un element
        items.forEach((key, value) -> {
            System.out.println("Key : " + key + " Value : " + value);
            if ("E".equals(key)) {
                System.out.println("Hello E");
            }
        });
    }
}
