package com.practice;

public abstract class Test {
	public static void main(String[] args) throws Exception {
        Data d1 = new Data(10);
        d1.strVal = "D1";
        Data d2 = d1;
        d2.intVal = 20;
        System.out.println("d2 val = "+d2.strVal);
    }
}
