package com.revature;


public class Sample24 {

int id;
String name;
public Sample24(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	
}


@Override
public String toString() {
	return "Sample24 [id=" + id + ", name=" + name + "]";
}


public static void main(String[] args) {
	Sample24 []sam = new Sample24[5];
    sam[0] = new Sample24(1,"irine");
    sam[1] = new Sample24(2,"bhargavi");
    sam[2] = new Sample24(3,"nithya");
    sam[3] = new Sample24(4,"kani");
    sam[4] = new Sample24(5,"angel");
    

    System.out.println(sam[0]);
    System.out.println(sam[1]);
    System.out.println(sam[2]);
    System.out.println(sam[3]);
    System.out.println(sam[4]);

}

}

