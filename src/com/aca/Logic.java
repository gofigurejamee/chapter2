package com.aca;

public class Logic {

	public static void main(String[] args) {
		
		boolean yes = true;
		boolean no = false; 
		
		System.out.println("Both YesYEs True:" + (yes&&no));
		System.out.println("Both YeSNo TRUE:" + (yes&&no));
		
		System.out.println("Either YesYes True:" + (yes || yes));
		System.out.println("Either YesNo True:" + (yes || no));
		System.out.println("Either NoNo True:" + (no || no));
		
		System.out.println("Original Yes Value: " + yes);
		System.out.println("Inverse Yes Value: " + !yes);
		
		
		
		

	}

}
