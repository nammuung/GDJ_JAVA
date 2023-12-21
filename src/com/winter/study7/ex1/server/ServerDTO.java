package com.winter.study7.ex1.server;

public class ServerDTO {

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getGion() {
		return gion;
	}
	public void setGion(int gion) {
		this.gion = gion;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getHum() {
		return hum;
	}
	public void setHum(int hum) {
		this.hum = hum;
	}
	private String city;
	private int gion;
	private String info;
	private int hum;
}
