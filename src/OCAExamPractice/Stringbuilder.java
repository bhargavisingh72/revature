package OCAExamPractice;

public class Stringbuilder {
	
   static  String op(String ss)
	{
			return new  StringBuilder(ss).reverse().toString();
			}

	
	
	public static void main(String[] args) {
		
		System.out.println(op("bhargavi"));
		
		
		
	
	     /*String alpha="";
	     for(char current = 'A'; current <= 'Z'; current++)
	      alpha += current;
	      System.out.println(alpha);
	      
	      StringBuilder alpha1 = new StringBuilder();
	      for(char current = 'a'; current <= 'z'; current++)
	      alpha1.append(current);
	      System.out.println(alpha1);
	      
	      StringBuilder sb = new StringBuilder("start");
	      sb.append("+middle"); // sb = "start+middle"
	      StringBuilder same = sb.append("+end");  // "start+middle+end"
	      System.out.println(same);
	      
	      StringBuilder a = new StringBuilder("abc");
	       //StringBuilder b = new StringBuilder(a.append("de"));
	      StringBuilder b = a.append("de");
	      b = b.append("f").append("g");
	      System.out.println("a=" + a);
	      System.out.println("b=" + b);
	      
	      StringBuilder sb1 = new StringBuilder();
	      StringBuilder sb2 = new StringBuilder("animal");
          System.out.println(sb1);
	      System.out.println(sb2);

	
	      StringBuilder s = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
	      System.out.println(s.capacity());
	      
	      StringBuilder s1 = new StringBuilder(10);
	      //System.out.println(s1.);
	      System.out.println(s1.append("asdfghjkkl"));
	      
	      StringBuilder sb11 = new StringBuilder("animals");
	      String sub = sb11.substring(sb11.indexOf("a"), sb11.indexOf("al"));
	      int len = sb11.length();
	      char ch = sb11.charAt(6);
	      System.out.println(sub + " " + len + " " + ch);
	      
	      StringBuilder sb22 = new StringBuilder().append(1).append('c');
	      sb22.append("-").append(true);//In StringBuilder ,assignment is not needed
	      System.out.println(sb22); // 1c-true
	      
	      StringBuilder sb12 = new StringBuilder("animals");
	       sb12.insert(7, "-"); // sb12 = animals-
	       sb12.insert(0, "-"); // sb12 = -animals-
	       sb12.insert(4, "-"); // sb12 = -ani-mals-
	       sb12.insert(10, "c");// sb12 = -ani-mals-c
	       System.out.println(sb12);
	       
	       StringBuilder sb13 = new StringBuilder("abcdef");
	       sb13.delete(1, 3); // sb13 = adef
	       //sb13.deleteCharAt(5); // throws an exception-StringIndexOutOfBoundsException: String index out of range: 5
	       System.out.println(sb13);
	       
	       StringBuilder sb14 = new StringBuilder("ABC");
	       sb14.reverse();
	       System.out.println(sb14);
	
	       String sb141 = sb13.toString();    // To convert StringBuilder to String
	       System.out.println(sb141);
	       
	       StringBuilder one = new StringBuilder();
	       StringBuilder two = new StringBuilder();
	       StringBuilder three = one.append("a");
	       System.out.println(one == two); // false
	       System.out.println(one == three); // true
	       */
	       //String x = "Hello World";
		/*Scanner sc =  new Scanner(System.in);
	String	s=sc.nextLine();
	      StringBuilder s1=new StringBuilder(s).reverse();*/
	      
	      
	       
	      
	    	  
	      
	      // String [] var = x.split("",5);
	     // String s =Arrays.toString(var);
	       
	     //  System.out.println(s1); // true
	       
	      /* String x1 = "Hello World";
	       String z = " Hello World".trim();
	       System.out.println(x1==z); //false
	       System.out.println(x1.equals(z)); // true
	       
	       String x2 = new String("Hello World");
	       String y2 = "Hello World";
	       System.out.println(x2 == y2); // false
           */
	      
	}
}

