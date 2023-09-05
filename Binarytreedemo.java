package DSA;

public class Binarytreedemo {
	public static void main(String args[]) {
		Binarytree btree=new Binarytree(10);
		btree.insertleft(btree.root,5);
		btree.insertright(btree.root,15);
		btree.insertleft(btree.root.left,3);
		btree.insertright(btree.root.left,8);
		btree.insertleft(btree.root.right,12);
		Binarytree.preorder(btree.root);
		System.out.println();
		Binarytree.inorder(btree.root);
		System.out.println();
		Binarytree.postorder(btree.root);
		System.out.println();
		
	}

}
