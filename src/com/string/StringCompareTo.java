package com.string;

public class StringCompareTo {
	public static void main(String[] args) {
		
	
	String s2="hello";  
	String s3="hello";  
	String s4="meklo";  
	String s5="hemlo";  
	String s6="flag";
		System.out.println(s2.compareTo(s3));//0 because both are equal  
	System.out.println(s2.compareTo(s4));//-5 because "h" is 5 times lower than "m"  
	System.out.println(s2.compareTo(s5));//-1 because "l" is 1 times lower than "m"  
	System.out.println(s2.compareTo(s6));//2 because "h" is 2 times greater than "f" 
	
	  
	
}
}
