package practice;

public class Rich {
public static void main(String[] args) {
	int i = 0;
	try{
		i+=1;
		e();
		i+=2;
	
	}
	catch(Exception e){
		i+=4;
	}
	System.out.println(i);
} 
private static void e(){
	throw new IllegalArgumentException();
}
}


