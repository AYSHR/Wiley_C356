package collection;

import java.util.HashMap;
import java.util.Map;

public class MapClasses {

	public static void main(String[] args) {
		/*
		 * Map<String,String> hm=new HashMap<String,String>(); hm.put("c","a");
		 * hm.put("a",null); hm.put("b",null); hm.put(null,null); hm.put("1","a"); //
		 * null can be accepted as key //the next null will be overwritten by new
		 * //hm.put(null,"a"); System.out.println(hm);
		 */
		
		Map<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("apple",1);
		hm.put("ape",3);
		hm.put("ple",2);
		hm.put("aple",7);
		System.out.println(hm);
		hm.remove("aple");
		System.out.println(hm);
		hm.putIfAbsent("abcd", 10);
		System.out.println(hm);
		hm.replace("abcd", 98);
		System.out.println(hm);
		System.out.println(hm.get("red"));
		System.out.println(hm.get("ape"));
		System.out.println(hm.containsKey("red"));
		System.out.println(hm.containsValue(1));
	}

}
