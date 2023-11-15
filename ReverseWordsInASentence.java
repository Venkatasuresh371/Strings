package com.jsp.strings;

public class ReverseWordsInASentence
{
	public static String reverseString(String str){
		// char ch[] = str.toCharArray();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args){
		System.out.println(reverseString("my name is khan"));
	}
}

