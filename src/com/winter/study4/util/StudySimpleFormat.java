package com.winter.study4.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StudySimpleFormat {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		// 2023년12월30일
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd d일 E요일");
		String str = sd.format(calendar.getTime());
		System.out.println(str);

		
		
		//문자열로 되어있는 날짜를 date 로 변경하고싶을떄
		String d = "2020-12-24";
		sd.applyPattern("YYYY-MM-dd");  // 패턴 변경 or 새로운 패턴
	
		
		
		Date date = sd.parse(d);
		System.out.println());
	}
}
