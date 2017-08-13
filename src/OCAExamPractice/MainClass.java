package OCAExamPractice;

class Sample39 {
    void myMethod() throws ExceptionInInitializerError { 
        System.out.println("Base"); 
    } 
 } 
class MainDerived extends Sample39 { 
    void myMethod() throws RuntimeException { 
        System.out.println("Derived"); 
    } 
 }


public class MainClass {
    public static void main(String args[]) { 
        Sample39 obj = new MainDerived(); 
        obj.myMethod(); 
    }
}
