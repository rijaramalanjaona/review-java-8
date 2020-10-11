package dev.rija.reviewjava8.r05functionalinterface.r06bipredicate;

import dev.rija.reviewjava8.common.entities.Domain;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

/**
 * BiPredicate as function argument.
 * This example uses BiPredicate to filter bad domains by the domain name or threat score.
 */
public class Java8BiPredicate2 {
	public static void main(String[] args) {
		List<Domain> domains = Arrays.asList(new Domain("google.com", 1),
				new Domain("i-am-spmmar.com", 10),
				new Domain("mykyong.com", 0),
				new Domain("microsoft.com", 2));
		
		// if google or score == 0
		BiPredicate<String, Integer> biPredicate1 = (domain, score) -> domain.equals("google.com") || score == 0;
		List<Domain> result1 = filterBadDomain(domains, biPredicate1);
		System.out.println(result1);
		// [Domain(name=google.com, score=1), Domain(name=mykyong.com, score=0)]
		
		// score == 0
		List<Domain> result2 = filterBadDomain(domains, (domain, score) -> score == 0);
		System.out.println(result2);
		// [Domain(name=mykyong.com, score=0)]
		
		// if start with i or score > 5
		List<Domain> result3 = filterBadDomain(domains, (domain, score) -> domain.startsWith("i") || score > 5);
		System.out.println(result3);
		// [Domain(name=i-am-spmmar.com, score=10)]
		
		// chaining with or
		List<Domain> result4 = filterBadDomain(domains, biPredicate1.or((domain, score) -> domain.equals("microsoft.com")));
		System.out.println(result4);
		// [Domain(name=google.com, score=1), Domain(name=mykyong.com, score=0), Domain(name=microsoft.com, score=2)]
	}
	
	public static <T extends Domain> List<T> filterBadDomain(List<T> list,
															 BiPredicate<String, Integer> biPredicate) {
		return list.stream()
				.filter(x -> biPredicate.test(x.getName(), x.getScore()))
				.collect(Collectors.toList());
	}
}
