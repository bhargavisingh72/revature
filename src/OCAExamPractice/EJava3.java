package OCAExamPractice;

class Baase {

	String var = "EJava";
	
	void printVar(){
		System.out.println(var);
	}
}

class Deerived extends Baase{

	String var = "Guru";
	
      void printVar(){
    	  System.out.println(var);
      }
	
}


class EJavaBase {

	void myMethod() throws ExceptionInInitializerError {
		System.out.println("Base");
		}
		}
		class EJavaDerived extends EJavaBase {
		void myMethod() throws RuntimeException {
		System.out.println("Derived");
		}
		}
		
public class EJava3 {

	public static void main(String args[]) {
		EJavaBase obj = new EJavaDerived();
		obj.myMethod();
		}
}
