package dev.rija.reviewjava8.listtomap.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hosting {
	private int Id;
	private String name;
	private long websites;
}
