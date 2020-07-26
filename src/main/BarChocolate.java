package com.epam.Mavenproject;

public class BarChocolate extends chocolate implements Flavour{
	
	private int wt = 50;
	private String comp = "Nestle";
	String flavour = "sweet";
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