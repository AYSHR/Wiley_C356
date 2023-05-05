package collection;

import java.util.Set;
import java.util.TreeMap;

public class Treemapclass {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(1000, "start");
		tmap.put(100, "start1");
		tmap.put(2000, "start2");
		tmap.put(300, "start3");
		//sort in asc order and print of key
		System.out.println(tmap);
		System.out.println(tmap.firstKey());
		System.out.println(tmap.lastKey());
		
		Set<Integer> keyless=tmap.headMap(3000).keySet();
		Set<Integer> keyeqgr=tmap.headMap(3000).keySet();
	System.out.println(keyless);
	System.out.println( keyeqgr);
	}

}
