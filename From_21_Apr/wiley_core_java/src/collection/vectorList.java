package collection;

import java.util.*;

public class vectorList {
	public static void main(String[] args) throws InterruptedException {

		int size = 1000000;
		List<Integer> arraylist = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			arraylist.add(i);
		}
		long end = System.currentTimeMillis();
		// in single threaded environment arraylist works fine
		// System.out.println(arraylist.size());
		System.out.println("time to add values in arraylist:" + (end - start));

		List<Integer> v = new Vector<>();
		start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			v.add(i);
		}
		end = System.currentTimeMillis();

		System.out.println("time to add values in vector:" + (end - start));
//multi-threaded env.
		// it'll print less thread no as it isn't thread safe
		// List<Integer> multithreadedarraylist=new ArrayList<>();
		// by using this function we can ensure work is done completely
		List<Integer> multithreadedarraylist = Collections.synchronizedList(new ArrayList<>());
		start = System.currentTimeMillis();
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multithreadedarraylist.add(i);
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multithreadedarraylist.add(i);
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(multithreadedarraylist.size());
		end = System.currentTimeMillis();

		System.out.println("time to add values in multi-threaded arraylist:" + (end - start));

		List<Integer> multithreadedvector = new Vector<>();
		start = System.currentTimeMillis();
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multithreadedvector.add(i);
			}
		});
	//	multithreadedvector
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multithreadedvector.add(i);
			}
		});
		t3.start();
		t4.start();
		t3.join();
		t4.join();
		System.out.println(multithreadedvector.size());
		end = System.currentTimeMillis();

		System.out.println("time to add values in multi-threded vector:" + (end - start));
	}

}
