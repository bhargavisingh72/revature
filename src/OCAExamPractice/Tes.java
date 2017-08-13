package OCAExamPractice;

class XXXXXX {
	public XXXXXX(){

        System.out.println("In X");

    }
}

class YYYYYY extends XXXXXX{

    public YYYYYY(){

        super();

        System.out.println("In Y");

    }

}

class ZZZZZZ extends YYYYYY{

    public ZZZZZZ(){

        System.out.println("In Z");

    }}


public class Tes {
	   public static void main(String[] args) {

	        YYYYYY y = new ZZZZZZ();  

	  }
}
