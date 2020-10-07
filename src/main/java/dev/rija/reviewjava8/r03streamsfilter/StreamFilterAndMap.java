package dev.rija.reviewjava8.r03streamsfilter;

import dev.rija.reviewjava8.common.entities.Person;
import dev.rija.reviewjava8.common.utils.PersonGenerator;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterAndMap {
    public static void main(String[] args) {
        List<Person> persons = PersonGenerator.getPersons();

        System.out.println("Convert stream to String");
        String name = persons.stream()
                .filter(person -> "jack".equalsIgnoreCase(person.getName()))
                .map(Person::getName)
                .findAny()
                .orElse(null);

        System.out.println("name = " + name);

        System.out.println("Convert stream to List<String>");

        List<String> names = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
