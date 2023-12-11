package com.simple.study3;

import java.util.Arrays;
import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student text = new Student();
		// 배열 전역 변수 선언
		String[] nam = null; // 이름
		String[] num = null; // 전화번호
		double[] tot = null; // 학점
		int[] mem = null; // 학생 수
		boolean check = true; // while 체크용도
		while (check) {
			System.out.println("1.학생정보생성 2.학생정보출력 3.학생정보검색 4.성적순출력 5.프로그램종료");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("학생 수를 입력하세요.");
				int member = sc.nextInt();

				int[] members = new int[member];
				for (int i = 0; i < member; i++) {
					
				}
				mem = new int[member];
				nam = new String[member];
				num = new String[member];
				tot = new double[member];
				// 클래스 배열 선언
				Student[] total_list = new Student[member];

				for (int i = 0; i < total_list.length; i++) {
					
					System.out.println("학생 이름을 입력하세요");
					String name = sc.next();
					
					System.out.println("학생 번호");
					String number = sc.next();
					
					System.out.println("학생 학점");
					double total = sc.nextDouble();
					
					Student stuObj = new Student(); // Student타입 배열에 반복해서 저장할 Student 객체 생성
					stuObj.name = name; // 생성된 Student객체의 name필드에 접근하여 입력받은 name값으로 필드 초기화
					stuObj.number = number; // 위와 동일 number
					stuObj.total = total; // 위와 동일 number
					total_list[i] = stuObj; // total_list 배열에 순차적으로 하나씩 배열요소 추가
					
				}
				
				System.out.println(Arrays.toString(total_list));	
			}
		}

	}
}
