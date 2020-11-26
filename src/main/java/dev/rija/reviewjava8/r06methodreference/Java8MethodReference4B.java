package dev.rija.reviewjava8.r06methodreference;

import dev.rija.reviewjava8.common.entities.Invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * 4. Reference to a constructor ClassName::new
 *
 * lambda expression
 * (args) -> new ClassName(args)
 * =>
 * method reference
 * ClassName::new
 *
 * Reference to a constructor which accepts an argument – Invoice(BigDecimal unitPrice)
 */
public class Java8MethodReference4B {
	public static void main(String[] args) {
		List<BigDecimal> amounts = Arrays.asList(
				BigDecimal.valueOf(9.99),
				BigDecimal.valueOf(2.99),
				BigDecimal.valueOf(8.99)
		);
		
		// lambda
		List<Invoice> invoices1 = fakeInvoice(amounts, amount -> new Invoice(amount));
		invoices1.forEach(System.out::println);
		/*
		Invoice(id=null, unitPrice=9.99, quantity=null)
		Invoice(id=null, unitPrice=2.99, quantity=null)
		Invoice(id=null, unitPrice=8.99, quantity=null)
		 */
		
		// method reference
		List<Invoice> invoices2 = fakeInvoice(amounts, Invoice::new);
		invoices2.forEach(System.out::println);
	}
	
	static List<Invoice> fakeInvoice(List<BigDecimal> amounts, Function<BigDecimal, Invoice> func) {
		List<Invoice> result = new ArrayList<>();
		amounts.forEach(amount -> result.add(func.apply(amount)));
		return result;
	}
}
