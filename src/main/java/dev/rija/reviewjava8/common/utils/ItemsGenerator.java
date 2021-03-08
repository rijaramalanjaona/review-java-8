package dev.rija.reviewjava8.common.utils;

import dev.rija.reviewjava8.common.entities.Item;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ItemsGenerator {
	public static List<Item> getItems() {
		return Arrays.asList(
				new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")),
				new Item("orange", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")),
				new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99"))
		);
	}
}
