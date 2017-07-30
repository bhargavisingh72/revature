package com.practice;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Datetimeformator {
public static void main(String[] args) {
   LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
	Period p = Period.of(1, 2, 3);
	d = d.minus(p);
	DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
	System.out.println(d.format(f));
	
	LocalDateTime d1 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
	Period p1 = Period.ofDays(1).ofYears(2);
	d1 = d1.minus(p1);
	DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
	.SHORT);
	System.out.println(f1.format(d1));
}
}
