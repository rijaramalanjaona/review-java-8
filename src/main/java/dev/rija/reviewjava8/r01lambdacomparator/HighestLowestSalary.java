package dev.rija.reviewjava8.r01lambdacomparator;

import dev.rija.reviewjava8.r01lambdacomparator.entities.Developer;
import dev.rija.reviewjava8.r01lambdacomparator.utils.DeveloperHelper;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HighestLowestSalary {
	public static void main(String[] args) {
		List<Developer> developers = DeveloperHelper.getDevelopers();
		System.out.println(developers);
		
		Developer devHighestSalary = Collections.max(developers, Comparator.comparing(Developer::getSalary));
		System.out.println(devHighestSalary);
		
		Developer devLowestSalary = Collections.min(developers, Comparator.comparing(Developer::getSalary));
		System.out.println(devLowestSalary);
		
		Developer oldestDev = Collections.max(developers, Comparator.comparing(Developer::getAge));
		System.out.println(oldestDev);
	}
}
