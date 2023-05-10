package datastruc;

public class completebinarytree {
  static Node root;
	 static class Node{
		 Node left,right;
		 int data;
		 Node(int x){
			 data=x;
			 left=right=null;
		 }
	 }
	 
	 static int countnode(Node root) {
		 if(root==null)
			 return 0;
		return (1+countnode(root.left)+countnode(root.right));
	 }
	 
	 static boolean iscomplete(Node root, int index ,int nodecount) {
		 if(root==null)
			 return true;
		 if(index >=nodecount)
			 return false;
		 
		 return (iscomplete(root.left, 2*index+1 ,nodecount) &&
				 iscomplete(root.left, 2*index+2 ,nodecount) 
				 );
	 }
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		int count=countnode(root);
		System.out.println("is given tree a complete binary tree: "+iscomplete(root,0,count));

	}

}
