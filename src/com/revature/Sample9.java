package com.revature;

public class Sample9 {
	 public Sample9(){
	      s1 = sM1("1");
	   }
	   static String s1 = sM1("a");
	   String s3 = sM1("2");{
	      s1 = sM1("3");
	   }
	   static{
	      s1 = sM1("b");
	   }
	   static String s2 = sM1("c");
	   String s4 = sM1("4");
	    public static void main(String args[]){
	        Sample9 it = new Sample9();
	    }
	    private static String sM1(String string){
	       System.out.println(string);  return string;
	    }
	}
