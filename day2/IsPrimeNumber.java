package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num=13,count=0;
		if(num==0||num==1) {
			System.out.println(num+" "+"is not a prime number");
		}
		
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==1) {
			System.out.println(num+" "+"is a prime number");
		}
		else {
			System.out.println(num+" "+"is not a prime number");
		}
	}
}