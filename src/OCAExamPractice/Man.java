package OCAExamPractice;
class Sample37 {
	  String var = "Main";

	  void printVar() {
	    System.out.println(var);
	  }
	}

	class Derived extends Sample37 {
	  String var = "AAA";

	  void printVar() {
	    System.out.println(var);
	  }
	}
	
public class Man {
	 public static void main(String[] args) {
		    Sample37 base = new Sample37();
		    Sample37 derived = new Derived();

		    System.out.println(base.var);
		    System.out.println(derived.var);
		    base.printVar();
		    derived.printVar();
		  }

}
