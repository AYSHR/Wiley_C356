package datastruc;

import java.util.*;

class Queuenode{
	 tree node;
	  int hd;
	   Queuenode(tree node,int hd) {
		this.node=node;
		this.hd=hd;
	}
 }

 class tree{
	  int data;
	  tree left,right;
	  tree(int x){
		  data=x;
		  left=right=null;
	  }
}

public class topviewbinarytree {
  
  
	public static void main(String[] args) {
	
		tree root=new tree(1);
		root.left=new tree(2);
		root.right=new tree(3);
		root.left.left=new tree(4);
		root.left.right=new tree(5);
		root.left.right.left=new tree(7);
		root.right.right=new tree(6);
		
		System.out.println("binary tree  "+"\n"
	     		+ "        1\r\n"
	     		+ "       / \\\r\n"
	     		+ "      2   3\r\n"
	     		+ "     / \\   \\\r\n"
	     		+ "    4   5   6\r\n"
	     		+ "         \\\r\n"
	     		+ "          7");
		System.out.println("top-view of binary tree");
          topview(root);
     
}
	public static void topview(tree root) {
		 Map<Integer,Integer> map=new TreeMap<>();
		 Queue<Queuenode> q=new LinkedList<>();
		 
		 q.add(new Queuenode(root, 0));
 
		 while (!q.isEmpty()) {
	            Queuenode curr = q.poll();
	            if (!map.containsKey(curr.hd)) {
	                map.put(curr.hd, curr.node.data);
	            }

	            if (curr.node.left != null) {
	                q.add(new Queuenode(curr.node.left, curr.hd - 1));
	            }

	            if (curr.node.right != null) {
	                q.add(new Queuenode(curr.node.right, curr.hd + 1));
	            }
		 }
		 
		 for (int val : map.values()) {
	            System.out.print(val + " ");
	        } 
		
	}
	}


