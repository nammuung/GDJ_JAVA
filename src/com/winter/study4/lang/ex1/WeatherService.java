package com.winter.study4.lang.ex1;

public class WeatherService {
	
	private String datas;
	
	public WeatherService() {
		//parsing
		this.datas="서울-10-비-80-부산-25-맑음-50,대구-82-눈-12,제주.25,태풍.75";
	}
	
	//init
	public WeatherData [] init() {
		//1. 
		this.datas = this.datas.replace(",", "-");
		this.datas = this.datas.replace('.', '-');
		
		String [] ar = this.datas.split("-");
		
		WeatherData [] weatherDatas = new WeatherData[ar.length/4];
		
		int idx=0;
		for(int i=0;i<ar.length;i++) {
			WeatherData weatherData = new WeatherData();
			weatherData.setCity(ar[i]);
			weatherData.setGion(ar[++i]);
			weatherData.setInfo(ar[++i]);
			weatherData.setHum(ar[++i]);
			weatherDatas[idx]=weatherData;
			idx++;
		}
		
		
		return weatherDatas;
	}

}
