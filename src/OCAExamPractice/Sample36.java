package OCAExamPractice;

public class Sample36 {
	  void method() {
		    try {
		      myMethod();
		      return;
		    } finally {
		      System.out.println("finally 1");
		    }
		  }

		  void myMethod() {
		    System.out.println("myMethod");
		    throw new StackOverflowError();
		  }

		  public static void main(String args[]) {
		    Sample36 var = new Sample36();
		    var.method();
		  }
}
