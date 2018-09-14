package com.aca;

 import java.util.Scanner;
 
public class Temperature {

	public static void main(String[] args) {
		
		double celcius = 0;
		double fahrenheit = 0 ;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input Celcius value and press Enter?");
		
		celcius = in.nextDouble();
		fahrenheit = (celcius * (9.0 / 5.0) + 32) ;
		
		System.out.println(celcius = fahrenheit);
		
		// Lasenby's class: System.out.println(celcius + "C = " + fahrenheitTemp + F");"
		
		// Lasenby's class: System.out.printf("%.1f C= %.1f F")
	
	
	}
}
