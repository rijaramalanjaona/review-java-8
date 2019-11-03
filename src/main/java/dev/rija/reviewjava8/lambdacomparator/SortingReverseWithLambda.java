package dev.rija.reviewjava8.lambdacomparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingReverseWithLambda {
    public static void main(String[] args) {
        List<Developer> developers = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : developers) {
            System.out.println(developer);
        }

        // sort by salary
        Comparator<Developer> salaryComparator = Comparator.comparing(Developer::getSalary);
        developers.sort(salaryComparator.reversed());

        System.out.println("After Sort");
        developers.forEach(developer -> System.out.println(developer));
    }

    private static List<Developer> getDevelopers() {
        List<Developer> result = new ArrayList<>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;
    }
}
