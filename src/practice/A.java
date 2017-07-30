package practice;

public class A {
private int i = 6;
private int j = 1;
public A(){
	i = 5;
}
public static void main(String[] args) {
	A a = new A();
	System.out.println(a.i+a.j);
}
}
