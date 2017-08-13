package OCAExamPractice;


class StringWrapper {

	
	private String theVal;    

	public void StringWrapper(String str){ this.theVal = str; 
}
}

public class Tester {

	public static void main(String[] args) {        

		StringWrapper sw = new StringWrapper();        

		StringBuilder sb = new StringBuilder("How are you?");        

		System.out.println("Hello, "+sw);        

		System.out.println("Hello, "+sb);    }
}
