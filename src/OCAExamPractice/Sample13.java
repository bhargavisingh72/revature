package OCAExamPractice;

public class Sample13 {
     static boolean a;
     static boolean b;
     static boolean c;
     
     
     
     void call(){
    	if((a=false)&&(b=false)||(c=true)){
    	System.out.println("a = "+a); 
    	System.out.println("b = "+b);
    	System.out.println("c = "+c);
 	   	
    	 }
    
     }

public static void main(String[] args) {
	Sample13 s= new Sample13();
	s.call();
}


}
