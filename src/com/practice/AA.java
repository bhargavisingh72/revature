package com.practice;

public class AA {
private int i = 6;
private int j = 1;
public AA(){
	i = 5;
}
public static void main(String[] args) {
	AA a = new AA();
	System.out.println(a.i+a.j);
}
}
