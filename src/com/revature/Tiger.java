package com.revature;

import java.util.Arrays;

public class Tiger {
public static void main(String[] args) {
	 Tiger t1 = new Tiger();
     Tiger t2 = new Tiger();
     Tiger t3 = t1;
     System.out.println(t1 == t1); // true
     System.out.println(t1 == t2); // false
     System.out.println(t1.equals(t2)); // false
     System.out.println(t1==t3); //true
     
    String [] bugs = { "cricket", "beetle", "ladybug"} ;
     String [] alias =bugs;
     System.out.println(bugs==alias); // true
     System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
     
     String names[] = new String[2];
     System.out.println(Arrays.toString(names));
     
     /*String[] strings = { "stringValue" };
      Object[] objects = strings;
      String[] againStrings = (String[]) objects;
      againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
      objects[0] = new StringBuilder(); // careful!*/
     
     String[] mammals = {"appalam", "biscuit", "chips"};
      System.out.println(mammals.length); // 3
      System.out.println(mammals[0]); // appalam
      System.out.println(mammals[1]); // biscuit
      System.out.println(mammals[2]); // chips
      
      String[] birds = new String[6];
      System.out.println(birds.length);
      
      int[] numbers = new int[10];
       for (int i = 0; i < numbers.length; i++){
    	       
    	numbers[i] = i + 5;
    	i++;
       }
       System.out.println(Arrays.toString(numbers));
       
       int[] numbers1 = { 6, 9, 1 };
       Arrays.sort(numbers1);
       for (int i = 0; i < numbers1.length; i++)
       System.out.print (numbers1[i] + " ");
       
       String[] strings = { "10", "9", "100" };
       Arrays.sort(strings);
       for (String string : strings)
       System.out.print("\n"+string + " ");
       
       int[] numbers11 = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers11, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers11, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers11, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers11, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers11, 9)); // -5
        
        int[] numbers111 = new int[] {3,2,1};
         System.out.println(Arrays.binarySearch(numbers111, 2));//1
         System.out.println(Arrays.binarySearch(numbers111, 3));//(-4)unpredictable
         
         
       
}
}

