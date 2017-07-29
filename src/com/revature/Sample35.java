package com.revature;

public class Sample35 {
	 private String color; 
        public Sample35() { 
         this.color = "white"; 
        } 
        public Sample35(String color) { 
          this.color = "black"; 
        } 
        void method(Sample50 color){
        	this.color = "orange";
        }
       public static void main(String[] args) { 
    	   String col="yellow";
    	   Sample50 a=null;;
        Sample35 e = new Sample35(col); 
        e.method(a);
        System.out.println("Color:" + e.color);
        
        }
}
