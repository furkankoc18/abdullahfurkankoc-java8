package com.abdullahfurkan.javatimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test {
	public static void main(String[] args) {

		// Mevcut tarih
		LocalDate date = LocalDate.now();
		System.out.println("the current date is " + date);

		// Mevcut zaman
		LocalTime time = LocalTime.now();
		System.out.println("the current time is " + time);

		// �u anki tarihi ve zaman� verecek.
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time : " + current);

		// Belirli bir formatta yazd�rmak i�in
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formatedDateTime = current.format(format);

		System.out.println("in formatted manner " + formatedDateTime);

		// Ay, g�n ve saniyeleri yazd�r�r�r.
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		System.out.println("Month : " + month + " day : " + day + " seconds : " + seconds);

		// Belirli bir tarihi yazd�r�r.
		LocalDate date2 = LocalDate.of(1950, 1, 26);
		System.out.println("the republic day :" + date2);

		// mevcut saatle tarih yazd�r�l�yor.
		LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);

		System.out.println("specific date with " + "current time : " + specificDate);

	}
}
