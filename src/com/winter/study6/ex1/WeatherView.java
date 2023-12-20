package com.winter.study6.ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class WeatherView {

	
	public void view(WeatherDTO weatherDTO) {
		if(weatherDTO==null) {
			System.out.println("못 찾았다.");
			return;
		}
		
		
		System.out.println("도시 명\t기온\t날씨\t습도");
		System.out.print(weatherDTO.getCity()+"\t");
		System.out.print(weatherDTO.getGion()+"\t");
		System.out.print(weatherDTO.getInfo()+"\t");
		System.out.print(weatherDTO.getHum()+"%\n");
		System.out.println("=====================================");
	}
	
	
	
	
	// list 계열은 만들건데 특정한걸 지칭하지않고 부모를 받음
	
	public void view(List<WeatherDTO> ar ){
		System.out.println("도시 명\t기온\t날씨\t습도");
		for(WeatherDTO weatherDTO:ar) {
			System.out.print(weatherDTO.getCity()+"\t");
			System.out.print(weatherDTO.getGion()+"\t");
			System.out.print(weatherDTO.getInfo()+"\t");
			System.out.print(weatherDTO.getHum()+"%\n");
			System.out.println("=====================================");
		}
		
	}
	
	
}
