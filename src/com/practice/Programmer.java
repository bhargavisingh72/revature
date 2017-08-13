package com.practice;

public class Programmer extends Writer	{

	public  void write(String s){
		System.out.println("Writing Code");
	}
	public static void main(String[] args) {
		Writer w = new Programmer();
		w.write("hii");
		Writer w1 = new Author();
	w1.write("hiiiiii");
	}
}
