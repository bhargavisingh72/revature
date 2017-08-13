package OCAExamPractice;

class SampleClassA extends SampleClass{
	public int getHash(){
			return 999999;
		}
	}

class SampleClassB extends SampleClass{
	public int getHash(){
		return 999999;
	}
	}
public class SampleClass {

	
	
	
	public static void main(String[] args) {
		SampleClass sc,scA,scB;
		sc = new SampleClass();
		scA = new SampleClassA();
		scB = new SampleClassB();
		System.out.println("Hash is :"+sc.getHash()+","+scA.getHash()+","+scB.getHash());
	}
	
	public int getHash(){
		return 111111;
	}
}
