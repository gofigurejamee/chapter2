package com.aca;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		
		Scanner party = new Scanner(System.in);
		
		//ask the user for a seconds value
		System.out.println("Enter the number of seconds and press enter.");
		
		//reading an integer from the keyboard;
		int seconds = party.nextInt();
		
		//number of hours
		int hours = (seconds / 3600);
		
		System.out.println("hours =  " + hours);
		
		//number of  minutes
		int minutes = (seconds % 3600);
		minutes = (minutes / 60);
		
		System.out.println("minutes =  " + minutes);
		
				
		
		
		
		
		
	
				

				
				
		
		
		
		
		

	}

}
