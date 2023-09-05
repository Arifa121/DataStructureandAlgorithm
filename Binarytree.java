package DSA;

public class Binarytree {
     class Node{
    	 int data;
    	 Node left;
    	 Node right;
    	 public Node(int d) {
    		 data=d;
    		 left=null;
    		 right=null;
    	 }
     }
     Node root;
     Binarytree(int d){
    	root = new Node(d);
     }
     public void insertleft(Node r,int val) {
    	 Node newnode=new Node(val);
    	 r.left=newnode;
     }
     public void insertright(Node r,int val) {
    	 Node newnode=new Node(val);
    	 r.right=newnode;
     }
     public static void preorder(Node root) {
    	 if(root!=null) {
    	    System.out.print(root.data+" ");
    	    preorder(root.left);
    	    preorder(root.right);
         } 
     }
     public static void inorder(Node root) {
    	 if(root!=null) {
    	    
    	    inorder(root.left);
    	    System.out.print(root.data+" ");
    	    inorder(root.right);
         } 
     } 
     public static void postorder(Node root) {
    	 if(root!=null) {
    	    
    	    postorder(root.left);
    	    postorder(root.right);
    	    System.out.print(root.data+" ");
         } 
     } 
	
}
