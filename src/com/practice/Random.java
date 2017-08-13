package com.practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Random {		
	public static void main(String[] args) {
		/*Base base = new Base();
		Base derived = new Derived();
		System.out.println(base.var);
		System.out.println(derived.var);
		base.printVar();
		derived.printVar();*/
		
		/*ArrayList<Integer> list = new ArrayList<>(1);
		list.add(1001);
		list.add(1002);
		System.out.println(list.get(list.size()));*/
		
		
		
		String[] strs = new String[2];
		int idx = 0;
		for(String s : strs){
			strs[idx].concat("element" +idx);
			idx++;
		}
		
		for(idx=0;idx<strs.length;idx++){
			System.out.println(strs[idx]);
		
		}	
		
	}
}
