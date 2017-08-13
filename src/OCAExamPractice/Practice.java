package OCAExamPractice;

class Parent {
	void fly() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void fly() {
		System.out.println("Child");
	}
}

public class Practice {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.fly();
		Child c = new Child();
		c.fly();
	   Child pp = (Child) c;
		pp.fly();
		Child cc = (Child) p;

	}
}
