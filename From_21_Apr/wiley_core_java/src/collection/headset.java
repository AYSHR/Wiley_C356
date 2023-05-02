package collection;

import java.util.TreeSet;

public class headset {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("h");
		ts.add("a");
		ts.add("b");
		ts.add("w");
	//	ts.add("a");
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts);
		// headset return value less than specified value 
		System.out.println(ts.headSet("h"));
		//tailset gives value greater or equal than val
		System.out.println(ts.tailSet("h"));
		System.out.println(ts.last().compareTo(ts.first()));
		
	}

}
