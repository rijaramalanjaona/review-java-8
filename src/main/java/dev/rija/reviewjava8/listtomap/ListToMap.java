package dev.rija.reviewjava8.listtomap;

import dev.rija.reviewjava8.listtomap.entities.Hosting;
import dev.rija.reviewjava8.listtomap.utils.DataGenerator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {
		List<Hosting> list = DataGenerator.getHostings();
		
		// Map key = id, value = name
		Map<Integer, String> result1 = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));
		System.out.println("result1 = " + result1);
		
		// Map key = name, value = websites
		Map<String, Long> result2 = list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites));
		System.out.println("result2 = " + result2);
		
		// Map key = id, value = name with different syntax
		Map<Integer, String> result3 = list.stream().collect(Collectors.toMap(x -> x.getId(), x -> x.getName()));
		System.out.println("result3 = " + result3);
	}
}
