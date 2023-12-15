package com.winter.study3.himart;

public class Tv extends Product{
	
	private String color;
	
	public Tv() {
		this.color="Black";
		this.setSize(100);
		this.setPrice(1000);
		this.setBrand("Samsung");
		this.setPoint(25);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
