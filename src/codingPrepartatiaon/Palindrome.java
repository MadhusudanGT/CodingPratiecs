package codingPrepartatiaon;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in); 
		
		System.out.println("Enter a string to reverse !");
		String str=scan.nextLine();
		
		String temp="";
		
		for(int i=str.length()-1;i>=0;i--) {
			temp+=str.charAt(i);
		}
		
		if(str.equals(temp))
			System.out.println("Given String is Palindrome !");
		else
			System.out.println("Given String is Not Palindrome !");
	}

}
