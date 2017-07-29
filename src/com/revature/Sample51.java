package com.revature;

import java.util.ArrayList;
import java.util.List;

public class Sample51 {
	public static void main(String[] args) {
		
	
	List<String> birds = new ArrayList<>();
	
	 birds.add("hawk"); // [hawk]
	 birds.add(1, "robin"); // [hawk, robin]
	 birds.add(0, "blue jay"); // [blue jay, hawk, robin]
	 birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
	 System.out.println(birds); // [blue jay, cardinal, hawk, robin]
	 
	 birds.add("hawk"); // [hawk]
	  birds.add("hawk"); // [hawk, hawk]
	  System.out.println(birds.remove("cardinal")); // prints false
	  System.out.println(birds.remove("hawk")); // prints true
	  System.out.println(birds.remove(0)); // prints hawk
	  System.out.println(birds); // []
	  
	  birds.add("hawk"); // [hawk]
	   System.out.println(birds.size()); // 1
	   birds.set(0, "robin"); // [robin]
	   System.out.println(birds.size()); // 1
	   //birds.set(1, "robin"); // IndexOutOfBoundsException

	
	System.out.println(birds.isEmpty()); // true
	System.out.println(birds.size()); // 0
	birds.add("hawk"); // [hawk]
	birds.add("hawk"); // [hawk, hawk]
	System.out.println(birds);
	
	birds.add("hawk"); // [hawk]
	birds.add("hawk"); // [hawk, hawk]
	System.out.println(birds.isEmpty()); // false
	System.out.println(birds.size()); // 2
	birds.clear(); // []
	System.out.println(birds.isEmpty()); // true
	System.out.println(birds.size()); // 0
	
	
	birds.add("hawk"); // [hawk]
	System.out.println(birds.contains("hawk")); // true
	System.out.println(birds.contains("robin")); // false
	
	List<String> one = new ArrayList<>();
	List<String> two = new ArrayList<>();
	 System.out.println(one.equals(two)); // true
	 one.add("a"); // [a]
	 System.out.println(one.equals(two)); // false
	 two.add("a"); // [a]
	 System.out.println(one.equals(two)); // true
	 one.add("b"); // [a,b]
	 two.add(0, "b"); // [b,a]
	 System.out.println(one.equals(two)); // false
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
