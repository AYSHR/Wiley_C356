package datastruc;

class node{
	int data;
	node left,right;
	public node(int x){
		data=x;
		left=right=null;
	}
}
public class balancedbinarytree {
	node root;
	
	public static void inorder( node  root2) {
		if(root2==null) {
			return;
		}
		inorder(root2.left);
		System.out.println(root2.data);
		inorder(root2.right);
	}
	
	public static void main(String[] args) {
		balancedbinarytree tree=new balancedbinarytree();
		tree.root=new node(1);
		tree.root.left=new node(2);
		tree.root.right=new node(3);
		tree.root.left.right=new node(5);
		tree.root.left.left=new node(4);
           inorder(tree.root);
	}

}
