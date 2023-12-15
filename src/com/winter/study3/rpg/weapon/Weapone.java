package com.winter.study3.rpg.weapon;

public interface Weapone extends Item {
	
	//상수
	final int level=1;
	
	//추상메서드
	public abstract void attack();
	
//	//접근지정자는 public만 가능
//	void damage();
//	
//	public int inchant();
//	
//	abstract String go();

}
