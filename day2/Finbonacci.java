package week1.day2;

public class Finbonacci {

	public static void main(String[] args) {
		int first=0,second=1,range=8,fib;
		
		for(int i=1;i<=range;i++) {
			
			System.out.println(first);
			fib=first+second;
			first=second;
			second=fib;
	}

}
}
