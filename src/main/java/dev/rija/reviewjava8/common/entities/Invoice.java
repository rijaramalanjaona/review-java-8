package dev.rija.reviewjava8.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
	String id;
	BigDecimal unitPrice;
	Integer quantity;
	
	public Invoice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
}
