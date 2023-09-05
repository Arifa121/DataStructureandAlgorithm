package DSA;

public class AVLtreedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVLtree avl=new AVLtree(10);
		System.out.println("-----after inserting 10----");
		avl.inorder(avl.root);
		avl.insert(9);
		System.out.println("-----after inserting 9----");
		avl.inorder(avl.root);
		avl.insert(8);
		System.out.println("-----after inserting 8----");
		avl.inorder(avl.root);
		avl.insert(6);
		System.out.println("-----after inserting 6----");
		avl.inorder(avl.root);
		System.out.println("-----after inserting 7----");
		avl.insert(7);
		avl.inorder(avl.root);
		avl.insert(3);
		System.out.println("-----after inserting 3----");
		avl.inorder(avl.root);
		avl.insert(4);
		System.out.println("-----after inserting 4----");
         avl.inorder(avl.root);
        //avl.delete(40);
        //System.out.println("-----after deleting 40----");
       // avl.inorder(avl.root);
        //System.out.println("-----after inserting 40----");
        //avl.insert(40);
       // avl.inorder(avl.root);
        
        //System.out.println("-----after inserting 35----");
        //avl.insert(35);
       // avl.inorder(avl.root);
		avl.insert(12);
		System.out.println("-----after inserting 12----");
		avl.inorder(avl.root);
		avl.insert(11);
		System.out.println("-----after inserting 11----");
		avl.inorder(avl.root);
		avl.insert(14);
		System.out.println("-----after inserting 14----");
		avl.inorder(avl.root);
		avl.insert(15);
		System.out.println("-----final----");
		avl.inorder(avl.root);
	}

}
