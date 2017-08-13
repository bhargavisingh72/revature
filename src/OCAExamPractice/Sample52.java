package OCAExamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample52 {
	public static void main(String[] args) {
		
	
	List<Double> weights = new ArrayList<>();
	 weights.add(50.5); // [50.5]
	 weights.add(new Double (60)); // [50.5, 60.0]
	 weights.remove(50.5); // [60.0]
	 double first = weights.get(0); // 60.0
	 System.out.println(weights);
	 System.out.println(first);
	 
	 List<String> list = new ArrayList<>();
	  list.add("hawk");
	  list.add("robin");
	   Object[] objectArray = list.toArray();
	   System.out.println(objectArray.length); // 2
	   String[] stringArray = list.toArray(new String[0]);
	   System.out.println(stringArray.length); // 2
	   
	   String[] array = { "hawk", "robin" }; // [hawk, robin]
	    List<String> list1 = Arrays.asList(array); // returns fixed size list
	    System.out.println(list1.size()); // 2
	    list1.set(1, "test"); // [hawk, test]
	    array[0] = "new"; // [new, test]
	    for (String b : array) System.out.print(b + " "); // new test
	    //list1.remove(1); // throws UnsupportedOperation Exception
	   
	    List<String> list2 = Arrays.asList("one", "two");
	   System.out.println(list2);
	   
	   List<Integer> numbers = new ArrayList<>();
	   numbers.add(99);
	   numbers.add(5);
	   numbers.add(81);
	   Collections.sort(numbers);
	   System.out.println(numbers); //[5, 81, 99]
	   
	   
	   
	   
}
}
