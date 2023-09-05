package DSA;

public class BinarySearchTreedemo {

	public static void main(String[] args) {
		BinarySearchTree bst1=new BinarySearchTree(50);
	    bst1.inserts(20);
	    bst1.inserts(10);
	    bst1.inserts(10);
	    bst1.inserts(70);
	    bst1.inserts(80);
	    bst1.inserts(95);
	    BinarySearchTree.inorder(bst1.root);
	    System.out.println();
	    if(bst1.search(bst1.root, 70)==null) {
	    	System.out.println("not found");
	    }else {
	    	 System.out.println("found");
	    }
	    if(bst1.search(bst1.root, 40)==null) {
	    	System.out.println("not found");
	    }else {
	    	 System.out.println("found");
	    }
	    bst1.delete(50);
	    bst1.inorder(bst1.root);
	    System.out.println();
	    bst1.delete(40);
	    bst1.inorder(bst1.root);
	    System.out.println();
	    BinarySearchTree1 bst2=new BinarySearchTree1(50);
	    bst2.insert(20);
	    bst2.insert(10);
	    bst2.insert(25);
	    bst2.insert(70);
	    bst2.insert(80);
	    bst2.insert(95);
	    BinarySearchTree1.inorders(bst2.root);
	    if(bst2.search(70)==null) {
	    	System.out.println("not found");
	    }else {
	    	 System.out.println("found");
	    }
	    if(bst2.search(90)==null) {
	    	System.out.println("not found");
	    }else {
	    	 System.out.println("found");
	    }
	}

}
