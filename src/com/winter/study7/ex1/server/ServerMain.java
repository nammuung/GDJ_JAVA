package com.winter.study7.ex1.server;

public class ServerMain {
	public static void main(String[] args) {

		ServerController serverController = new ServerController();
		try {
//			ServerDAO serverDAO = new ServerDAO();
//			serverDAO.getdata();
					
			serverController.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
