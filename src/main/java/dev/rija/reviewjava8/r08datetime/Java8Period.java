package dev.rija.reviewjava8.r08datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * A java.time.Period example to find out differently (years, months, days) between two LocalDates
 */
public class Java8Period {
	public static void main(String[] args) {
		Period tenDays = Period.ofDays(10);
		System.out.println(tenDays.getDays()); // 10
		
		Period oneYearTwoMonthsThreeDays = Period.of(1, 2, 3);
		System.out.println(oneYearTwoMonthsThreeDays.getYears()); // 1
		System.out.println(oneYearTwoMonthsThreeDays.getMonths()); // 2
		System.out.println(oneYearTwoMonthsThreeDays.getDays()); // 3
		
		LocalDate oldDate = LocalDate.of(1985, Month.JANUARY, 19);
		LocalDate newDate = LocalDate.of(2011, Month.SEPTEMBER, 24);
		
		Period period = Period.between(oldDate, newDate);
		System.out.println(period.getYears() + " years"); // 26 years
		System.out.println(period.getMonths() + " months"); // 8 months
		System.out.println(period.getDays() + " days"); // 5 days
	}
}
