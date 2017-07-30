package practice;

public class Sequence {
 static String seq = "c";
 static{
	 seq+="g";
 }
 {
	 seq +="z";
 }
 public static void main(String[] args) {
	Sequence s1 = new Sequence();
	Sequence s2 = new Sequence();
	System.out.println(s1.seq);
}
}
