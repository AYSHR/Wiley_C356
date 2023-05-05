package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Failsafe {

	public static void main(String[] args) {
		ConcurrentHashMap hm=new ConcurrentHashMap<>();
	hm.put(1, "a");
	hm.put(2, "b");
	Iterator itr= hm.keySet().iterator();
	while(itr.hasNext()) {
		int key=(Integer)itr.next();
		System.out.println(key+": "+hm.get(key));
		hm.put(3,"c" );
	}
	
	
	}

}
