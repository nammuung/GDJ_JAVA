package com.simple.study3;

public class Student {

	//멤버 변수 선언
	//접근지정자 [그외지정자] 데이터타입 변수명;
	String name;
	String number;
	double total;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", total=" + total + "]";
	}
		
}
