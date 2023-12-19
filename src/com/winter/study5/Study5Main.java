package com.winter.study5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Study5Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		try {
			System.out.println(sc.nextInt());
			//throw new InputMismatchException();
		
			System.out.println("정상 진행");
			String str=null;
//		Error		
//		int a;
//		System.out.println(a);
		
			Test t = new Test();
			
			int [] arr = new int[2];
			
			arr[3]=10;
		//new ArrayIndexOutOfBoundsException();
		}catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			
		}catch (RuntimeException e) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}catch (Throwable e) {
			// TODO: handle exception
		}finally {
			
		}
		
		int a =10;
		int num=0;
		if(num!=0) {
			a = a/num;
		}
		new ArithmeticException();
		
		ArrayList<Integer> ar=null;
		//t.t1(ar);

		System.out.println("종료 합니다.");
	}

}
