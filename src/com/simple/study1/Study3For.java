package com.simple.study1;

import java.util.Scanner;

public class Study3For {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("분을 입력하세요.");
	int min=sc.nextInt();
	
	System.out.println("초를 입력하세요.");
	int sec=sc.nextInt();
	
	for(int i=min; i<60; i++) {
//		System.out.println(i+"분");
		
		for(int j=sec;j<60;j++) {
			System.out.println(i+"분"+j+"초");
//			break;			
		} //안쪽 포문 종료
		break;
	} // 바깥 쪽 포문 종료

}
}