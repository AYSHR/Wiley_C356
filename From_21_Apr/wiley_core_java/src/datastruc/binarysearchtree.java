package datastruc;

public class binarysearchtree {
	static Node root;

	static class Node {
		Node left, right;
		int data;

		Node(int x) {
			data = x;
			left = right = null;
		}
	}

	static boolean search(Node root, int x) {
		if (root == null)
			return false;
		if (root.data == x)
			return true;
		if (root.data > x)
			return search(root.left, x);

		return search(root.right, x);
	}

	public static Node insert(Node root,int x) {
		if(root==null) {
			root=new Node(x);
			System.out.println("inserted "+x);
	      return root;
		}
		else if(root.data>x) {
		root.left=insert(root.left,x);
		}
		else {
		root.right=insert(root.right,x);
		}
		return root;
	}
	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(3);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(6);
		root.right.right = new Node(14);
		root.left.right.left = new Node(4);
		root.left.right.right = new Node(7);

		System.out.println("is value 4 present in BST: " + search(root, 4));
        
		insert(root,15);
        insert(root,12);
        System.out.println("is 15 present :"+search(root,15));
        System.out.println("is 12 present :"+search(root,12));
	}

}
