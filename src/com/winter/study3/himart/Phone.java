package com.winter.study3.himart;

public class Phone extends Product{
	private int pixel;
	private String model;
	
	public Phone() {
		this.pixel=1000;
		this.model="S24";
		this.setBrand("Apple");
		this.setSize(24);
		this.setPrice(240);
		this.setPoint(50);
	}
	
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
