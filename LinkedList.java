package DSA;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{

    Node head;
    class Node{
	   T data;
	   Node next;
	   
	   Node(T val){
	    	data=val;
	    	next=null;
	    }
    }
   
    LinkedList(){
    	head=null;
    }
    public void insertAtBeginning(T val) {
    		Node newnode=new Node(val);
    		if(head==null) {
                 head=newnode; 
        	}else {
        		 newnode.next=head;
         	     head=newnode;
        	}
    	   
    }
    public void display() {
    	Node temp=head;
    	while(temp!=null) {
    		System.out.print(temp.data + " ");
    	    temp=temp.next;
    	}
    	if(head==null) {
        	System.out.print("list is empty");
    	}
    	System.out.println();
    }
    public void insertAtpos(int pos,T val) {
    	
    	if(head==null) {
    		insertAtBeginning(val);
    		return;  
    	}
    	else {
    		Node newnode=new Node(val);
    		Node temp=head;
    		for(int i=1;i<pos;i++) {
    			temp=temp.next; 
    			if(temp==null) {
    				System.out.println("invalid position");
    				return;
    			}
    		}
    		newnode.next=temp.next;
    		temp.next=newnode;    		
    	}
    }
    public void deleteAtpos(int pos) {
    	if (head ==null) {
    		System.out.println("List is emptly");
    		return;
    	}
    	if(pos==0) {
    		head=head.next;
    		return;
    	}
    	Node temp=head;
    	Node prev=null;
    	for(int i=1;i<=pos;i++) {
    		prev=temp;
    		temp=temp.next;
    		if(temp==null) {
    			System.out.println("invalid position");
				return;
    		}
    	}
    	prev.next=temp.next;
    	
    }
    public void deleteAtbeginning() {
    	if(head==null) {
    		throw new IndexOutOfBoundsException("Deletion attempted on empty list");
    	}
    	head=head.next;
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
    public boolean iscontains(T val) {
    	Node temp=head;
    	boolean yes=true;
    	boolean no=false;
    	while(temp!=null) {
    		if(temp.data==val) {
    			return true;
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
    public void revsearchelebyindex(int pos) {
    	Node temp=head;
    	int count=0;
    	while(temp!=null) {
    		count++;
    		temp=temp.next;
    	}
    	temp=head;
    	int s=count-pos;
    	if(s<0) {
    		System.out.println("invalid index ");
    		return;
    	}
    	else {
    		for(int i=0;i<s;i++) {
    			temp=temp.next;
    		}
    	}
    	System.out.println("element in that position is "+temp.data);
    }
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
