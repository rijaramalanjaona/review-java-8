package dev.rija.reviewjava8.r03streamsfilter.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private int age;
}
