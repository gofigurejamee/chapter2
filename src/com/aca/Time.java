package com.aca;

public class Time {

	public static void main(String[] args) {
		
		
		int hour = 18 ;
		int minute = 49; 
		int second = 1;
//		float secondsInADAy = 24 * 60 * 60;
			
		
		int totalSecondsHour = hour * 60 * 60;		
		
		int totalSecondsMinute = minute * 60;
		
		
		int total = totalSecondsHour + totalSecondsMinute + second;
		System.out.println("Total seconds since midnight: " + total);
		
//		int remainingSEconds = secondsinaday - totalSecondsSInceMidnight;
//		System.out.println("              SEconds remaining: " + remainingSeconds);
//		
//		int percent = (totalSEcondsSinceMIdnight / secondsInADAy) * 100;
//		System.out.println("percent of day that has passed: " + percent);
		}

}
