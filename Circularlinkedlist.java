package DSA;

public class Circularlinkedlist<T> {
	Node last;
	class Node{
		T data;
		Node next;
		Node(T val){
			data=val;
			next=null;
		}
	}
	Circularlinkedlist(){
		last=null;
	}
	public void insertAtBeginning(T val) {
		Node newnode=new Node(val);
		if(last==null) {
			newnode.next=newnode;
			last=newnode;
		}
		else {
			newnode.next=last.next;
			last.next=newnode;
		}
		
	}
	public void insertAtEnd(T val) {
		Node newnode=new Node(val);
		if(last==null) {
			newnode.next=newnode;
			last=newnode;
		}
		else {
			newnode.next=last.next;
			last.next=newnode;
			last=newnode;
		}
		
	}
	public void display() {
		if(last==null) {
			System.out.println("empty list");
			return;
		}
		Node temp=last.next;	
		do{
			System.out.print(temp.data + " ");
			temp=temp.next;
		}while(temp!=last.next);
		System.out.println();
	}
	public T deleteAtBegin() {
		Node temp=last.next;
		if(last==null) {
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		}
		else if(last.next==last) {
			last=null;
			return temp.data;
		}
		else {
		  //Node temp=last.next;
		  last.next=temp.next;
		  return temp.data;
	   }
	}
	public T deleteAtEnd() {  
		if(last==null) {
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		}
		Node temp=last.next;
		Node prev=null;
		if(temp==last) {
			last=null;
			return temp.data;
		}
		else {
			while(temp!=last) {
				prev=temp;
				temp=temp.next;
			}
			prev.next=last.next;
			last=prev;
		}
		return temp.data; 
	}
	public void deleteVal(T val) {
		if(last==null) {
			System.out.println("list is empty unable to delete the val");
		}
		Node temp=last;
		int count=0;
		if(last==last.next) {
			if(val==temp.data) {
				last=null;
				count++;
			    return;
			}
			else {
				System.out.println("The given value is not present in list");
				return;
			}
			   
		}
		Node prev=null;
		while(temp.data!=val) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
		count++;
		if(temp==last) {
			last=prev;
		}
		if(count==0) {
			System.out.println("The given value is not present in list");
		}
	}
	public void insertAfter(T pos,T val) {
		if(last==null) {
			System.out.println("list is empty, no element is present in list");
			return;
		}
		else {
		    Node newnode=new Node(val);
		}
	/*    Node temp=last;
		Node prev=null;
		if(temp==temp.next) {
			newnode.next=temp;
			last.next=newnode;
			last=newnode;
		}
		while(temp.data!=pos) {
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		if(temp==last) {
			last=newnode;
		}
		*/
	}
}
