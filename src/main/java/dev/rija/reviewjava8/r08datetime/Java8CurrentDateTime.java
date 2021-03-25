package dev.rija.reviewjava8.r08datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Java8CurrentDateTime {
	public static void main(String[] args) {
		DateTimeFormatter dtfYearMonthDay = DateTimeFormatter.ofPattern("uuuu/MM/dd");
		LocalDate localDateNow = LocalDate.now();
		System.out.println(dtfYearMonthDay.format(localDateNow)); // 2021/03/25
		
		DateTimeFormatter dtfHourMinuteSecond = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime localTime = LocalTime.now();
		System.out.println(dtfHourMinuteSecond.format(localTime)); // 22:06:41
		
		DateTimeFormatter dtfDateTime = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
		LocalDateTime localDateTimeNow = LocalDateTime.now();
		System.out.println(dtfDateTime.format(localDateTimeNow)); // 2021/03/25 22:07:14
		
		// get current date-time, with system default time zone
		ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
		System.out.println(dtfDateTime.format(zonedDateTimeNow)); // 2021/03/25 22:09:28
		System.out.println(zonedDateTimeNow.getOffset()); // +01:00
		
		// get current date-time, with a specified time zone
		ZonedDateTime japanDateTime = zonedDateTimeNow.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
		System.out.println(dtfDateTime.format(japanDateTime)); // 2021/03/26 06:09:28
		System.out.println(japanDateTime.getOffset()); // +09:00
	}
}
