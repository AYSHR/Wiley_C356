package datastruc;

import java.util.HashMap;


public class hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("appe", 3);
		hm.put("grape", 2);
		hm.put("ale", 9);
		hm.put("ginger", 7);
		if(hm.containsKey("ginger"))
		System.out.println(hm.get("ginger"));
		
		else
			System.out.println("data isn't present");
		
	}

}
