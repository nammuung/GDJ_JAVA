package com.winter.study4.util;

import java.util.ArrayList;

public class StudyList2 {

	public static void main(String[] args) {
		//E 변수
		//E = Object
		ArrayList<Object> ar = new ArrayList<Object>();
		ArrayList<Object> ar2 = new ArrayList<>();
		ArrayList<String> ar3 = new ArrayList<>();
		ArrayList<Integer> ar4= new ArrayList<>()
		ar3.add("a");
		String n = ar3.get(0);
		ar.add(1);
		ar.add("second");
		ar.add(false);
		ar.add(4.23);
		
		//-------------------------------------
		//타입의 안정성
		int n = (Integer)ar.get(0);
		String str = (String)ar.get(1);
		boolean c = (Boolean)ar.get(2);
		
		//제네릭
		

	}

}
