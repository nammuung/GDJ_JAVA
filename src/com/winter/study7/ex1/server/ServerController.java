package com.winter.study7.ex1.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerController {

	public void start()  throws Exception{
		ServerDTO serverDTO = new ServerDTO();
		ServerDAO serverDAO = new ServerDAO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("클라이언트가 접속하기를 기다리는중");
		ServerSocket ss = new ServerSocket(8282);
		Socket sc = ss.accept();
		System.out.println("Client 연결 성공");	
		InputStream is = sc.getInputStream();//0,1
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		String m= br.readLine();
		System.out.println(m);
		
		
		//클라이언트에게 메세지 전송
		System.out.println("Client로 보낼 메세지 입력");
		m = scanner.nextLine();
		OutputStream os = sc.getOutputStream();//0,1
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		serverDAO.getdata();

	}

}
