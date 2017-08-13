package OCAExamPractice;

class Apple {

}

class Bat extends Apple{

}

class Cup extends Bat{

}

class Dad extends Cup{

}
public class Ee {

	public static void main(String args[]){

	    Bat b = new Cup();
        //Dd d = new Dd();
	    Apple a = b;
	   // Aa c = d;

	    if (a instanceof Apple) System.out.println("A");

	    if (a instanceof Bat) System.out.println("B");

	    if (a instanceof Cup) System.out.println("C");  

	  if (a /*c*/instanceof Dad) System.out.println("D");

	  }
}
