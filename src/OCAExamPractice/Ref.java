package OCAExamPractice;

import java.util.ArrayList;
import java.util.List;

interface Contract{}

class Super implements Contract{}

class Subb extends Super{}


public class Ref {
	
	public static void main(String[] args) {
		List objs = new ArrayList();
		
		Contract  c1 = new Super();
		Contract c2 = new Subb();
		Super s1 = new Subb();
		
		objs.add(c1);
		objs.add(c2);
		objs.add(s1);
		
		for(Object itm : objs){
			System.out.println(itm.getClass().getName());
}
		
	}

}
