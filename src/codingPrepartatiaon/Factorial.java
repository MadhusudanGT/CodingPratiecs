package codingPrepartatiaon;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.print("Type number to to find the factorial of given number");
		Scanner input =new Scanner(System.in);
		int number=input.nextInt();
		
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of Given Number is : "+fact);
		


	}

}
