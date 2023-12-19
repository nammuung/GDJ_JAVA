
package com.winter.study4.util.ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class StudySetInfo {
	//로또 번호 생성
	//1-45 , 6개
	
	public void ex0() {
		//배열
		int [] ar = new int [6];
		Random random = new Random();
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=random.nextInt(44)+1;
			//같은지 비교
			for(int j=0;j<i;j++) {
				if(ar[i]==ar[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i:ar) {
			System.out.println(i);
		}
		
	}
	
	
	public void ex1() {
		//ArrayList
		Random random = new Random();
		ArrayList<Integer> ar = new ArrayList<>();
		
		while(ar.size()!=6) {
			int num = random.nextInt(45)+1;
			if(!ar.contains(num)) {
				ar.add(num);
			}
		}
		
		for(Integer n:ar) {
			System.out.println(n);
		}
		
	}
	
	
	public void ex2() {
		//HashSet
		Random random = new Random();
		HashSet<Integer> hs = new HashSet<>();
		
		while(hs.size()!=6) {
			hs.add(random.nextInt(45)+1);
		}
		
		System.out.println(hs);
	}

}
