package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		 
		int input=121;
		int output=0,rem;
		for(int i=input;i!=0;i/=10) {
			rem=i%10;
			output=output*10+rem;
			}
		
		if(input==output) {
			System.out.println(input+" is a palindrome number");
		}
			else
				
			{
				System.out.println(input+" is not a palindrome number");
			}

}
}