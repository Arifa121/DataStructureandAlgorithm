 package DSA;

import DSA.BinarySearchTree.Node;

public class AVLtree {
     class Node{
    	 int key;
    	 Node left,right;
    	 int height;
    	 Node(int val){
    		 key=val;
    		 left=null;
    		 right=null;
    		 height=0;   		 
    	 }
     }
     static Node root;
     AVLtree(int val){
    	 root=new Node(val);
     }
     AVLtree(){

    	 root=null;
     }
     public static int getheight(Node node){
    	 if(node==null)    //illadha nodeoda height -1; and leaf node height 0;
    		 return -1;
    	 return node.height;
     }
     public static int max(int a,int b) {
    	 return a>b?a:b;
     }
     public void insert(int val) {
    	 root=insert(root,val);
     }
     public Node insert(Node node,int val) {
    	 if(node==null)
    		 return new Node(val);
    	 else if(val<node.key)
    		node.left = insert(node.left,val);
    	 else if(val>node.key)
    		 node.right = insert(node.right,val);
    	 else
    		 return node;	//duplicate key not allowed to avoid duplicates
    	  
    	 node.height=1+max(getheight(node.left),getheight(node.right));
    	// if(val==40)
    	//	 System.out.println("the height of node "+node.key+" is updated as "+node.height);
    	int balfactor=getbalancefactor(node);
    	if(balfactor>1 && val < node.left.key) { //ll  case
    		return rightRotate(node);
    	}
    	if(balfactor>1 && val > node.left.key) { //lr case
    		node.left=leftRotate(node.left);
    		return rightRotate(node);
    	}
    	if(balfactor>1 && val > node.right.key) { //rr case  
    		return leftRotate(node);
    	}
    	if(balfactor>1 && val < node.right.key) { //rl case
    		node.right=rightRotate(node.right);
    		return leftRotate(node);
    	}
    	return node;
     }
     private static Node rightRotate(Node z) {
    	 Node y=z.left;
    	 Node t3=y.right;
    	 
    	 y.right=z;
    	 z.left=t3;
    	 
    	 z.height=1+max(getheight(z.left),getheight(z.right));
    	 y.height=1+max(getheight(y.left),getheight(y.right));
    	 
    	 return y;
     }
     private static Node leftRotate(Node z) {
    	 Node y=z.right;
    	 Node t3=y.left;
    	 
    	 y.left=z;
    	 z.right=t3;
    	 
    	 z.height=1+max(getheight(z.left),getheight(z.right));
    	 y.height=1+max(getheight(y.left),getheight(y.right));
    	 
    	 return y;
     }
     private static int getbalancefactor(Node node) {
    	 if(node==null)
    		 return 0;
    	 return getheight(node.left)-getheight(node.right);
     }
     public static void inorder (Node root) {
     	if(root!=null) {
     	    inorder(root.left);
     	    System.out.println(root.key+" "+"height is "+root.height); 
     	    inorder(root.right);
     }
     }
     public static void delete(int val) {
    	 root=delete(root,val);
     }
     public static Node delete(Node node,int val) {
    	 if(node==null) //illadha  nodeai theda solli tharaanga so recursion stop panraku end condition
			 return root;
		 
		 if(val<node.key) //proper value tharanga val root vida chinnadhuna left side focus panrom
			node.left=delete(node.left,val);
		 
		 else if(val>node.key)
			 node.right=delete(node.right,val);
		 
		 else {
			 //delete panna vendiya node ku one child irukku or leaf node delete panna 
			 if(node.right==null)
				 return node.left;
			 else if(node.left==null)
				 return node.right;
			 
			 // delete panna vendiya node ku two child irukku 
			 else {
				 node.key=min(node.right);
				 node.right=delete(node.right,node.key);
			 }
		 }
		 if(node==null)
			return node;
		 node.height=1+max(getheight(node.left),getheight(node.right));
		 int balancefactor=getbalancefactor(node);
		 if(balancefactor>1 && val < node.left.key) { //ll  case
	    		return rightRotate(node);
	    	}
	    	if(balancefactor>1 && val > node.left.key) { //lr case
	    		node.left=leftRotate(node.left);
	    		return rightRotate(node);
	    	}
	    	if(balancefactor>1 && val > node.right.key) { //rr case  
	    		return leftRotate(node);
	    	}
	    	if(balancefactor>1 && val < node.right.key) { //rl case
	    		node.right=rightRotate(node.right);
	    		return leftRotate(node);
	    	}
		 return node;
     }
     public static int min(Node root) {
		 int minval=root.key;
		 while(root.left!=null) {
			minval=root.key;
			root=root.left;
		 }
		 return minval;
	 }
}
