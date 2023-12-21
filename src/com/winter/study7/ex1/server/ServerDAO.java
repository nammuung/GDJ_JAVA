package com.winter.study7.ex1.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.winter.study6.ex1.WeatherController;

public class ServerDAO {	
	// getWeathers
	
	public void getdata () throws Exception {
	
	File file = new File("c:\\study\\weather.txt");
	FileReader fr = new FileReader(file);
	BufferedReader br = new BufferedReader(fr);
	br.readLine();
	String [] arr = {br.readLine()};
	for(int i =0;i<arr.length;i++) {
	
	}
	
	}	
}
