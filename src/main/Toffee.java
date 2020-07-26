package com.epam.Mavenproject;

public class Toffee extends Candy implements Flavour{

	private int wt = 9;
	private String comp = "Candyman";
	String flavour = "Sour";
	public int Weight() {
		return wt;
	}
	
	public String company(){
		return comp;	
	}
	
	public String giftType() {
		return type;
	}
	
	public String FlavName() {
		return flavour;
	}
}