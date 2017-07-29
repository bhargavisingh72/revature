package com.revature;

public class Man {
	 public static void main(String[] args) {
		    Sample37 base = new Sample37();
		    Sample37 derived = new Derived();

		    System.out.println(base.var);
		    System.out.println(derived.var);
		    base.printVar();
		    derived.printVar();
		  }

}
