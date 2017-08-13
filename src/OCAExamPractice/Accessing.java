package OCAExamPractice;

public class Accessing {

	public static void main(String[] args) {
		
	
	int ax = 10,az = 30;
	int aw=6,ay=1;
	try{
		aw = ax%2;
		ay = az/aw;
	}
	catch(ArithmeticException e1){
		System.out.println("INVALID DIVISOR");
	}
	catch(Exception e2){
		aw = 1;
		System.out.println("DIVISOR CHANGED");
	}
	ay =az/aw;
	System.out.println("SUCCESSFULL DIVISION"+ay);
	}
}
