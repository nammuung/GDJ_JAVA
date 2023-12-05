package com.simple.study1;

import java.util.Scanner;

public class Study2For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		int id = 1234;
		int pw = 5678;
		int num = sc.nextInt();
		// id, pw 입력 받은 이후 로그인 성공 유무 판단
		boolean check=false;
		
		for(int i=0; i<5; i++) {
			System.out.println("ID 입력");
			int youID=sc.nextInt();
			System.out.println("PW 입력");
			int youPw=sc.nextInt();
//			result="로그인 실패";
			if(youID==id && youPw==pw){
				System.out.println("로그인 성공");
//				result="로그인 성공";
				check = !check;
				break;
			}
		}
//		System.out.println(result);
	}
}
