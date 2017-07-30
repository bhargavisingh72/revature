package practice;

public class Pet {
	String s = null;
	//static in 123;
    //void char = '3';
    byte b1 = 2;
    int c1$ = b1;
    //short s1 = c1$;
    long e_2 = c1$;
public void eat() throws NullPointerException{
	throw new NullPointerException();
	}
public static void main(String[] args) {
	Pet pet = new Pet();
	pet.eat();
	System.out.println("pet just ate");
	
	}

}
