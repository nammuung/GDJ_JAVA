package com.winter.study3.himart;

public class NoteBook extends Product {
	
	private String cpu;
	
	public NoteBook() {
		this.cpu="i9";
		this.setBrand("LG");
		this.setSize(14);
		this.setPoint(60);
		this.setPrice(150);
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	

}
