package com.practice;


public class MessageLogger {
public static void log(String s){
	System.out.println("s");
}
public static void log(int i){
	System.out.println("i");
}
public static void log(double d){
	System.out.println("d");
}
public static void main(String[] args) {
	short s = 123;
	log(s);
	log(25.0);
	log("hello");
} 
}

