package OCAExamPractice;

public class Ordr {
String value = "t";
{
	value+="a";

}
{
	value +="c";
}
public Ordr(){
	value+="b";
}
public Ordr(String s){
	value+=s;
}
public static void main(String[] args) {
	Ordr order = new Ordr("f");
	order = new Ordr();
	System.out.println(order.value);
}
}
