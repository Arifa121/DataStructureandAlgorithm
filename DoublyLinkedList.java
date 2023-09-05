package DSA;
import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T>{

	    Node head;
	    Node tail;
		private boolean yes;
	    class Node{
		   T data;
		   Node prev;
		   Node next;
		   
		   Node(T val){
		    	data=val;
		    	prev=null;
		    	next=null;
		    }
	    }
	   
	    DoublyLinkedList(){
	    	head=null;
	    	tail=null;
	    }
	    public void insertAtBeginning(T val) {
	    		Node newnode=new Node(val);
	    		newnode.next=head;
	    		if(head==null) {  
	                 tail=newnode;
	        	}else {
	        		 head.prev=newnode;
	        		 //newnode.next=head;
	        	}
	    	head=newnode;
	    }
	    public void display() {
	    	if(head==null) {
	        	System.out.println("list is empty");
	    	}
	    	Node temp=head;
	    	while(temp!=null) {
	    		System.out.print(temp.data + " ");
	    	    temp=temp.next;
	    	}
	    	System.out.println();
	    	
	    	
	    }
	    public void revdisplay() {
	    	if(head==null) {
	        	System.out.println("list is empty");
	    	}
	    	Node temp=tail;
	    	while(temp!=null) {
	    		System.out.print(temp.data + " ");
	    	    temp=temp.prev;
	    	}
	    	System.out.println();
	    	
	    }
	    public void insertAtpos(int pos,T val) {
	    	
	    	if(pos==0) {
	    		insertAtBeginning(val);
	    		return;  
	    	}
	    	else {
	    		Node newnode=new Node(val);
	    		Node temp=head;
	    		for(int i=1;i<pos;i++) {
	    			temp=temp.next; 
	    			if(temp==null) {
	    				//throw new IndexOutOfBoundsException(("invalid Position "+pos));
	    				System.out.println("invalid position");
	    				return;
	    			}
	    		}
	    		
	    		newnode.next=temp.next;
	    		newnode.prev=temp;
	    		if(temp==tail)
	    			tail=newnode;
	    		else
	    		   temp.next.prev=newnode;
	    		temp.next=newnode;  
	    	
	    	}
	    }
	    public void deleteAtpos(int pos) {
	    	if (head ==null) {
	    		System.out.println("List is emptly unable to delete");
	    		return;
	    	}
	    	if(pos==0) {
	    		deleteAtbeginning();
	    		return; 
	    	}
	    	Node temp=head;
	    	Node prev=null;
	    	for(int i=1;i<=pos;i++) {
	    		prev=temp;
	    		temp=temp.next;
	    		if(temp==null) {
	    			System.out.println("invalid position unable to delete");
					return;
	    		}
	    	}
	    	prev.next=temp.next;
	    	if(temp.next==null) 
	    		tail=prev;
	    	else
	    		temp.next.prev=prev;
	    	
	    }
	    public void deleteAtbeginning() {
	    	if(head==null) {
	    		throw new IndexOutOfBoundsException("Deletion attempted on empty list");
	    	}
	    	head=head.next;
	    	
    		if(head==null)
    			tail=null;
    		else		
    			head.prev=null; 
	    }
	    public void deleteAtend() {
	    	Node temp=head;
	    	Node prev=null;
	    	if(head==null) {
	    		throw new IndexOutOfBoundsException("Deletion attempted on empty list");
	    	}
	    	while(temp.next!=null) {
	    		prev=temp;
	    		temp=temp.next;
	    	}
	    	prev.next=null;
	    	tail=prev; 
	    }
	    public void get(int index) {
	    	Node temp=head;
	    	if(head==null) {
	    		System.out.println("List is emptly");
	    		return;
	    	}
	    	for(int i=1;i<=index;i++) {
	    		temp=temp.next;
	    		if(temp==null) {
	    			System.out.println(index+" is an Invalid index");
					return;
	    			//throw new IndexOutOfBoundsException("Deletion attempted on empty list");
	    		}
	    	}
			System.out.println("Data at index "+index+ " is "+temp.data );
	    	
	    }
	    public void update(int index,T val) {
	    	Node temp=head;
	    	for(int i=1;i<=index;i++) {
	    		temp=temp.next;
	    	}
	    	temp.data=val;
	    }
	    public void insertAtEnd(T val) {
	    	Node temp=head;
	    	if(head==null) {
	    		insertAtBeginning(val);
	    		return;  
	    	}
	    	
	    	else {
	    		
	    		Node newnode=new Node(val);	
	    		while(temp.next!=null) {
	    			temp=temp.next;
	    		}
	    		temp.next=newnode;
	    	}
	    }
	    public void search(T val) {
	    	Node temp=head;
	    	int count=0;
	    	while(temp!=null) {
	    		if(temp.data==val) {
	    			System.out.println(val+ " Data found at index "+ count);
	    			return;
	    			
	    		}
	    		count++;
	    		temp=temp.next;
	    	}
	    	System.out.println( "Data not found ");
	    }
	    public int length() {
	    	Node temp=head;
	    	int count=0;
	    	while(temp!=null) {
	    		temp=temp.next;
	    		count++;
	    	}
	    	return count;
	    }
	    public boolean iscontains(T val) {
	    	Node temp=head;
	    	yes = true;
	    	boolean no=false;
	    	while(temp!=null) {
	    		if(temp.data==val) {
	    			return yes;
	    		}
	    		temp=temp.next;
	    	}
			return no;
	    }
	    
	    public void reverse() {
	    	Node prev=null;
	    	Node current=head;
	    	Node next=head.next;
	    	while(current!=null) {
	    		next=current.next;
	    		current.next=prev;
	    		prev=current;
	    		current=next;
	    	}
	    	head=prev;
	    }
	    //class customIterator implements Iterator 
	    
	    public Iterator<T> iterator(){
	    	return new Iterator<T>() {
	    		Node temp=head;
	    		public boolean hasNext() {
	    			  return temp!=null;
	    		}
	    		public T next() {
	    			T val = temp.data;
	    			temp=temp.next; 
	    			return val;
	    		}
	    	};
	    }
	}

	
	

