package com.simple.study3.rpg;

public class Test {
		
		public void t1() {
			System.out.println("T1 Method");
		}
		
		
		//값을 두개 받아서 더하기 하려는 용도
		public void t2(int num1, int num2) {
			int sum = num1 + num2;
			num1=30;
			System.out.println(sum);
		}
		
		// 방법1
//		public void t3(int age) {
			
//		}
		//방법 2
		public void t3(Human human) {
			if(human.age>19) {
				System.out.println("성년임");
			}else {
				System.out.println("미성년자임");
			}
			human = new Human();
			human.age=500;
		}
		
		
		public void t4(int [] ar) {
			for(int i=0;i<ar.length;i++) {
				System.out.println(ar[i]);
			}
		}
		

	}


