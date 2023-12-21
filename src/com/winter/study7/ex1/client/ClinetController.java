package com.winter.study7.ex1.client;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClinetController {

	public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("127.0.0.1", 8282);
		System.out.println("서버에 접속하셨습니다.");
		System.out.println("1. 날씨정보출력");
		System.out.println("2. 날씨정보검색");
		System.out.println("3. 종료");
		String m = sc.next();
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		bw.write(m+"\n\r");
		bw.flush();
		
		
//		boolean check = true;
//		while(check) {
//			if(a=="1") {
////			String m = sc.next();
//			OutputStream os = socket.getOutputStream();
//			OutputStreamWriter ow = new OutputStreamWriter(os);
//			BufferedWriter bw = new BufferedWriter(ow);
//			bw.write(a);
//			bw.flush();
//			}
//		}
		
		
		
		
		
		
		// 1. 날씨정보출력
		
		// 2. 날씨정보검색
		
		// 3. 종료
		}
	

}
