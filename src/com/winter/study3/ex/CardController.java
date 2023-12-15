package com.winter.study3.ex;

import java.util.Scanner;

public class CardController {
	
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		CardView cardView = new CardView();
		CardManager cardManager = new CardManager();
		
		boolean check=true;
		Card [] cards = null;
		while(check) {
			System.out.println("1. 목록보기");
			System.out.println("2. 상세보기");
			System.out.println("3. 목록추가");
			System.out.println("4. 목록수정");
			System.out.println("5. 목록삭제");
			System.out.println("6. 종  료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("목록");
				cardView.view(cards);
			}else if(select==2) {
				System.out.println("디테일");
				cardView.detail(cards);
			}else if(select==3) {
				System.out.println("추가");
				cards = cardManager.addCard(cards);
			}else if(select==4) {
				System.out.println("수정");
			}else if(select==5) {
				System.out.println("삭제");
			}else {
				System.out.println("종료합니다");
				break;
			}
			
		}
		
	}

}
