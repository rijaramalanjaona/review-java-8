package dev.rija.reviewjava8.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hosting {
	private int id;
	private String name;
	private long websites;
}
