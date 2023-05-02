package collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueclass {

	public static void main(String[] args) {
	 Queue<Integer> que=new PriorityQueue<>();
	 que.add(1);
	 que.add(2);
	 que.add(5);
	 que.add(4);
	 que.add(3);
	 System.out.println(que);
	 
	 System.out.println( "dqueue ele: ");
	 Deque<String> dq=new LinkedList<>();
	 dq.add("a");
	 dq.add("b");
	 dq.addFirst("c");
	 dq.addLast("e");
	 dq.add("d");
	 System.out.println(dq);
	 dq.removeFirst();
	 dq.removeLast();
	 System.out.println("after removal :"+dq);

	}

}
