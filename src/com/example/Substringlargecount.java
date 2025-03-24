package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Substringlargecount {
	
	// = {"programming", "cloud", "development", "microservices", "dev", "computing"};
	
	
	public static void main(String[] args) {
		
		String[] words = {"progrgram","pro", "cloud", "development", "microservices", "dev", "computing"};
	
	List<String> aa	=new ArrayList<>();
	for (int i = 0; i < words.length; i++) {
		for (int j = 0; j < words.length; j++) {
			if(i != j && words[i].contains(words[j])) {
				if(!aa.contains(words[i])) {
				aa.add(words[i]);}
		}
		}
}
	 OptionalInt sss = aa.stream().mapToInt(String::length).max(); 
	 aa.stream().filter(i->i.length()==sss.getAsInt()).collect(Collectors.toList()).forEach(i->System.out.println(i));
		
		
	}
	

}
