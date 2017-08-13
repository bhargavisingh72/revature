package OCAExamPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Datetimes {
public static void main(String[] args) {
 Integer arr[] = {1,2,3,4};
 arr[1] = null;
 for(Integer a :arr){
	 System.out.println(a);
 }
	LocalDate date = LocalDate.of(2020,Month.JANUARY,20);
	LocalTime time = LocalTime.of(11, 12, 34);
	LocalDateTime dateTime = LocalDateTime.of(date, time);
	System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
	System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
	System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));	
}
}