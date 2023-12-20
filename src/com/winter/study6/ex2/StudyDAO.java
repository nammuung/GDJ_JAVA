package com.winter.study6.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudyDAO {

	public ArrayList<StudyDTO> set2() throws Exception{
		//파일 경로 지정
		ArrayList<StudyDTO> ar = new ArrayList<>();
		File file =new File("C:\\study\\student.txt");
		FileReader re = new FileReader(file);
		BufferedReader bf = new BufferedReader(re);
		bf.readLine();
		while(true) {
			String a = bf.readLine();
			if(a==null) {
				break;
			}
			System.out.println(a);
			
			
			StringTokenizer st = new StringTokenizer(a,"-");
//			System.out.println(st.nextToken());
			
			StudyDTO studyDTO = new StudyDTO();
			
			studyDTO.setName(st.nextToken());
			studyDTO.setNo(Integer.parseInt(st.nextToken()));
			studyDTO.setKor(Integer.parseInt(st.nextToken()));
			studyDTO.setEng(Integer.parseInt(st.nextToken()));
			studyDTO.setMath(Integer.parseInt(st.nextToken()));
			studyDTO.setHap(Integer.parseInt(st.nextToken()));
			studyDTO.setTotal(Double.parseDouble(st.nextToken()));
			
			
			
			ar.add(studyDTO);
		} 
		
		return ar;
		
		
	}
	
	
}
