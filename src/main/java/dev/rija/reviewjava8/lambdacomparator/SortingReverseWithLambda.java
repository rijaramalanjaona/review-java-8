package dev.rija.reviewjava8.lambdacomparator;

import dev.rija.reviewjava8.lambdacomparator.entities.Developer;
import dev.rija.reviewjava8.lambdacomparator.utils.DeveloperHelper;

import java.util.Comparator;
import java.util.List;

public class SortingReverseWithLambda {
    public static void main(String[] args) {
        List<Developer> developers = DeveloperHelper.getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : developers) {
            System.out.println(developer);
        }

        // sort by salary
        Comparator<Developer> salaryComparator = Comparator.comparing(Developer::getSalary);
        developers.sort(salaryComparator.reversed());

        System.out.println("After Sort");
        // using method references
        developers.forEach(System.out::println);
    }
}
