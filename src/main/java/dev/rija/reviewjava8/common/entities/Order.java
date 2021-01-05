package dev.rija.reviewjava8.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {
	private Integer id;
	private String invoice;
	private List<LineItem> lineItems;
	private BigDecimal total;
}
