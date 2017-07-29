package com.revature;


public class TestClass {

		public static void methodX() throws Exception

		{       throw new AssertionError();  

		 }      

		public static void main(Sample50[] args) {      

		try{          methodX();       }      

		catch(Exception e) {         System.out.println("EXCEPTION");       }  

		 }
}
