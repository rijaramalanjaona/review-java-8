package dev.rija.reviewjava8.r03streamsfilter;

import dev.rija.reviewjava8.common.entities.Person;
import dev.rija.reviewjava8.common.utils.PersonGenerator;

import java.util.List;

public class PersonFilter {
    public static void main(String[] args) {
        List<Person> persons = PersonGenerator.getPersons();
        Person person1 = persons.stream()
                .filter(person -> "mkyong".equalsIgnoreCase(person.getName()))
                .findAny()
                .orElse(null);

        System.out.println(person1);

        System.out.println("---------------");

        Person person2 = persons.stream()
                .filter(person -> "tsbobinos".equalsIgnoreCase(person.getName()))
                .findAny()
                .orElse(null);

        System.out.println(person2);

        System.out.println("---------------");

        Person person3 = persons.stream()
                .filter(person -> "jack".equalsIgnoreCase(person.getName()) && person.getAge() == 20)
                .findAny()
                .orElse(null);

        System.out.println(person3);

        System.out.println("---------------");

        Person person4 = persons.stream()
                .filter(person -> {
                    if ("jack".equalsIgnoreCase(person.getName()) && person.getAge() == 20) {
                        return true;
                    }
                    return false;
                })
                .findAny()
                .orElse(null);

        System.out.println(person4);
    }
}
