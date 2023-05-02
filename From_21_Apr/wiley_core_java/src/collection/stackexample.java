package collection;

import java.util.Iterator;
import java.util.Stack;

public class stackexample {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		for (int i = 1; i <=10;	i++) {
			st.push(i);
		}
		st.add(11);
		st.push(null);
		System.out.println(st.peek());
		// we can iterate w/o removing ele
		Iterator<Integer> itr = st.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("values inserted ");
		System.out.println("element 2 present in stack at index :" + st.search(2));
		System.out.println("elemet at top :" + st.peek());
		System.out.println("elements  present in stack :");
		// to print :System.out.println(st);
		while (!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}
		System.out.println("is stack empty now ? " + st.empty());
		// as vector doubles its size to add ele
		System.out.println(st.capacity());

	}

}
