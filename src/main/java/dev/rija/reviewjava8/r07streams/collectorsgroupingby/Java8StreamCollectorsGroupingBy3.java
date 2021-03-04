package dev.rija.reviewjava8.r07streams.collectorsgroupingby;

import dev.rija.reviewjava8.common.entities.Item;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Group by a list of Pojo
 * Eg1 : group by the name + count
 * Eg2 : group by the name + sum of quantity
 */
public class Java8StreamCollectorsGroupingBy3 {
	public static void main(String[] args) {
		List<Item> items = Arrays.asList(
				new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")),
				new Item("orange", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")),
				new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99"))
		);
		
		Map<String, Long> nameCounting = items.stream()
				.collect(
						Collectors.groupingBy(
								Item::getName,
								Collectors.counting()
						)
				);
		
		System.out.println(nameCounting); // {papaya=1, orange=1, banana=2, apple=3, watermelon=1}
		
		Map<String, Integer> nameSumQuantity = items.stream()
				.collect(
						Collectors.groupingBy(
								Item::getName,
								Collectors.summingInt(Item::getQuantity)
						)
				);
		
		System.out.println(nameSumQuantity); // {papaya=20, orange=10, banana=30, apple=40, watermelon=10}
	}
}
