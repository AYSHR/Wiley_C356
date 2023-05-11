package Assignment;

import Assignment.Studentlist.Node;

public class primelinkedlist {
	static Node head;

	static class Node {
		int prime;
		Node next;

		Node(int num) {
			this.prime = num;
			next = null;
		}
	}

	public static void insert(int num) {
		Node tmp = new Node(num);
		if (head == null) {
			head = tmp;
		} else {
			Node p = head;
			while (p.next != null) {
				p = p.next;
			}
			p.next = tmp;
		}
	}

	public static void display() {
		if (head == null) {
			System.out.println("empty list");
		} else {
			Node p = head;
			while (p != null) {
				System.out.print(p.prime + "->");
				p = p.next;
			}
			System.out.println("null");
		}
	}

	public static void prime(int num) {

		for (int i = 2; i <= num; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				insert(i);
		}
	}

	public static void main(String[] args) {
		prime(10000);
		display();
	}

}
