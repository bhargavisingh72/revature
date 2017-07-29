package com.revature;

public class Sample1 {
		    int intVal = 0;
	    String strVal = "default";
	    public Sample1(int k){
	        this.intVal = k; 
	    }
	 public static void main(String[] args) throws Exception {
	        Sample1 d1 = new Sample1(10);
	        d1.strVal = "D1";
	        Sample1 d2 = d1;
	        d2.intVal = 20;
	        System.out.println("d2 val = "+d2.strVal);
	    }
}
