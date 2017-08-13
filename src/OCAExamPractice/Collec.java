package OCAExamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collec {
public static void main(String[] args) {
	/*List<String> hex = Arrays.asList("30","8", "3A", "FF");
	Collections.sort(hex);
	
	System.out.println(hex);*/
	List<Integer> ages = new ArrayList<>();
	 ages.add(Integer.parseInt("5"));
	
	
	 ages.add(Integer.valueOf("6"));
	 ages.add(7);
	 ages.add(null);
	 for (int age : ages) System.out.print(age);
}

}

