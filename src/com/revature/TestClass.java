package com.revature;


public class TestClass {
	   static TestClass ref;    
	   String[] arguments;
	   public static void main(String args[]){ 
		   ref = new TestClass();   
		   ref.func(args); 
		   } 
	   public void func(String[] args){   
		   ref.arguments = args;  
		System.out.println("result"+ref.arguments);   
	   }
	   
}
