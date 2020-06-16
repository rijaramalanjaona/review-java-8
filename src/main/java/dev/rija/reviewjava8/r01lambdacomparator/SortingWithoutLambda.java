package dev.rija.reviewjava8.r01lambdacomparator;

import dev.rija.reviewjava8.r01lambdacomparator.entities.Developer;
import dev.rija.reviewjava8.r01lambdacomparator.utils.DeveloperHelper;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithoutLambda {
    public static void main(String[] args) {
        List<Developer> developers = DeveloperHelper.getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : developers) {
            System.out.println(developer);
        }

        //sort by age
        Collections.sort(developers, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("After Sort");
        for (Developer developer : developers) {
            System.out.println(developer);
        }
    }
}
