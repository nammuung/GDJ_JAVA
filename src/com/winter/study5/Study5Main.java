package com.winter.study5;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Study5Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		
		//예외처리 하는법
		try {
		int num=sc.nextInt();
//		throw new InputMismatchException();   // exception이 발생할경우 자동으로 생성댐
		
		System.out.println("정상 진행");
		
		String str=null;
		
		Test t = new Test();
		
		int [] arr = new int[2];
		arr[3]=10;
		}catch(RuntimeException e) {    //문제가 발생할 경우
			System.out.println("Exception 발생");
		}
		
		
		
		int a = 10;
		a  = a/0;
		ArrayList<Integer> ar =null;
		t.t1(ar);
		
		System.out.println("종료 합니다.");
	}
}
