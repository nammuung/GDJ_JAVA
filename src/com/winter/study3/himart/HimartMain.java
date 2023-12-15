package com.winter.study3.himart;

public class HimartMain {

	public static void main(String[] args) {
		NoteBook noteBook = new NoteBook();
		Phone phone = new Phone();
		Tv tv = new Tv();
		
		Customer customer = new Customer();
		customer.buy(phone);
		
		Product [] products = new Product[3];
		products[0]=tv;
		products[1]=phone;

	}

}
