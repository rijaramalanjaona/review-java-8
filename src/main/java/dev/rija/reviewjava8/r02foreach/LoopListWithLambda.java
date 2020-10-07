package dev.rija.reviewjava8.r02foreach;

import dev.rija.reviewjava8.common.utils.DataGenerator;

import java.util.List;

public class LoopListWithLambda {
    public static void main(String[] args) {
        List<String> items = DataGenerator.getList();

        System.out.println("----------- foreach basique ---------------");

        items.forEach(item -> System.out.println(item));

        System.out.println("----------- find C ---------------");
        items.forEach(item -> {
            if ("C".equals(item)) {
                System.out.println("Hello C");
            }
        });

        System.out.println("----------- method reference ---------------");
        items.forEach(System.out::println);

        System.out.println("----------- stream and filter B ---------------");
        items.stream()
                .filter(item -> "B".equals(item))
                .forEach(System.out::println);
    }
}
