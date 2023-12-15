package com.winter.study4.util;

import java.util.ArrayList;
import java.util.StringTokenizer;

import com.winter.study4.lang.ex1.WeatherData;

public class StudyToken {

	public static void main(String[] args) {
		String str ="서울-10-비-80-부산-25-맑음-50-대구-82-눈-12-제주-25-태풍-75";
		str = "20-56-89-78-45";
		StringTokenizer st = new StringTokenizer(str, "-");
		int count = st.countTokens();
		System.out.println(count);
		
		ArrayList<WeatherData> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			WeatherData weatherData = new WeatherData();
			weatherData.setCity(st.nextToken());
			weatherData.setGion(st.nextToken());
			weatherData.setInfo(st.nextToken());
			weatherData.setHum(st.nextToken());
			ar.add(weatherData);
		}
		
		

	}

}
