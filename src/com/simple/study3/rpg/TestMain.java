package com.simple.study3.rpg;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=null;
		
		test = new Test();
		
		
		test.t1();
		int n=10;
		test.t2(n, 20);
		System.out.println(n);
		
		
		//매개변수로 보낼 휴면 객체 생성
		//객체 생성
		Human human = new Human();
		human.age=20;
		//인자값
		test.t3(human);
		System.out.println(human.age);
		
	}

}
