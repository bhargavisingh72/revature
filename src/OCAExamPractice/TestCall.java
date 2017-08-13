package OCAExamPractice;


class Caller {
public void init(){
	System.out.println("Initialized");
}
public void start(){
	init();
	System.out.println("Started");
}
}
public class TestCall {
public static void main(String[] args) {
	Caller caller= new Caller();
	caller.start();
	caller.init();
}
}
