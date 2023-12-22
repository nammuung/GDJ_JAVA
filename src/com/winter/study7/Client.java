package com.winter.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	
	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.188", 8282);
		System.out.println("서버와 접속 성공");
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		
		InputStream is=null;
		InputStreamReader ir=null;
		BufferedReader br=null;
		os = socket.getOutputStream();//0,1
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		is = socket.getInputStream();//0,1
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		while(true) {
			System.out.println("서버로 보낼 메세지 입력");
			String m = sc.nextLine();//
			
			
			bw.write(m+"\n\r");
			bw.flush();
			
			if(m.toUpperCase().equals("EXIT")) {
				break;
			}
			
			//서버메세지 수신
			System.out.println(br.readLine());
		}
		
		bw.close();
		ow.close();
		os.close();
		
		if(is != null) {
			br.close();
			ir.close();
			is.close();
		}
		
		sc.close();
		socket.close();
	}

}
