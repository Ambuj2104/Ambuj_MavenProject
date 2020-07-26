package com.epam.Mavenproject;

public class DarkChocolate extends chocolate implements Flavour{
	
	private int wt = 90;
	private String comp = "Cadbury";
	String flavour = "sweet-sour";
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