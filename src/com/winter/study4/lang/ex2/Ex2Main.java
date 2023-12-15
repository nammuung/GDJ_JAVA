package com.winter.study4.lang.ex2;

import java.util.Scanner;

public class Ex2Main {

	public static void main(String[] args) {
		//FQDN
		java.util.Random r;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");//991225-1234567
		String jumin="990225-1234567";
		
		//1. 남자여자 구별
		char ch = jumin.charAt(7);
//		if(ch=='1' || ch=='3') {
//			
//		}else {}
		String s = jumin.substring(7, 8);
//		if(s.equals("1") || s.equals("3"))
		s= String.valueOf(ch);
		//int num = Integer.parseInt(s);
		System.out.println(s);
		
		//2. 대략 나이?
		String year = jumin.substring(0, 2);
		year = "19"+year;
		//19? 20 판별
		int y = Integer.parseInt(year);
		//2023-y
		
		
		//3. 태어난 계절?
		String month = jumin.substring(2, 4);
		int m = Integer.parseInt(month);
		if(m>2&&m<6) {
			
		}
		
		
		//4. 주민 타탕
		//   9  9  1  2  2  5 - 1  2  3  4  5  6  7
		//   2  3  4  5  6  7   8  9  2  3  4  5
		//   총합구하기
		//  ex) 122(총합)을 11로 나눈 나머지를 구함
		//  11에서 나머지를 뺌 결과를 체크용 번호와 비교
		//  결과가 2자리라면
		//  그 나머지를 10으로 나눈 나머지를 구함
		//  그 나머지를 체크번호와 일치하는지 확인
		char [] chs = jumin.toCharArray();
		
		int temp=2;
		int sum=0;
		for(int i=0;i<jumin.length()-1;i++) {
			if(i==6) {
				continue;
			}
			if(temp>9) {
				temp=2;
			}
			char c =  chs[i];//jumin.charAt(i);
			int n = Integer.parseInt(String.valueOf(c));
			sum=sum+n*temp;
			temp++;
		}
		
		sum=11-sum%11;
		if(sum>9) {
			sum=sum%10;
		}
		
		if(sum==jumin.charAt(jumin.length()-1)) {
			
		}
		//이름, 주민
				
		
		

	}

}
