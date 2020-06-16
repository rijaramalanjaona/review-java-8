package dev.rija.reviewjava8.r01lambdacomparator;

import dev.rija.reviewjava8.r01lambdacomparator.entities.Developer;
import dev.rija.reviewjava8.r01lambdacomparator.utils.DeveloperHelper;

import java.util.List;

public class SortingWithLambda {
    public static void main(String[] args) {
        List<Developer> developers = DeveloperHelper.getDevelopers();

        System.out.println("Before Sort");
        developers.forEach(System.out::println);

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
        developers.forEach(System.out::println);
    }
}
