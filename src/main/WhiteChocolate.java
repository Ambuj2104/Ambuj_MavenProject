package com.epam.Mavenproject;

public class WhiteChocolate extends chocolate implements Flavour{
	
	private int wt = 99;
	private String comp = "Cadbury";
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