package OCAExamPractice;

class Daata {
	  int intVal = 0;
	    String strVal = "default";
	    public Daata(int k){
	        this.intVal = k; 
	    }
}

public abstract class Tests {
	public static void main(String[] args) throws Exception {
        Daata d1 = new Daata(10);
        d1.strVal = "D1";
        Daata d2 = d1;
        d2.intVal = 20;
        System.out.println("d2 val = "+d2.strVal);
    }
}
