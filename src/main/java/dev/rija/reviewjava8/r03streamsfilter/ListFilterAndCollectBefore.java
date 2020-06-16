package dev.rija.reviewjava8.r03streamsfilter;

import dev.rija.reviewjava8.r03streamsfilter.utils.DataGenerator;

import java.util.ArrayList;
import java.util.List;

public class ListFilterAndCollectBefore {
    public static void main(String[] args) {
        List<String> datas = DataGenerator.getList();

        List<String> datasFiltered = getFilterOutput(datas, "mkyong");

        for (String data : datasFiltered) {
            System.out.println(data);
        }
    }

    private static List<String> getFilterOutput(List<String> datas, String filter) {
        List<String> datasFiltered = new ArrayList<>();
        for (String data : datas) {
            if (!filter.equalsIgnoreCase(data)) {
                datasFiltered.add(data);
            }
        }
        return datasFiltered;
    }

}
