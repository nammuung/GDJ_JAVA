package com.winter.study1;

import java.util.Scanner;

public class Study4For {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		
		//1. 로그인 처리
		//  1.로그인 2. 종료
		//  -id, pw
		boolean check=true;
		while(check) {
			System.out.println("1.로그인 2.종료");
			int select = sc.nextInt();
			if(select==1) {
				System.out.println("ID입력");
				int yId=sc.nextInt();
				System.out.println("PW입력");
				int yPw=sc.nextInt();
				if(yId==id&&yPw==pw) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("ID나 PW가 틀림");
				}
			}else {
				check=false;
			}
			
		}
		
		if(check) {
			int level=1;
			int gold=0;
			
			for(;level<15;level++) {
				
				if(level%5==0) {
					gold = gold+level/5*1000;
				}
				
//				if(level==10) {
//					gold = gold+2000;
//				}
				
				for(int m=0;m<level*3;m++) {
					System.out.println(m+1+"사냥 성공");
				}
				
				System.out.println("축 레벨업 : "+(level+1));
			}
			gold=gold+3000;
			System.out.println("최종 레벨 : "+level);
			System.out.println("최종 Gold : "+gold);
			
		}
		
		
		
		//2. MMORPG
			//레벨은 1부터 시작
			//골드 0
			//1 -> 2	3마리 
			//2 -> 3	6
			//3 -> 4	9
			//....
			//14 ->15	42
		
			//레벨이 5랩 달성시 1000G 지급
			//레벨이 10랩 달성시 2000G 지급
			//레벨이 15래 달성시 3000G 지급
		
			//최종 레벨과 골드를 출력하고 게임종료
		
		
		
		
		
		
		
	}

}
