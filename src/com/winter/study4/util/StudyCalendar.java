package com.winter.study4.util;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudyCalendar {
	public static void main(String[] args) {
		
//		Calendar calendar = new GregorianCalendar();
		Calendar calendar = Calendar.getInstance();
		
		
		System.out.println(calendar);
		
		
		int year = calendar.get(Calendar.YEAR);
		int march = calendar.get(Calendar.MARCH);
		
		System.out.println(year);
		System.out.println(march);
		
		calendar.set(Calendar.YEAR, 1998);
		System.out.println(calendar.getTime());
	}
}
