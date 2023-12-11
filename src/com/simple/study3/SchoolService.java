package com.simple.study3;

import java.util.Scanner;

public class SchoolService {
	
	//메서드 makeStudents
	// 학생수를 입력받아서 수만큼 학생정보를 입력
	public Student [] makeStudents() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		
		Student [] students = new Student[count];
		
		for(int i=0;i<count;i++) {
			Student student = new Student();//null, 0, 0.0
			System.out.println("이름 입력");
			student.name=sc.next();
			System.out.println("번호 입력");
			student.num=sc.nextInt();
			System.out.println("점수 입력");
			student.jumsu=sc.nextDouble();
			students[i]=student;
		}
		
		return students;
	}
	

}