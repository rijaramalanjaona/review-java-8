package dev.rija.reviewjava8.r08datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * A java.time.Duration example to find out difference seconds between two LocalDateTime
 */
public class Java8Duration {
	public static void main(String[] args) {
		Duration oneHours = Duration.ofHours(1);
		System.out.println(oneHours.getSeconds() + " s"); // 3600 s
		
		Duration oneHours2 = Duration.of(1, ChronoUnit.HOURS);
		System.out.println(oneHours2.getSeconds() + " s"); // 3600 s
		
		LocalDateTime oldDate = LocalDateTime.of(2016, Month.AUGUST, 31, 10, 20, 55);
		LocalDateTime newDate = LocalDateTime.of(2016, Month.NOVEMBER, 9, 10, 21, 56);
		
		System.out.println(oldDate); // 2016-08-31T10:20:55
		System.out.println(newDate); // 2016-11-09T10:21:56
		
		Duration duration = Duration.between(oldDate, newDate);
		System.out.println(duration.getSeconds() + " s"); // 6048061 s
	}
}
