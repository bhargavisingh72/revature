package com.revature;

public class Sample40 {
	  void foo() {
		    try {
		      String s = null;
		      System.out.println("1");
		      try {
		        System.out.println(s.length());
		      } catch (NullPointerException e) {
		        System.out.println("inner");
		      }
		      System.out.println("2");
		    } catch (NullPointerException e) {
		      System.out.println("outer");
		    }
		  }

		  public static void main(Sample50 args[]) {
		    Sample40 obj = new Sample40();
		    obj.foo();
		  }
}
