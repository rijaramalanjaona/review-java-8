package dev.rija.reviewjava8.r06methodreference;

import dev.rija.reviewjava8.common.entities.Developer;
import dev.rija.reviewjava8.common.utils.DeveloperGenerator;

import java.util.List;

/**
 * 2. Reference to an instance method of a particular object Object::instanceMethodName
 * lambda expression
 * (args) -> object.instanceMethodName(args)
 * =>
 * method reference
 * object::instanceMethodName
 *
 * This example sorts a list of Employee by salary.
 * We can reference to an instance method compareBySalary of a particular object ComparatorProvider
 */
public class Java8MethodReference2 {
	public static void main(String[] args) {
		List<Developer> developers = DeveloperGenerator.getDevelopers();
		
		ComparatorProvider comparatorProvider = new ComparatorProvider();
		
		// lambda
		developers.sort((developer1, developer2) -> comparatorProvider.compareBySalary(developer1, developer2));
		developers.forEach(System.out::println);
		/*
		Developer(name=mkyong, salary=70000, age=33)
		Developer(name=alvin, salary=80000, age=20)
		Developer(name=jason, salary=100000, age=10)
		Developer(name=iris, salary=170000, age=55)
		*/
		
		List<Developer> developers2 = DeveloperGenerator.getDevelopers();
		// method reference
		developers2.sort(comparatorProvider::compareBySalary);
		developers2.forEach(System.out::println);
	}
}

class ComparatorProvider {
	public int compareBySalary(Developer developer1, Developer developer2) {
		return developer1.getSalary().compareTo(developer2.getSalary());
	}
}
