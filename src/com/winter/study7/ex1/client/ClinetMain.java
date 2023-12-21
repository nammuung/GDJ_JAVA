package com.winter.study7.ex1.client;

public class ClinetMain {
	public static void main(String[] args) {

		ClinetController controller = new ClinetController();
		
		try {
			controller.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
