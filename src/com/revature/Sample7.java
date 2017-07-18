package com.revature;

import java.util.ArrayList;

public class Sample7 {
	interface Process{

	    public void process(int a, int b);

	}

	 public class Data{

	    int value;

	    Data(int value){

	        this.value = value;
	    }
	    

	

	 	public void processList(ArrayList<Data> dataList, Process p){

	   for(Data d: dataList){

	        p.process(d.value, d.value);

	   
}
	 	}
	 }
	 }
