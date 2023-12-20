package com.winter.study6.ex2;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Test {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	//총 16
	// 킹1 , 퀸1 , 룩2, 비숍2, 나이트2 ,폰8
	//첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다. 
	//만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.
	// 0 1 2 2 2 7 -> 1 0 0 0 0 1
	
	// 배열 default 값 - input data 

	int [] names = {1, 1, 2, 2, 2, 8};
	for(int i=0;i<names.length;i++) {
		int num = sc.nextInt();
		System.out.println(names[i]-num);
	} 
	
	}
}
