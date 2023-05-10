package datastruc;

class nodeclass{
	int data;
	nodeclass left,right;
	public nodeclass(int x){
		data=x;
		left=right=null;
	}
}

public class fullbinarytree {
	nodeclass root;
	
	boolean isFullBinaryTree(nodeclass root) {
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
			return true;
		if(root.left!=null && root.right!=null)
			return (isFullBinaryTree(root.left) && isFullBinaryTree(root.left));
		
		return false;
	}
	

	public static void main(String[] args) {
		fullbinarytree tree=new fullbinarytree();
		tree.root=new nodeclass(1);
		tree.root.left=new nodeclass(12);
		tree.root.right=new nodeclass(9);
		tree.root.left.right=new nodeclass(5);
		tree.root.left.left=new nodeclass(6);
		
		System.out.println("given tree is a full binary tree :" +tree.isFullBinaryTree(tree.root));
	}
	

}
