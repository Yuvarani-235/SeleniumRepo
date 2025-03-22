package week3.day1_assignment;

import java.util.Arrays;

	public class Anagram 
		{

	public static void main(String[] args) 
	
		{
		String text1="stops";
		String text2="potss";
		
		if(text1.length()==text2.length())
		{
			char[]a=text1.toCharArray();
			char[]b=text2.toCharArray();
		
			Arrays.sort(a); 
		
			Arrays.sort(b);
		
			boolean result= Arrays.equals(a, b);
			
			if(result)
			{
				System.out.println("Given string is angram");
			}
			else
			{
		
				System.out.println("Given string is not an anagram");
			}
			}
		else
		{
			System.out.println("its not an anagram");
		}
		}

		}
