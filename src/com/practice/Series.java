package com.practice;

public class Series {

	private boolean flag=true;
	
	public void display(){
		int num = 2;
		
		while(flag==true){
			if(num%7==0)
				flag = false;
		
			System.out.println(num);
			num+=2;
			
		}
	}
	
	public static void main(String[] args) {
		new Series().display();
	}
}
