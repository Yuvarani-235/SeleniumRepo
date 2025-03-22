package week3.day1_assignment;

public class ChangesOddIndexCases {

	public static void main(String[] args) {
		String test="changeme";
		String output="";
		
		  for (int i = 0; i < test.length(); i++) {
	            char ch = test.charAt(i);
	            // If the index is odd, convert the character to uppercase
	            if (i % 2 != 0) {
	               output=output+ Character.toUpperCase(ch);
	            } else {
	               output=output+ch;
	            }
	        }
		  System.out.println(output);
		  }
	
	}