package com.aca;


import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
	public static void main(String [] args){
	//pick a random number
	Random random = new Random();
	int number = random.nextInt(100) + 1;
	
	Scanner scanner1 = new Scanner(System.in);
	
	System.out.println( "I'm thinking of a number between 1 and 100");
	System.out.println("...including both. Can you guess what it is?");
	
	System.out.println("Type a number: " );
	
	int guess = scanner1.nextInt();
	
	System.out.println("");
	
	System.out.println("Your guess is " + guess );
	System.out.println("the number I was thinking of is: " + number);
	
	
	
	
	}
	
	

}
