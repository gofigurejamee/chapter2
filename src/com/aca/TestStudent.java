package com.aca;

public class TestStudent {

	public static void main(String[] args) {
		
		Student student = new Student();
		String name = student.getName();
		Time2 time = new Time2();
	//	int whatTime = time.steve();
		
//		System.out.println("Time is: " + whatTime +" oclock." );
		
		System.out.println("value of name is: " + name);
		
		
		name = student.getFullname("Shores");
		System.out.println("value of name is: " + name);

	}

}
