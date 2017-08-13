package OCAExamPractice;

import java.util.ArrayList;
import java.util.List;

 interface Contrat {

}


class Sooper implements Contrat{

}


class Sbb extends Sooper{

}

public class Refe {

	public static void main(String[] args) {
		
		List obj = new ArrayList();
		
		Contrat c1 = new Sooper();
		Contrat c2 = new Sbb();
		Sooper s1 = new Sbb();
		
		obj.add(c1);
		obj.add(c2);
		obj.add(s1);
		
		for(Object item : obj){
			
			System.out.println(item.getClass().getName());
		}
	}
}
