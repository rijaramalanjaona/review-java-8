package dev.rija.reviewjava8.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class LineItem {
	private Integer id;
	private String item;
	private Integer quantity;
	private BigDecimal price;
	private BigDecimal total;
}
