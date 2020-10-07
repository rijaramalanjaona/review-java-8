package dev.rija.reviewjava8.r03streamsfilter;

import dev.rija.reviewjava8.common.entities.Person;
import dev.rija.reviewjava8.common.utils.PersonGenerator;

import java.util.List;

public class PersonFilterBefore {
    public static void main(String[] args) {
        List<Person> persons = PersonGenerator.getPersons();
        Person person = getPersonByName(persons, "mkyong");
        System.out.println(person);
    }

    private static Person getPersonByName(List<Person> persons, String name) {
        for (Person person : persons) {
            if (name.equalsIgnoreCase(person.getName())) {
                return person;
            }
        }
        return null;
    }
}
