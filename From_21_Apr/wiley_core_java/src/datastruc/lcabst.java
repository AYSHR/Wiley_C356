package datastruc;

public class lcabst {
   
	static class tree{
		int data;
		tree left,right;
		tree(int x){
			data=x;
		}
	}
	
	public static tree lcasearch(tree root,int p, int q) {
		if(root==null) {
			return null;
		}
		else if(root.data > p && root.data > q) {
			return lcasearch(root.left, p, q);
		}else if(root.data < p && root.data < q) {
			return lcasearch(root.left, p, q);
		}
		return root;
	}
	public static void main(String[] args) {
		
		tree root=new tree(6);
		root.left=new tree(2);
		root.right=new tree(8);
		root.left.left=new tree(0);
		root.left.right=new tree(4);
		root.left.right.left=new tree(3);
		root.left.right.right=new tree(3);
		root.right.left=new tree(7);
		root.right.right=new tree(9);
		
		tree res=lcasearch(root,2,4);
		System.out.println("the lowest common ancestor of 2 and 4 :"+res.data);
	}

}
