package dev.rija.reviewjava8.r05functionalinterface.r09supplier;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;

/**
 * A simple factory method to return a Developer object
 */
public class Java8Supplier3 {
	public static void main(String[] args) {
		Developer developer1 = factory(Developer::new);
		System.out.println(developer1);
		// Developer(name=default, salary=1, start=2017-08-01)
		
		Developer developer2 = factory(() -> new Developer("mkyong"));
		System.out.println(developer2);
		// Developer(name=mkyong, salary=1, start=2017-08-01)
	}
	
	// public static <T extends Developer> Developer factory(Supplier<T> supplier) {
	public static Developer factory(Supplier<? extends Developer> supplier) {
		Developer developer = supplier.get();
		
		if (developer.getName() == null || "".equals(developer.getName())) {
			developer.setName("default");
		}
		
		developer.setSalary(BigDecimal.ONE);
		developer.setStart(LocalDate.of(2017, 8, 1));
		
		return developer;
	}
	
}

@Data
class Developer {
	String name;
	BigDecimal salary;
	LocalDate start;
	
	// for factory(Developer::new)
	public Developer() {
	
	}
	
	// for factory(() -> new Developer("mkyong"))
	public Developer(String name) {
		this.name = name;
	}
}
