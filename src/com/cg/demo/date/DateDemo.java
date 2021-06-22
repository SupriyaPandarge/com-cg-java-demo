package com.cg.demo.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateDemo {

	public static void main(String[] args) {
	LocalDate date = LocalDate.now();
	System.out.println(date.toString());

	LocalDate iDate = LocalDate.of(1947, 2, 25);
	System.out.println(iDate.toString());
	
//	LocalDate myDate = LocalDate.parse("1947-08-15");
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate myDate = LocalDate.parse("15-08-1947", formatter);
	System.out.println(myDate.toString());
	System.out.println(myDate.format(formatter));
	System.out.println(LocalDate.EPOCH);
	System.out.println(LocalDate.MIN);
	System.out.println(LocalDate.MAX);

	LocalTime lt = LocalTime.now();
	System.out.println(lt);

	LocalDate manDate = LocalDate.now();
	LocalDate expDate = manDate.plusDays(180);
	LocalDate expDate2 = manDate.plusMonths(6);
	System.out.println("Manufacturing date: " + manDate.toString());
	System.out.println("Expiry date 1: " + expDate.toString());
	System.out.println("Expiry date 2: " + expDate2.toString());

	LocalDate expDate3 = manDate.minusDays(180);
	System.out.println("Expiry date 3: " + expDate3.toString());

	LocalDate date1 = LocalDate.now();
	LocalDate date2 = LocalDate.of(2021, 12, 31);
	System.out.println(date1.datesUntil(date2).toString());
	System.out.println(date2.compareTo(date1));
	
	
	
	}
}
