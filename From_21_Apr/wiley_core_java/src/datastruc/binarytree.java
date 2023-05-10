package datastruc;
class field{
	int data;
	field left,right;
	public field(int x){
		data=x;
		left=right=null;
	}
}
public class binarytree {
	nodeclass root;
	
	public static void inorder(nodeclass root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static void preorder(nodeclass root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(nodeclass root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}

	public static void main(String[] args) {
		binarytree tree=new binarytree();
		tree.root=new nodeclass(1);
		tree.root.left=new nodeclass(12);
		tree.root.right=new nodeclass(9);
		tree.root.left.right=new nodeclass(5);
		tree.root.left.left=new nodeclass(6);
		
	inorder(tree.root);
	System.out.println();
	preorder(tree.root);
	System.out.println();
	postorder(tree.root);

	}

}
