package dev.rija.reviewjava8.r02foreach;

import dev.rija.reviewjava8.common.utils.DataGenerator;

import java.util.List;

public class LoopListClassic {
    public static void main(String[] args) {
        List<String> items = DataGenerator.getList();

        for (String item : items) {
            System.out.println(item);
        }
    }
}
