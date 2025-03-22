package week3.day1_assignment;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElement {

	public static void main(String[] args) {
	
		int input[]= {1,4,3,2,8,6,7};
		Arrays.sort(input);		//sort the array
		
		int temp=1;
		
		for (int i = 0; i < input.length; i++) {
			System.out.println("Given array is "+input[i]);  		//print the sorted array
			
		}
		
		for (int j = 0; j< input.length; j++) {
			
			if(input[j]==temp){
				temp++;				
			}
			else {
				System.out.println("Missing element of the given array is "+temp);  //print the missing element
			break;
			
		}
		}

	}

}
