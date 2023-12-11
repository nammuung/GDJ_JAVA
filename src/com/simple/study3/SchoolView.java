package com.simple.study3;

public class SchoolView {

	// method 이름은 view
	// 하는 역할 : 학생들의 정보를 받아서 출력
	public void view(Student[] students) {

		for (int i = 0; i < students.length; i++) {
			System.out.println("이름 : " + students[i].name);
			System.out.println("번호 : " + students[i].num);
			System.out.println("점수 : " + students[i].jumsu);
		}
	}
}