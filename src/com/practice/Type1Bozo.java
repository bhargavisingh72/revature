package com.practice;

public class Type1Bozo implements Bozo{
 
	 Type1Bozo(){
		System.out.println("hii");
	}
	public void jump(){
		final int type = 1;
		System.out.println("jumping"+type);
	}
	public static void main(String[] args) {
		Type1Bozo b = new Type1Bozo();
		b.jump();
	}
	
	
}
