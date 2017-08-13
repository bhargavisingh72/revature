package OCAExamPractice;

interface Z {

}

class Y extends X{
public String toString(){
	return "Y";
}
}
public class X implements Z{
public String toString(){
	return "X";
}
public static void main(String[] args) {
	Y y = new Y();
	X x = y;
	Z z = x;
	System.out.println(x);
	System.out.println((Y)x);
	System.out.println(z);
}
}
