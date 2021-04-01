package codingPrepartatiaon;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a Number to check given Number prime or Not :");
		int givenNumber	=input.nextInt();
		
		int count=0;
		for(int i=1;i<givenNumber;i++)
		{
			if(givenNumber%2==0)
				count++;
		}

		if(count>1)
			System.out.println("Given Number is not a Prime Number !");
		else
			System.out.println("Given Number is Prime Number : "+givenNumber);
	}


	}

