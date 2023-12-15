package com.winter.study4.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	private Scanner sc;
	private StudentService studentService;
	private StudentView studentView;
	
	public StudentController() {
		this.sc = new Scanner(System.in);
		this.studentService = new StudentService();
		this.studentView = new StudentView();
	}
	
	
	public void start() {
		boolean check=true;
		ArrayList<StudentDTO> ar = this.studentService.init();
		
		
		while(check) {
			System.out.println("1. 학생정보출력");
			System.out.println("2. 학생정보검색");//이름으로 검색
			System.out.println("3. 학생정보추가");
			System.out.println("4. 학생정보삭제");
			System.out.println("5. 프로그램종료");
			int select = this.sc.nextInt();
			if(select==1) {
				studentView.view(ar);
			}else {
				System.out.println("프로그램 종료 합니다");
				break;
			}
		}
		
	}

}
