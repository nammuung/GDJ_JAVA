package com.winter.study6.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class StudyDAO {

	public void set2() {
		//파일 경로 지정
		File file =new File("C:\\study\\student.txt");
		FileReader re = new FileReader(file);
		BufferedReader bf = new BufferedReader(re);
		
		while(true) {
			bf.readLine();
//			if(bf==null) {
//				break;
//			}
		}
		
		
		
		
	}
	
	
}
