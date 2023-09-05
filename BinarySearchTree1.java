package DSA;

import DSA.BinarySearchTree.Node;

public class BinarySearchTree1 {
	Node root;
	class Node{
		int key;
		Node left,right;
        Node(int val){
        	key=val;
        	left=right=null;
        }
	}
	BinarySearchTree1(int val){
		root=new Node(val);
	}
	BinarySearchTree1(){
		root=null;
	}
	public void insert(int val) {
		Node newnode=new Node(val);
		  if(root==null) {
			  root=newnode;
		      return;
		  }
		  Node parent=null;
		  Node current=root;
		  while(current!=null) {
			  parent=current;
			  if(val<current.key) {
				  current=current.left;
			  }else {
			     current=current.right;		   
		      }
		  }
			  if(val<parent.key) {
				  parent.left=newnode;
			  }
			  else {
				  parent.right=newnode;  
			  }	  
	}
	 public static void inorders(Node root) {
	    	if(root!=null) {
	    	    inorders(root.left);
	    	    System.out.print(root.key+" ");
	    	    inorders(root.right);
	    }
    }
	 public Node search(int val) {
		 Node temp=root;
		 while(temp!=null) {
			 if(temp.key==val) {
				 return temp;
			 }else if(val<temp.key) {
				 temp=temp.left;
			 }else {
				 temp=temp.right;
			 }
		 }
		 return null;
	 }
	 public static Node delete(Node root,int val) {
		 if(root==null)
			 return root;
		 if(val<root.key)
			root.left=delete(root.left,val);
		 else if(val>root.key)
			 delete(root.right,val);
		 else {
			 if(root.right==null)
				 return root.left;
			 else if(root.left==null)
				 return root.right;
			 else {
				 root.key=min(root.right);
				 root.right=delete(root.right,root.key);
			 }
		 }
		 return root;
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
