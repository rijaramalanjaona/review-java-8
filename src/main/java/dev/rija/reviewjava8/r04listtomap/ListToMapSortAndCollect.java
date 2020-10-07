package dev.rija.reviewjava8.r04listtomap;

import dev.rija.reviewjava8.common.entities.Hosting;
import dev.rija.reviewjava8.common.utils.HostingGenerator;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapSortAndCollect {
	public static void main(String[] args) {
		List<Hosting> list = HostingGenerator.getHostingsWithDuplicate();
		
		Map<String, Long> result2 = list.stream()
				.collect(
						Collectors.toMap(
								Hosting::getName, Hosting::getWebsites, // key = name, value = websites
								(oldValue, newValue) -> oldValue, // if same key, take the old key
								LinkedHashMap::new // returns a LinkedHashMap, keep order
						)
				);
		System.out.println("result2 = " + result2);
		
		// without sort (LinkedHashMap::new)
		// result2 = {liquidweb.com=80000, mkyong.com=1, digitalocean.com=120000, aws.amazon.com=200000, linode.com=90000}
		
		// with sort (LinkedHashMap::new)
		// {liquidweb.com=80000, linode.com=90000, digitalocean.com=120000, aws.amazon.com=200000, mkyong.com=1}
	}
}
