package com.winter.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	
	public void send() throws Exception{
		boolean check = true;
		Scanner sc = new Scanner(System.in);
//		Socket socket = new Socket("192.168.7.159", 8282);
		Socket socket = new Socket("127.0.0.1", 8282);
		System.out.println("성공");
		
		while(true) {
			System.out.println("서버로 보낼 메시지를 입력");
			String m = sc.next();
			
			
			// 소켓 내보낼 준비
			//0과 1을 처리
			OutputStream os = socket.getOutputStream();
			// 문자를 담당
			OutputStreamWriter ow = new OutputStreamWriter(os);
			// 문자열 담당
			BufferedWriter bw = new BufferedWriter(ow);
			// 내보내기
			bw.write(m+"\n\r");
			bw.flush();
			
				
	
			System.out.println("서버 메시지를 기다리는중");
	//		ServerSocket socket = new ServerSocket(8282);
	//		Socket za = socket.accept();
			// 소켓 받아오는 작업
			// 0/1처리
			InputStream is = socket.getInputStream();
			//문자를 만듬
			InputStreamReader ir = new InputStreamReader(is);
			// 문자열을 만듬
			BufferedReader br = new BufferedReader(ir);
			
			
			String z = br.readLine();
			System.out.println(z);
			if(z==null) {
				System.out.println("클라이언트가 종료됨");
				check = false;
				break;
			}
			else if(z.equals("exit")) {
	//		ac.close();
			ir.close();
			br.close();
			bw.close();
			ow.close();
			os.close();
			sc.close();
			socket.close();
			System.out.println("클라이언트가 종료됨");
			check = false;
			break;
	
			}
		}
		
		

		
	}
	
}
