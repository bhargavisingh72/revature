package com.revature;

public class Sample41 {
	void method(){
	int a = 10; 
	String name = null; 
	try { 
	    a = name.length(); 
	    a++; 
	} 
	catch (RuntimeException e){ 
	    ++a; 
	}
	System.out.println(a);
	} 
	
	public static void main(String[] args) {
		Sample41 sam = new Sample41();
		sam.method();
	}

}
