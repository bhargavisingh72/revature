package OCAExamPractice;
class Writer {

	public  void write(String s){
		System.out.println("Writing");
	}
}

class Sa extends Writer{

	public  void write(String s){
		System.out.println("Writing Book");
	}
}


public class Programer extends Writer	{

	public  void write(String s){
		System.out.println("Writing Code");
	}
	public static void main(String[] args) {
		Writer w = new Programer();
		w.write("hii");
		Writer w1 = new Sa();
	w1.write("hiiiiii");
	}
}
