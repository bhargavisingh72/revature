package com.practice;

public class Programmer extends Writer	{

	public static void write(){
		System.out.println("Writing Code");
	}
	public static void main(String[] args) {
		Writer w = new Programmer();
		w.write();
		Writer w1 = new Author();
	w1.write();
	}
}
