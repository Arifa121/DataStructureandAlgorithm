package DSA;


public class BinarySearchTree {
	static Node root;
	class Node{
		int key;
		Node left,right;
        Node(int val){
        	key=val;
        	left=right=null;
        }
	}
	BinarySearchTree(int val){
		root=new Node(val);
	}
	BinarySearchTree(){
		root=null;
	}
	public void inserts(int val) {
		root=insert(root,val);
	}
    public Node insert(Node root,int val) {
    	if(root==null) 
    		return new Node(val);
    	
    	if(root.key>val) 
    		root.left=insert(root.left,val);
    	else
    		root.right=insert(root.right,val);
    	
    	return root;
    }
    public static void inorder (Node root) {
    	if(root!=null) {
    	    inorder(root.left);
    	    System.out.print(root.key+" ");
    	    inorder(root.right);
    }
    }  
    public Node search(Node root,int val) {
    	if(root==null||root.key==val)
    		return root;
    	if(val<root.key)
    		return search(root.left,val);
    		
    	return search(root.right,val);
    	
    }
    public static void delete(int val) {
    	root=delete(root,val);
    }
    private static Node delete(Node root,int val) {
		 if(root==null) //illadha  nodeai theda solli tharaanga so recursion stop panraku end condition
			 return root;
		 
		 if(val<root.key) //proper value tharanga val root vida chinnadhuna left side focus panrom
			root.left=delete(root.left,val);
		 
		 else if(val>root.key)
			 root.right=delete(root.right,val);
		 
		 else {
			 //delete panna vendiya node ku one child irukku or leaf node delete panna 
			 if(root.right==null)
				 return root.left;
			 else if(root.left==null)
				 return root.right;
			 
			 // delete panna vendiya node ku two child irukku 
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
