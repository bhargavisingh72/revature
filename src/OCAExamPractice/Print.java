package OCAExamPractice;

public class Print {

	void method() {
		try {
		guru();
		return;
		} finally {
		System.out.println("finally 1");
		}
		}
		void guru() {
		System.out.println("guru");
		throw new StackOverflowError();
		}
		public static void main(String args[]) {
		Print var = new Print();
		var.method();
		}


}
