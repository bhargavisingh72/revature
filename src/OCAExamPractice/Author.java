package OCAExamPractice;
interface Employee{
	
}

interface Printable extends Employee{
	static String print(){
		return "abc";
	}
}

class Programmer  {
	protected String print(){
		return ("Programmer - Mala Gupta");
	}
}
public class Author extends Programmer implements Printable,Employee{
	
	public String print(){
		return ("Author - Mala Gupta");
	}
public static void main(String[] args) {
	System.out.println(Printable.print());
}
}
