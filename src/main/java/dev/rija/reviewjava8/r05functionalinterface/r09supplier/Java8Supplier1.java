package dev.rija.reviewjava8.r05functionalinterface.r09supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

/**
 * Supplier is a functional interface; it takes no arguments and returns a result.
 *
 * @FunctionalInterface
 * public interface Supplier<T> {
 *     T get();
 * }
 */
public class Java8Supplier1 {
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public static void main(String[] args) {
		Supplier<LocalDateTime> supplier1 = () -> LocalDateTime.now();
		LocalDateTime time = supplier1.get();
		System.out.println(time); // 2020-10-11T17:18:31.814
		
		Supplier<String> supplier2 = () -> DATE_TIME_FORMATTER.format(LocalDateTime.now());
		String time2 = supplier2.get();
		System.out.println(time2); // 2020-10-11 17:18:31
	}
}
