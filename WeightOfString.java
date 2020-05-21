package com.may21;

public class WeightOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Manoj";
		s=s.toUpperCase();
		char charArray[]=s.toCharArray();
		int sum=0;
		for(char c:charArray) {
			int k=c;
			sum+=(64-k);
		}
		System.out.println("weight of given string is"+ sum);
		
	}

}
