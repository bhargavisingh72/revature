package com.revature;

public class Sample27 {
	public static void main(Sample50[] args) { 
	         int x = 5, j = 0; 
	         for(int i=0; i<3; )  
	          INNER: do { 
	            i++; x++; 
	            if(x > 10) break INNER; 
	             x += 4; 
	           j++; 
	           } while(j <= 2); 
	        System.out.println(x); 
	      } 
}
