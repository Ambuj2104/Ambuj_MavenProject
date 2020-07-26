package com.epam.Mavenproject;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class MyMain{

	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		ArrayList<chocolate> chocos = new ArrayList<chocolate>();
		ArrayList<Candy> candies = new ArrayList<Candy>();
		int chocoWeight = 0;
		int candyWeight = 0;
		int totalWeight = 0;
		System.out.println("\t HAPPY NEW YEAR!!");
		while(true) {
			String ans = "f";
			System.out.println("Enter the type of Cholocate you want:");
			System.out.println("1.White Chocolate\n2.Dark Chocolate\n3.Bar Chocolate");
			int chocoAns = Integer.parseInt(reader.readLine());
			if(chocoAns == 1) {
				WhiteChocolate ch = new WhiteChocolate();
				chocos.add(ch);
				chocoWeight += ch.Weight();			
			}
			else if(chocoAns == 2) {
				DarkChocolate ch = new DarkChocolate();
				chocos.add(ch);
				chocoWeight += ch.Weight();	
			}
			else if(chocoAns == 3) {
				BarChocolate ch = new BarChocolate();
				chocos.add(ch);
				chocoWeight += ch.Weight();	
			}
			else {
				System.out.println("Wrong option!");
			}
			System.out.println("Do you want more chocolates?(y/f)");
			ans = reader.readLine();
			if(ans.equals("y") || ans.equals("Y")) {
				continue;
			}
			else {
				break;
			}
			
		}
		System.out.println("I have your chocolates. In which order would you like to see those?");
		System.out.println("1.Company 2. Weight");
		int sortans = Integer.parseInt(reader.readLine());
		int chocoSize = chocos.size();
		if(sortans == 1) {
			ArrayList<String> comps = new ArrayList<String>();
			for(int i=0;i<chocoSize;++i) {
				comps.add(chocos.get(i).company());
			}
			Collections.sort(comps);
			int count = 0;
			System.out.println("Inordered Company names:");
			while(comps.size()> count) {
				System.out.print(comps.get(count)+" ");
				count++;
			}
		}
		else if(sortans == 2) {
			ArrayList<Integer> w = new ArrayList<Integer>();
			for(int i=0;i<chocoSize;++i) {
				w.add(chocos.get(i).Weight());
			}
			Collections.sort(w);
			int count = 0;
			System.out.println("Inordered Weight Values:");
			while(w.size()> count) {
				System.out.print(w.get(count)+"gm  ");
				count++;
			}
		}
		else {
			System.out.println("Wrong ans! Sorting by Company Name:");
			ArrayList<String> comps = new ArrayList<String>();
			for(int i=0;i<chocoSize;++i) {
				comps.add(chocos.get(i).company());
			}
			Collections.sort(comps);
			int count = 0;
			System.out.println("Inordered Company names:");
			while(comps.size()> count) {
				System.out.print(comps.get(count)+" ");
				count++;
			}
			
		}
		
		
		while(true) {
			String ans = "f";
			System.out.println("\n\n Enter the type of Candy you want:");
			System.out.println("1.Lollipop\n2.Toffee\n");
			int candyAns = Integer.parseInt(reader.readLine());
			if(candyAns == 1) {
				Toffee cand = new Toffee();
				candies.add(cand);
				candyWeight += cand.Weight();			
			}
			else if(candyAns == 2) {
				Lollipop cand = new Lollipop();
				candies.add(cand);
				candyWeight += cand.Weight();	
			}
			else {
				System.out.println("Wrong option!");
			}
			System.out.println("Do you want more Candies?(y/f)");
			ans = reader.readLine();
			if(ans.equals("y") || ans.equals("Y")) {
				continue;
			}
			else {
				break;
			}
		}
		System.out.println("Enter the range of Weights of Candies:");
		int lower = Integer.parseInt(reader.readLine());
		int upper = Integer.parseInt(reader.readLine());
		System.out.println("Candies in your Range:");
		int count=0;
		while(candies.size()>count) {
			if(candies.get(count).Weight()>=lower && candies.get(count).Weight()<=upper) {
				System.out.print(candies.get(count).company()+ " ");
			}
			count++;
		}
		System.out.println();
		totalWeight = candyWeight + chocoWeight;
		System.out.println("Total Weight Information:");
		System.out.println("Candy Weight:" + candyWeight + "gm");
		System.out.println("Chocolate Weight:" + chocoWeight + "gm");
		System.out.println("Chocolate Weight:" + totalWeight + "gm");
	}
}