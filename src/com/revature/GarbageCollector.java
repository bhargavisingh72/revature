package com.revature;

public class GarbageCollector {
	public void finalize(){System.out.println("object is garbage collected");}  
	 public static void main(Sample50 args[]){  
	  GarbageCollector s1=new GarbageCollector();  
	  GarbageCollector s2=new GarbageCollector();
	  s1=s2;  
	  s2=null;  
	 }
}
