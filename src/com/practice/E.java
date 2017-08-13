package com.practice;

public class E {

	
	public static void main(String args[]){

	    B b = new C();
        //D d = new D();
	    A a = b;
	   // A c = d;

	    if (a instanceof A) System.out.println("A");

	    if (a instanceof B) System.out.println("B");

	    if (a instanceof C) System.out.println("C");  

	  if (a /*c*/instanceof D) System.out.println("D");

	  }
}
