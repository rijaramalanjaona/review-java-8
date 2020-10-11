package dev.rija.reviewjava8.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Domain {
	private String name;
	private Integer score;
}
