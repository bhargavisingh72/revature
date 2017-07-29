package com.revature;

public class Sample2 {
	public int base;
	public int height;
	
	public Sample2(int pBase,int pHeight){
		this.base=pBase;
		this.height=pHeight;
		updateArea();

	}
	public void updateArea(){
	    double a=base*height/2;
	    System.out.println("Result:"+a);
	}
	public static void main(String... args) {
		new Sample2(4,6);
	}
}
