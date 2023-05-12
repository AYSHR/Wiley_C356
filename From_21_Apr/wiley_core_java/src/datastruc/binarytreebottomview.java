package datastruc;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Queuenode1{
	 tree1 node;
	  int hd;
	   Queuenode1(tree1 node,int hd) {
		this.node=node;
		this.hd=hd;
		
	}
 }

 class tree1{
	  int data;
	  tree1 left;
	tree1 right;
	  tree1(int x){
		  data=x;
		  left=right=null;
	  }
}
public class binarytreebottomview {

	public static void main(String[] args) {
		tree1 root=new tree1(1);
		root.left=new tree1(2);
		root.right=new tree1(3);
		root.left.left=new tree1(4);
		root.left.right=new tree1(5);
		root.left.right.left=new tree1(7);
		root.right.right=new tree1(6);
		
		System.out.println("binary tree  "+"\n"
	     		+ "        1\r\n"
	     		+ "       / \\\r\n"
	     		+ "      2   3\r\n"
	     		+ "     / \\   \\\r\n"
	     		+ "    4   5   6\r\n"
	     		+ "         \\\r\n"
	     		+ "          7");
		System.out.println("bottom-view of binary tree");
          bottomview(root);
	}
	
	public static void bottomview(tree1 root) {
		 Map<Integer,Integer> map=new TreeMap<>();
		 Queue<Queuenode1> q=new LinkedList<>();
		 
		 q.add(new Queuenode1(root, 0));

		 while (!q.isEmpty()) {
	            Queuenode1 curr = q.poll();
	                map.put(curr.hd, curr.node.data);
	            
	            if (curr.node.left != null) {
	                q.add(new Queuenode1(curr.node.left, curr.hd - 1));
	            }

	            if (curr.node.right != null) {
	                q.add(new Queuenode1(curr.node.right, curr.hd + 1));
	            }
		 }
		 
		 for (int val : map.values()) {
	            System.out.print(val + " ");
	        } 
		
	}
}
