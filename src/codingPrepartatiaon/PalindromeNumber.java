package codingPrepartatiaon;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a Number to check  it is palindrome or not : ");
		int givenNumber	=input.nextInt();
		
		int r,res=0,temp=givenNumber;
		while(givenNumber>0) {
			
			r=givenNumber%10;
			res=res*10+r;
			givenNumber=givenNumber/10;
		}
		
		if(res==temp)
			System.out.println("Given Number is a Palindrome");
		else
			System.out.println("Given Number is Not a Palindrome");
	}

}
