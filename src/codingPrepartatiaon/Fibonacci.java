package codingPrepartatiaon;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
Scanner input =new Scanner(System.in);
System.out.println("Enter a Number to check fibonacci series :");
int givenNumber	=input.nextInt();
for(int i=1;i<=givenNumber;i++)
	System.out.print(fib(i)+" ");
	}

	static int fib(int n) {
		if(n==1) 
		{
			return 0;
		}
		else if(n==2 || n==3) 
		{
			return 1;
		}
		else return fib(n-1)+fib(n-2);
		}
}
