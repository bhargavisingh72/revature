package com.revature;

public class Sample18 {
	int a = 10;
	int b = 20;
  public static void main(String[] args) {
	new Sample18().print();
	}
  
  public void print(){
	  
	  pass(a);
  }
  
  
  public void pass(int a){
	  int c = b/a;
	  System.out.print(c);
  }
}
