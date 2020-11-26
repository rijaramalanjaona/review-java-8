package dev.rija.reviewjava8.r06methodreference;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.function.BiFunction;

/**
 * 3. Reference to an instance method of an arbitrary object of a particular type ContainingType::methodName
 *
 *  * lambda expression
 *  * (arg0, rest_of_args) -> arg0.methodName(rest_of_args)
 *  * =>
 *  * method reference
 *  * arg0_Type::methodName
 *
 * This example uses a custom object
 */
public class Java8MethodReference3B {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("001", BigDecimal.valueOf(1.99), 3);
		InvoiceCalculator invoiceCalculator = new InvoiceCalculator();
		
		// lambda
		BigDecimal result1 = calculate(invoiceCalculator, invoice,
										(a, b) -> a.normal(b));
		System.out.println(result1); // 5.97
		
		// method reference
		BigDecimal result2 = calculate(invoiceCalculator, invoice,
										InvoiceCalculator::normal);
		System.out.println(result2); // 5.97
		
		// lambda
		BigDecimal result3 = calculate(invoiceCalculator, invoice,
										(a, b) -> a.promotion(b));
		System.out.println(result3); // 5.37
		
		// method reference
		BigDecimal result4 = calculate(invoiceCalculator, invoice,
										InvoiceCalculator::promotion);
		System.out.println(result4); // 5.37
	}
	
	static BigDecimal calculate(InvoiceCalculator invoiceCalculator, Invoice invoice,
								BiFunction<InvoiceCalculator, Invoice, BigDecimal> func) {
		return func.apply(invoiceCalculator, invoice);
	}
}

class InvoiceCalculator {
	public BigDecimal normal(Invoice invoice) {
		return invoice.getUnitPrice().multiply(BigDecimal.valueOf(invoice.getQuantity()));
	}
	
	public BigDecimal promotion(Invoice invoice) {
		return invoice.getUnitPrice()
				.multiply(BigDecimal.valueOf(invoice.getQuantity()))
				.multiply(BigDecimal.valueOf(0.9))
				.setScale(2, BigDecimal.ROUND_HALF_UP);
	}
}

@Data
@AllArgsConstructor
class Invoice {
	String id;
	BigDecimal unitPrice;
	Integer quantity;
}
