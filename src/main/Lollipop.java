package com.epam.Mavenproject;

public class Lollipop extends Candy implements Flavour{
	
	private int wt = 30;
	private String comp = "Nestle";
	String flavour = "Sweet";
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