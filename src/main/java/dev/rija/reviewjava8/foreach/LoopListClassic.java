package dev.rija.reviewjava8.foreach;

import dev.rija.reviewjava8.foreach.utils.DataGenerator;

import java.util.List;

public class LoopListClassic {
    public static void main(String[] args) {
        List<String> items = DataGenerator.getList();

        for (String item : items) {
            System.out.println(item);
        }
    }
}
