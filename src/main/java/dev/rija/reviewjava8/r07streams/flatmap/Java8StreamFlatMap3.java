package dev.rija.reviewjava8.r07streams.flatmap;

import dev.rija.reviewjava8.common.entities.LineItem;
import dev.rija.reviewjava8.common.entities.Order;
import dev.rija.reviewjava8.common.utils.OrderGenerator;

import java.math.BigDecimal;
import java.util.List;

/**
 * The orders is a stream of purchase orders,
 * and each purchase order contains a collection of line items,
 * then we can use flatMap to produce a Stream or Stream<LineItem> containing all the line items in all the orders.
 * Furthermore, we also add a reduce operation to sum the line items’ total amount.
 */
public class Java8StreamFlatMap3 {
	public static void main(String[] args) {
		List<Order> orders = OrderGenerator.generateOrders();
		
		// sum the line items' total amount
		BigDecimal sumOfLineItems = orders.stream()
				.flatMap(order -> order.getLineItems().stream())
				.map(LineItem::getTotal)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		System.out.println(sumOfLineItems); // 3194.20
		
		// sum the order's total amount
		BigDecimal sumOfOrder = orders.stream()
				.map(Order::getTotal)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		System.out.println(sumOfOrder); // 3194.20
	}
}
