package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Aslist {
public static void main(String[] args) {
  List <String> list = Arrays.asList("a","B","d","c");
  Collections.sort(list);
  String[] array = list.toArray(new String[4]);
  for(String string: array)
	  System.out.println(string);
}
}
