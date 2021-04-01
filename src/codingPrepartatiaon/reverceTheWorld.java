package codingPrepartatiaon;

import java.util.Arrays;

public class reverceTheWorld {

	public static void main(String[] args) {
		
		String s="this world is good";
		String result=reverce(s);
		 
//	        System.out.println(ar1);
	        String[] words = result.split(" ");

	        for(int i=words.length-1;i>=0;i--) {
	        	System.out.print(words[i]+" ");
	        }
	}
	
	public static String reverce(String str){
		char ch[]=str.toCharArray(); 
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    return rev;  
	}  
	   
	}




