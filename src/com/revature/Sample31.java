package com.revature;

public class Sample31 {
	  public static void main(Sample50[] argv){
		     System.out.print("a"); 
		     try { 
		       System.out.print("b"); 
		       throw new IllegalArgumentException(); 
		     } catch (RuntimeException e) { 
		       System.out.print("c"); 
		     } finally { 
		       System.out.print("d"); 
		     } 
		     System.out.print("e"); 
		  }
}
