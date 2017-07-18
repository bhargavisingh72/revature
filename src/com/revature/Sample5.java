package com.revature;

public class Sample5 {
public static void main(String[] args) {
	boolean b1=true;
	boolean b2=true;
	boolean b3=true;
	boolean b4=true;
	
	
	
	
       b1="hello".concat(" world").trim().equals("hello world");
	b2 = "HELLO world".equalsIgnoreCase("hello world");
	b3="hello world".equals("hello world");
	b4="Hello world".toLowerCase( ).equals("hello world");


System.out.println(b1);
System.out.println(b2);
System.out.println(b3);
System.out.println(b4);



}
}
