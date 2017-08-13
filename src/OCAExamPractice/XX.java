 package OCAExamPractice;

public class XX {
String str = "default";
XX(String s){
	str = s;
}
void print(){
	System.out.println(str);
}
public static void main(String[] args) {
	
	new XX("Hello").print();
}
}