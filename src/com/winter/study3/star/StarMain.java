package com.winter.study3.star;

public class StarMain {

	public static void main(String[] args) {

		//클래스명의 첫글자 대문자
		//변수명의 첫글자 소문자
		//메서드명의 첫글자 소문자 ()
		Marine marine=new Marine();
		
		System.out.println(marine.hp);
		marine.move();
		System.out.println(marine.gun.damage);
		
		Medic medic = new Medic();
		

	}

}
