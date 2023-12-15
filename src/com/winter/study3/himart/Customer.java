package com.winter.study3.himart;

public class Customer {
	
	private int money;
	private int point;
	
	public Customer() {
		this.money=2000;
		this.point=10;
	}
	
	//매개변수 하나만 선언
	public void buy(Product p) {
		//물건값 계산
		this.money=this.money-p.getPrice();
		this.point=this.point+p.getPoint();
		//최종 가진돈과 포인트를 출력
		System.out.println("Money : "+this.money);
		System.out.println("Point : "+this.point);
		
		System.out.println(p instanceof Tv);
		
	}

}
