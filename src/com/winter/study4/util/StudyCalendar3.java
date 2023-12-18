package com.winter.study4.util;

import java.util.Calendar;
import java.util.UUID;

public class StudyCalendar3 {
	public static void main(String[] args) {
		
		//방법 1 현재날짜에 +3일
		Calendar calendar = Calendar.getInstance();
		calendar.set(2023,11,31);
		System.out.println(calendar.getTime());
		
		
		System.out.println(calendar.getTime());
		int d = calendar.get(Calendar.DATE);
		d=d+3;
		calendar.set(Calendar.DATE, d);
		System.out.println(d);
		
		
		//방법2
		
		calendar.set(2023, 11, 31);
//		calendar.roll(Calendar.DATE, 3);
		calendar.add(Calendar.DATE, 3);
		System.out.println(calendar.getTime());
		
		
		
		//UUID
		String n = UUID.randomUUID().toString();
		System.out.println(n);
	}
}
