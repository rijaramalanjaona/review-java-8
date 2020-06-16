package dev.rija.reviewjava8.listtomap;

import dev.rija.reviewjava8.listtomap.entities.Hosting;
import dev.rija.reviewjava8.listtomap.utils.DataGenerator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapDuplicateKey {
	public static void main(String[] args) {
		List<Hosting> list = DataGenerator.getHostingsWithDuplicate();
		
		/*// Map key = name, value = websites
		Map<String, Long> result2 = list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites));
		System.out.println("result2 = " + result2);
		=> java.lang.IllegalStateException: Duplicate key 90000*/
		
		// To solve the duplicated key issue above, pass in the third mergeFunction argument
		// (oldValue, newValue) -> oldValue ==> If the key is duplicated, do you prefer oldKey or newKey?
		Map<String, Long> result2 = list.stream()
				.collect(
						Collectors.toMap(
								Hosting::getName, Hosting::getWebsites,
								(oldValue, newValue) -> oldValue
						)
				);
		System.out.println("result2 = " + result2);
	}
}
