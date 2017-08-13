package OCAExamPractice;

class AA{
	public AA(){
		System.out.println("A");
	}
}	
	class BB extends AA{
		public BB(){
		System.out.println("b");	
		}
	}

public class CC extends BB{
	
public CC(){
	System.out.println("C");
}
public static void main(String[] args) {
	CC n=new CC();
}
}
