package dev.rija.reviewjava8.listtomap.utils;

import dev.rija.reviewjava8.listtomap.entities.Hosting;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
	public static List<Hosting> getHostings() {
		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1, "liquidweb.com", 80000));
		list.add(new Hosting(2, "linode.com", 90000));
		list.add(new Hosting(3, "digitalocean.com", 120000));
		list.add(new Hosting(4, "aws.amazon.com", 200000));
		list.add(new Hosting(5, "mkyong.com", 1));
		return list;
	}
	
	public static List<Hosting> getHostingsWithDuplicate() {
		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1, "liquidweb.com", 80000));
		list.add(new Hosting(2, "linode.com", 90000));
		list.add(new Hosting(3, "digitalocean.com", 120000));
		list.add(new Hosting(4, "aws.amazon.com", 200000));
		list.add(new Hosting(5, "mkyong.com", 1));
		list.add(new Hosting(6, "linode.com", 100000)); // duplicated name
		return list;
	}
}
