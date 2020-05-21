package com.may21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StringPreserveInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String s="I am Java Developer";
		
		
        StringBuilder sb=new StringBuilder(s.replace(" ", ""));
		
		sb.reverse();
		
		List<Integer> listInt=new ArrayList<Integer>();
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i) == ' ') {
			 
				listInt.add(i);
			}
		}
	
		for(Integer i:listInt) {
			
			sb.replace(i, i+1," "+sb.charAt(i));
			
		}
		System.out.println(sb);		
				
		
	}

}
