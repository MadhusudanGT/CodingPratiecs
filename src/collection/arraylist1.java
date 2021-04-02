package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class arraylist1 {

	public static void main(String[] args) {
//			ArrayList<Integer> array=new ArrayList<Integer>();
		   
			 HashSet<Integer> array = new HashSet<Integer>();
			    
			    // Creating an Array of HashSet size
//			    String[] array = new String[hashset.size()];
			    // Converting HashSet to Array using toArray() method
//			    hashset.toArray(array);
			    
			array.add(1);
			array.add(2);
			array.add(9);
			array.add(3);
			array.add(17);
	        array.add(6);
	        array.add(9);
	        array.add(7);
	        array.remove(7);
	        
	     // Converting LinkedList to ArrayList
		    List<Integer> list = new ArrayList<Integer>(array);
		    
		    
	        Collections.reverse(list);
			for(Integer c:array) {
				System.out.println(c+" ");
			}
			System.out.println(array.size());
			if(array.contains(9)) {
				System.out.println("9 is a part of this array");
			}
			else {
				System.out.println("9 is not part of this collection");
			}
//			
//			Collections.sort((List<String> array);
//			System.out.println(Arrays.asList(array));
//			System.out.println(array.toArray());
	}

}
