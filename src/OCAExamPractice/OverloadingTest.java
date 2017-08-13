package OCAExamPractice;

 class OverloadingTesta {
	 void m1(int x){
	        System.out.println("m1 int");
	    }
	    
	    void m1(double x){
	        System.out.println("m1 double");
	    }
	    
	    void m1(String x){
	        System.out.println("m1 String");
	    }
	    
	}

public class OverloadingTest {
    public static void main(String[] args) throws Exception {
        OverloadingTesta ot = new OverloadingTesta();
        ot.m1(1.0);
    }
}
