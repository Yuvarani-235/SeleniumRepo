package week3.day1_assignment;

public class Palindrome {
	
	

	public static void main(String[] args) {
		int input=121;
		int reverse_number=0;
		
		
		for(int a=input;a!=0;a=a/10)
		{
		int rem=a%10;
		reverse_number = reverse_number*10+rem;
	}
	if(input==reverse_number)
	{
		System.out.println (input+" is a Palindrome number");
		
	}
	
	else
		System.out.println(input+" is not a Palindrome number");
		
	}

}
