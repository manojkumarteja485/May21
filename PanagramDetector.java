package com.may21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PanagramDetector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="kumar Jonam";
		
		s=s.toUpperCase().replace(" ", "");
		char[] charArray=s.toCharArray();
		
		List<Integer> integerList=new ArrayList<Integer>();
		
          for(char c:charArray) {
			
			if(String.valueOf(c).matches("^[a-zA-Z]*$")) {
				
				integerList.add(c-64);
				
			}
          }
		
		System.out.println(integerList);
		
		
		for(int i=1; i <26 ;i++) {
			
			if(!integerList.contains(i)) {
				int k=96+i;
				char j=(char) k;
				System.out.println(j);
				
			}
		}
		}
	}


