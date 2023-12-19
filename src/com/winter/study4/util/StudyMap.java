package com.winter.study4.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.winter.study4.util.ex1.StudentDTO;

public class StudyMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("k1", 1);
		map.put("k2", 2);
		
		map.put("k1", 200);
		
		System.out.println(map);
		
		
		
		Integer num = map.get("k2");
		
		System.out.println(num);
		
		
		Set<String> k = map.keySet();
		
		Iterator<String> keys = k.iterator();
		
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println("Key : "+key);
			System.out.println(map.get(key));
		}
		
		
//		ArrayList<StudentDTO> ar = new ArrayList<>();
//		
//		HashMap<String, StudentDTO> m = new HashMap<>();
//		StudentDTO studentDTO = new StudentDTO();
//		studentDTO.setName("winter");
//		m.put("winter", studentDTO);

	}

}
