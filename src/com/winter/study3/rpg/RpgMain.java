package com.winter.study3.rpg;

import com.winter.study3.rpg.weapon.Axe;
import com.winter.study3.rpg.weapon.Bow;

public class RpgMain {

	public static void main(String[] args) {

		Worrier worrier = new Worrier();
		Axe axe = new Axe();
		worrier.setWeapone(axe);
		worrier.getWeapone().attack();
		
		Bow bow = new Bow();
		worrier.setWeapone(bow);
		worrier.getWeapone().attack();
		
		

	}

}
