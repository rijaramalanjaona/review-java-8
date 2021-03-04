package dev.rija.reviewjava8.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Item {
	private String name;
	private Integer quantity;
	private BigDecimal price;
}
