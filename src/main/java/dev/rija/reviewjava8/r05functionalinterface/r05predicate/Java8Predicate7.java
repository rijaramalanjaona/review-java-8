package dev.rija.reviewjava8.r05functionalinterface.r05predicate;

import dev.rija.reviewjava8.common.entities.Hosting;
import dev.rija.reviewjava8.common.utils.HostingGenerator;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Predicate in Object
 */
public class Java8Predicate7 {
	public static void main(String[] args) {
		List<Hosting> hostings = HostingGenerator.getHostings();
		
		List<Hosting> result = HostingRepository.filterHosting(hostings, x -> x.getName().startsWith("l"));
		System.out.println(result);
		// [Hosting(id=1, name=liquidweb.com, websites=80000), Hosting(id=2, name=linode.com, websites=90000)]
		
		List<Hosting> result2 = HostingRepository.filterHosting(hostings, isDeveloperFriendly());
		System.out.println(result2);
		// [Hosting(id=2, name=linode.com, websites=90000)]
	}
	
	public static Predicate<Hosting> isDeveloperFriendly() {
		return x -> x.getName().equals("linode.com");
	}
}

class HostingRepository {
	public static List<Hosting> filterHosting(List<Hosting> hostings, Predicate<Hosting> predicate) {
		return hostings.stream()
				.filter(predicate)
				.collect(Collectors.toList());
	}
}
