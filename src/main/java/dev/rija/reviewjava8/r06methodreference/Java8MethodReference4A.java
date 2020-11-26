package dev.rija.reviewjava8.r06methodreference;

import dev.rija.reviewjava8.common.entities.Invoice;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * 4. Reference to a constructor ClassName::new
 *
 * lambda expression
 * (args) -> new ClassName(args)
 * =>
 * method reference
 * ClassName::new
 *
 * Reference to a default constructor
 */
public class Java8MethodReference4A {
	public static void main(String[] args) {
		// lambda
		Supplier<Map> supplier1 = () -> new HashMap<>();
		Map map1 = supplier1.get();
		
		// method reference
		Supplier<Map> supplier2 = HashMap::new;
		Map map2 = supplier2.get();
		
		// lambda
		Supplier<Invoice> supplier3 = () -> new Invoice();
		Invoice invoice1 = supplier3.get();
		
		// method reference
		Supplier<Invoice> supplier4 = Invoice::new;
		Invoice invoice2 = supplier4.get();
	}
}
