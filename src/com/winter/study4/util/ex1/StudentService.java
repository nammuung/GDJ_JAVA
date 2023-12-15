package com.winter.study4.util.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentService {
	
	private String info;
	
	public StudentService() {
		this.info="winter-1-50-60-80";
		this.info=this.info+"-iu-2-85-94-74";
		this.info=this.info+"-karina-3-78-78-98";
	}
	
	//init 
	//info 파싱해서 
	public ArrayList<StudentDTO> init() {
		StringTokenizer st = new StringTokenizer(this.info, "-");
		ArrayList<StudentDTO> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			ar.add(studentDTO);
		}
		
		return ar;
	}
	
	//학생정보검색 findByName  이름으로 검색
	
	//학생정보추가 studentAdd
	
	//학생정보삭제 studentDelete 이름으로 검색해서 삭제

}
