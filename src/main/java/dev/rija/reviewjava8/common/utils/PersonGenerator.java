package dev.rija.reviewjava8.common.utils;

import dev.rija.reviewjava8.common.entities.Person;

import java.util.Arrays;
import java.util.List;

public class PersonGenerator {
    public static List<String> getList() {
        return Arrays.asList("spring", "node", "mkyong");
    }

    public static List<Person> getPersons() {
        return Arrays.asList(new Person("mkyong", 30),
                            new Person("jack", 20),
                            new Person("lawrence", 40)
        );
    }
}
