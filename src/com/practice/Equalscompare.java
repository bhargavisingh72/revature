package com.practice;

public class Equalscompare {
public static void main(String[] args) {
	 String s = "Hello";
	 String t = new String(s);
	 if ("Hello".equals(s)) System.out.println("one");
	 if (t == s) System.out.println("two");
     if (t.equals(s)) System.out.println("three");
	 if ("Hello" == s) System.out.println("four");
	 if ("Hello" .equals(t) ) System.out.println("five");
}
}
