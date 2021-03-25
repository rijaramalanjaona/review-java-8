package dev.rija.reviewjava8.r08datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * ChronoUnit.{unit}.between to find out the difference between dates
 */
public class Java8ChronoUnit {
	public static void main(String[] args) {
		LocalDate oldDate = LocalDate.of(1985, Month.JANUARY, 19);
		LocalDate newDate = LocalDate.of(2011, Month.SEPTEMBER, 24);
		
		long years = ChronoUnit.YEARS.between(oldDate, newDate);
		long months = ChronoUnit.MONTHS.between(oldDate, newDate);
		long weeks = ChronoUnit.WEEKS.between(oldDate, newDate);
		long days = ChronoUnit.DAYS.between(oldDate, newDate);
		
		System.out.println(years + " years"); // 26 years
		System.out.println(months + " months"); // 320 months
		System.out.println(weeks + " weeks"); // 1392 weeks
		System.out.println(days + " days"); // 9744 days
	}
}
