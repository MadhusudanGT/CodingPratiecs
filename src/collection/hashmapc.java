package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashmapc {

	public static void main(String[] args) {
		   HashMap<String,String> hashmap = new HashMap<String,String>();
		   hashmap.put("1", "Value1");
		    hashmap.put("2", "Value2");
		    hashmap.put("3", "Value3");
		    hashmap.put("4", "Value4");
		    hashmap.put("5", "Value5");
		    for(String s:hashmap.keySet()) {
		    	System.out.println(s+" ...get key...."+hashmap.get(s));
		    }
		    Set<String> keyset=hashmap.keySet();
		    Iterator<String> itr=keyset.iterator();
		    while (itr.hasNext()) {
				String key=itr.next();
				System.out.println("key.."+key+"...value..."+hashmap.get(key));
			}
	}

}
