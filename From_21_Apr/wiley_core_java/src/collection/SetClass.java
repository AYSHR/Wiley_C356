package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("java");
		hs.add("Java");
		hs.add("PYTHON");
		hs.add("MYSQL");
		hs.add("java");
		Set<String> ts=new TreeSet<>();
		ts.add("go");
		ts.add("ruby");
		ts.add("pi");
		ts.add("MYSQL");
		ts.add("java");
		System.out.println(hs);
		// IOF WE ADD TWO SAME VAL THEN ALSO IT'LL GIVE OP AS SINGLE VLA
System.out.println(ts);
//treeset is sorted
	}

}
