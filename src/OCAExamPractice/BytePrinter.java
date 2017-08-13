package OCAExamPractice;

public class BytePrinter {
public void print(byte b){
	System.out.println("byte");
}
public void print(Byte b){
	System.out.println("Byte");
}
public void print(int i){
	System.out.println("int");
}
public static void main(String[] args) {
	BytePrinter printer = new BytePrinter();
	short x = 10;
	Byte y = 12;
	byte z = 14;
	printer.print(x);
	printer.print(y);
	printer.print(z);
}
}
