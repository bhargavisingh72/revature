package practice;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		
	
char [] arr = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g'};
System.arraycopy(arr, 2,arr, 4,3);
System.out.println(new String(arr));

int[] array ={1,2,3,4,5,6,7,8,9};
System.arraycopy(array, 2, array, 4, 3);
String values = Arrays.toString(array);
System.out.println(values);

int[] arr1 = {1,2,3,4,5};
int[] arr2 = new int[5];
System.arraycopy(arr1,2,arr2,1,3);
String value = Arrays.toString(arr2);
System.out.println(value);
}
}
