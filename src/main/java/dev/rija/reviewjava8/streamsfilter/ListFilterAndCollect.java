package dev.rija.reviewjava8.streamsfilter;

import dev.rija.reviewjava8.streamsfilter.utils.DataGenerator;

import java.util.List;
import java.util.stream.Collectors;

public class ListFilterAndCollect {
    public static void main(String[] args) {
        List<String> datas = DataGenerator.getList();

        List<String> datasFiltered = datas.stream()
                .filter(data -> !data.equalsIgnoreCase("mkyong"))
                .collect(Collectors.toList());

        datasFiltered.forEach(System.out::println);
    }
}
