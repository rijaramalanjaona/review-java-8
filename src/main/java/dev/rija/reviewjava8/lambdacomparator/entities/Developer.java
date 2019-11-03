package dev.rija.reviewjava8.lambdacomparator.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Developer {
    private String name;
    private BigDecimal salary;
    private int age;
}
