package dev.rija.reviewjava8.r03streamsfilter;

import dev.rija.reviewjava8.common.utils.PersonGenerator;

import java.util.List;
import java.util.stream.Collectors;

public class ListFilterAndCollect {
    public static void main(String[] args) {
        List<String> datas = PersonGenerator.getList();

        List<String> datasFiltered = datas.stream()
                .filter(data -> !data.equalsIgnoreCase("mkyong"))
                .collect(Collectors.toList());

        datasFiltered.forEach(System.out::println);
    }
}
