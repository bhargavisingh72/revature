package com.practice;

public class Index {
public static void main(String[] args) {
	

	int nums1[] = new int[3];

	int nums2[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	nums1 = nums2;
	for(int x :nums1){
		System.out.println(x+":");
	}
  }	
}
