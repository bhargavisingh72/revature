package com.practice;

public class Car extends Vehicle{
int y = 20;
Car(){
	super();	
}
Car(int y){
	this.y = y;
}
public String toString(){
	return super.x+","+this.y;
}
public static void main(String[] args) {
	Vehicle y = new Car();
	System.out.println(y);
}
}
