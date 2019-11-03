package dev.rija.reviewjava8.lambdacomparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingWithLambda {
    public static void main(String[] args) {
        List<Developer> developers = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : developers) {
            System.out.println(developer);
        }

        //sort by age
        developers.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());
        // developers.sort(Comparator.comparingInt(Developer::getAge));

        // sort by name
        developers.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        // developers.sort(Comparator.comparing(Developer::getName));

        // sort by salary
        developers.sort((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
        // developers.sort(Comparator.comparing(Developer::getSalary));

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
