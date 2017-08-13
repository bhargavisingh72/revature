package com.practice;

public class Son extends Father{

	public int h = 44;

    public int getH() {

        System.out.println("Son " + h);

        return h;

    }

    public static void main(String[] args) {

        Father b = new Son();

        System.out.println(b.h + " " + b.getH());

        /*Son bb =  (Son) b;

        System.out.println(bb.h + " " + bb.getH());
*/
    }
}
