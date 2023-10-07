package com.jsp.strings;

public class CharacterCount 
{
	public static void main(String[] args)
	{
		String s1 = "aaabbbccccc";
		String s2="";
		char a[] = s1.toCharArray();
		char ch;
		int i=0;
		while(i<a.length)
		{
			ch = a[i];
			int count=1;
			while((i<a.length-1) && (a[i+1]==ch))
			{
				count++;
				i++;
			}
			s2=s2+count+ch+" ";
			i++;
		}
		System.out.println(s2);
	}
}
