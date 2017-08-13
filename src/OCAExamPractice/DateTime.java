package OCAExamPractice;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTime {
	  public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		System.out.println(date1);
		System.out.println(date2);
		
		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		 System.out.println(date); // 2014-01-20
		 date = date.plusDays(2);
		 System.out.println(date); // 2014-01-22
		 date = date.plusWeeks(1);
		System.out.println(date); // 2014-01-29
		 date = date.plusMonths(1);
		 System.out.println(date); // 2014-02-28
		 date = date.plusYears(5);
		 System.out.println(date); // 2019-02-28
		 
		 LocalDate date11 = LocalDate.of(2020, Month.JANUARY, 20);
		  LocalTime time = LocalTime.of(5, 15);
		  LocalDateTime dateTime = LocalDateTime.of(date11, time);
		  System.out.println(dateTime); // 2020-01-20T05:15
		 dateTime = dateTime.minusDays(1);
		  System.out.println(dateTime); // 2020-01-19T05:15
		  dateTime = dateTime.minusHours(10);
		  System.out.println(dateTime); // 2020-01-18T19:15
		  dateTime = dateTime.minusSeconds(30);
		  System.out.println(dateTime); // 2020-01-18T19:14:30
		  
		  LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		  LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		  performAnimalEnrichment(start, end);
	}
	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) { // check if still before end
		System.out.println("give new toy: " + upTo);
		upTo = upTo.plusMonths(1); // add a month
		}
		                                //(or)
		LocalDate start1 = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end1 = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1); // create a period
		performAnimalEnrichment1(start1, end1, period);
		}
		private static void performAnimalEnrichment1(LocalDate start, LocalDate end, Period period) { // uses the generic period
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
		System.out.println(" new toy: " + upTo);
		upTo = upTo.plus(period); // adds the period
		}
		
		Period annually = Period.ofYears(1); // every 1 year
		Period quarterly = Period.ofMonths(3); // every 3 months
		Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
		Period everyOtherDay = Period.ofDays(2); // every 2 days
		Period everyYearAndAWeek = Period.of(1, 0, 7);
		System.out.println(annually);
		System.out.println(quarterly);
		System.out.println(everyThreeWeeks);
		System.out.println(everyOtherDay);
		System.out.println(everyYearAndAWeek);
		
		LocalDate date = LocalDate.now();
		System.out.println(date.getDayOfWeek()); // WEDNESDAY
		System.out.println(date.getMonth()); // JULY
		System.out.println(date.getYear()); // 2017
		System.out.println(date.getDayOfYear()); // 207
		
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
LocalTime time = LocalTime.of(11, 12, 34);
LocalDateTime dateTime = LocalDateTime.of(date1, time);System.out.println(date1
.format(DateTimeFormatter.ISO_LOCAL_DATE));
System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		  DateTimeFormatter shortDateTime =
				  DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
				  System.out.println(shortDateTime.format(dateTime)); // 1/20/20
				  System.out.println(shortDateTime.format(date1)); // 1/20/20
				  System.out.println(
				  shortDateTime.format(time)); // UnsupportedTemporalTypeException


	}
}
