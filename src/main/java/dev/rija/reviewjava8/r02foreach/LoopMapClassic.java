package dev.rija.reviewjava8.r02foreach;

import dev.rija.reviewjava8.r02foreach.utils.DataGenerator;

import java.util.Map;

public class LoopMapClassic {
    public static void main(String[] args) {
        Map<String, Integer> items = DataGenerator.getMap();

        for (Map.Entry<String, Integer> entry: items.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }
    }
}
