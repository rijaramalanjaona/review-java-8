package dev.rija.reviewjava8.r07streams.collectorsgroupingby;

import dev.rija.reviewjava8.common.entities.Item;
import dev.rija.reviewjava8.common.utils.ItemsGenerator;

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
		List<Item> items = ItemsGenerator.getItems();
		
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
