package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Uniquevent {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("rose");
		list.add("rose");
		list.add("lily");
		list.add("jasmine");
		HashSet<String> hs = new HashSet<>();
		hs.addAll(list);
		System.out.println("non-repeated val :"+ hs);
		LinkedHashSet<String> link=new LinkedHashSet();
		link.addAll(list);
		System.out.println(link);
		
	}

}
