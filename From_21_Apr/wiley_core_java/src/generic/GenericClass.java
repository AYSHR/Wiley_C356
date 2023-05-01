package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {
	/*
	 * public static <T> void shout(T shoutout) { System.out.println(shoutout+
	 * " !!! "); }
	 */
// WE CAN MAKE RETURN TYPE AS T and V
	public static <T, V> T shout(T shoutout, V value) {
		System.out.println(shoutout + " .... " + value);
	return shoutout;
	}

	public static void main(String[] args) {
		/*
		 * Printer<Cat> printer=new Printer(new Cat()); printer.print(); Printer<Dog>
		 * printer1=new Printer(new Dog()); printer1.print(); ArrayList<Object> cats=new
		 * ArrayList<>(); cats.add(new Cat()); cats.add(new Cat()); cats.add(new Dog());
		 * }
		 */
		/*
		 * shout("string passed"); shout(23.89d); shout(12.f); shout(true);
		 */
		List<Integer> intlist=new ArrayList<>();
		intlist.add(3);
		intlist.add(7);
		printlist(intlist);
		List<Object> list=new ArrayList<>();
		list.add(new Cat());
		list.add(new Cat());
		printlist(list);
		shout("amount", 87000);
		
	}

	private static void printlist(List<?> intlist) {
	System.out.println(intlist);
		
	}
}
