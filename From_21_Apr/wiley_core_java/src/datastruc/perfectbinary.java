package datastruc;

public class perfectbinary {

	static class node{
		int data;
		node left,right;
		public node(int x){
			data=x;
			left=right=null;
		}
	}
	
	static int depth(node root) {
		int d=0;
		while(root!=null) {
			d++;
			root=root.left;
		}
		return d;
	}
	
	static boolean isperfect(node root,int depth,int level) {
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
			return  (depth==level+1);
		if(root.left==null || root.right==null)
			return  false;
		
		return (isperfect(root.left,depth,level+1) && isperfect(root.right,depth,level+1));
	}
	
	//wrapper func
	static boolean isperfect(node root) {
		int d=depth(root);
		return isperfect( root, d,0);
	}
	
	public static void main(String[] args) {
     node root=new node(1);	
     root.left=new node(2);
    root.right=new node(3);
    root.left.left=new node(4);
    root.left.right=new node(5);
    root.right.left=new node(6);
    root.right.right=new node(7);
    
    System.out.println("given tree is perfect binary tree :"+ isperfect(root));

	}

}
