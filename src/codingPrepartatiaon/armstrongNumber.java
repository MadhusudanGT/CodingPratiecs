package codingPrepartatiaon;

import java.util.Scanner;

public class armstrongNumber {

	static void armstrongNumber(int number)
    {
        int temp=number;
    	int r=0,res=0;
    	while(number>0)
    	{
    		r=number%10;
    		res=res+r*r*r;
    		number=number/10;
    	}
    	if(temp==res)
    	System.out.println("Given Number is Armstrong Number !");
    	else
    		System.out.println("given Number is Not a Armstrong Number !");
    }
	
	public static void main(String[] args) {
		
		   System.out.println("Enter a Number to check it is Armstrong Number or not: ");
				
				Scanner input =new Scanner(System.in);
				int number=input.nextInt();
					armstrongNumber(number);

	}

}
