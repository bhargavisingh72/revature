package OCAExamPractice;

import java.util.ArrayList;
import java.util.List;

public class ScopeTest {
/*	public static void main(String[] args) {
		
      

	List<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(14);
	for(int x:list)
	{
		System.out.println(x+",");
		break;
	}
	}*/
int z;

public static void main(String[] args) {
	ScopeTest myscope = new ScopeTest();
	int z = 6;
	System.out.println(z);
	myscope.doStuff();
	System.out.println(z);
	System.out.println(myscope.z);
	}


void doStuff(){
	int z = 5;
	doStuff2();
	System.out.println(z);
}
	void doStuff2(){
		int z = 4; 
	}
}
