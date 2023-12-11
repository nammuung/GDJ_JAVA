package com.simple.study3.rpg;

import java.util.Scanner;

public class ExString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max;
		// 모두 같을때
		if (a == b && a == c && b == c) {
			int ato = 10000 + a * 1000;
			System.out.println(ato);
		}
		if (a >= b && a >= c && b>=c) { // 1개만 다를때
			max = a;
			int bto = 1000 + max * 100;
			System.out.println(bto);
		} 
//			else if (b >= a && b >= c) {
//			max = b;
//			System.out.println("b값임"+max);
//		}
//			else {
//			max = c;
//			System.out.println(max);
//			int bto = 1000 + max * 100;
//			System.out.println(bto);
//		}
		if (a != b && a != c && b != c) {
			int totla=(Math.max(Math.max(a,b),c));
			int cto = totla * 100;
			System.out.println(cto);
		}

	}

}
