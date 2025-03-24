package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Meedianarray {
	
	public static void main(String[] args) {
		
	
	
int[] a= {2,3,4,5,6};
		int[]b= {7,8,9,10,11,16};
		
	Arrays.sort(a);
		Arrays.sort(b);
   List<Integer> ll =  new ArrayList();
   
for (Integer i : a) {
	ll.add(i);
}
for (Integer l : b) {
	ll.add(l);
}
  for (Integer integer : ll) {
	//System.out.println(integer);
	
	
}
		double ss = ll.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println(ss);
	}
}
