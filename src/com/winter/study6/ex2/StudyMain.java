package com.winter.study6.ex2;

import java.util.ArrayList;

public class StudyMain {
public static void main(String[] args) {
	
	StudyDAO studyDAO = new StudyDAO();
	try {
		ArrayList<StudyDTO> ar = studyDAO.set2();
		for(StudyDTO studyDTO:ar) {
			System.out.println("==============================");
			System.out.println(studyDTO.getName());
			System.out.println(studyDTO.getNo());
			System.out.println(studyDTO.getKor());
			System.out.println(studyDTO.getEng());
			System.out.println(studyDTO.getMath());
			System.out.println(studyDTO.getHap());
			System.out.println(studyDTO.getTotal());
			System.out.println("==============================");
		}
		
//		studyDAO.set2();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
}
