package dev.rija.reviewjava8.r07streams.reduce;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * A simple map and reduce example to sum BigDecimal from a list of invoices
 */
public class Java8StreamReduce2 {
	public static void main(String[] args) {
		List<Invoice> invoices = Arrays.asList(
				new Invoice("A01", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
				new Invoice("A02", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
				new Invoice("A03", BigDecimal.valueOf(4.99), BigDecimal.valueOf(2))
		);
		
		BigDecimal sum = invoices.stream()
				.map(invoice -> invoice.getQuantity().multiply(invoice.getPrice()))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		System.out.println(sum); // 49.955
		
		System.out.println(sum.setScale(2, BigDecimal.ROUND_HALF_UP)); // 49.96
	}
}

@Getter
@AllArgsConstructor
class Invoice {
	private String invoiceNo;
	private BigDecimal price;
	private BigDecimal quantity;
}
